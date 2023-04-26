package com.hitema.dao;

import com.hitema.entities.City;
import com.hitema.entities.Country;
import com.hitema.util.CrudDao;
import com.hitema.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class CityDaoImpl extends HibernateUtil implements CrudDao<City, Long> {


    @Override
    public City get(Long id) {
        return getCurrentSession().find(City.class, id);
    }

    @Override
    public List<City> getAll() {
        return getCurrentSession().createQuery("from City", City.class).getResultList();
    }

    @Override
    public void delete(Long l) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        City s=getCurrentSession().get(City.class, l);
        getCurrentSession().delete(s);
        t.commit();
    }

    @Override
    public void create(City city) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        getCurrentSession().save(city);
        t.commit();
    }

    @Override
    public void update(Long l, String city) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        City s= getCurrentSession().get(City.class, l);
        s.setCity(city);
        getCurrentSession().save(s);
        t.commit();
    }
}
