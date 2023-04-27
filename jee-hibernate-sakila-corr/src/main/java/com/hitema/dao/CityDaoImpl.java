package com.hitema.dao;

import com.hitema.entities.City;
import org.hibernate.Transaction;

import java.util.List;

public class CityDaoImpl extends AbstractDao implements Dao<City, Long> {


    @Override
    public City create(City city) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        getCurrentSession().save(city);
        t.commit();
        return city;
    }

    @Override
    public City read(Long id) {
        return getCurrentSession().find(City.class, id);
    }

    @Override
    public void update(City entity) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        getCurrentSession().merge(entity);
        t.commit();
    }

    @Override
    public void delete(City entity) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        getCurrentSession().delete(entity);
        t.commit();
    }

    @Override
    public List<City> findAll() {
        return getCurrentSession().createQuery("from City", City.class).getResultList();
    }

}
