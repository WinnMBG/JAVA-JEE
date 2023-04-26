package com.hitema.dao;

import com.hitema.entities.Country;
import com.hitema.util.CrudDao;
import com.hitema.util.HibernateUtil;
import org.hibernate.Transaction;

import java.util.List;

public class CountryDaoImpl extends HibernateUtil implements CrudDao<Country, Long> {
    @Override
    public Country get(Long id) {
        return getCurrentSession().find(Country.class, id);
    }

    @Override
    public List<Country> getAll() {
        return getCurrentSession().createQuery("from Country", Country.class).getResultList();
    }

    @Override
    public void delete(Long l) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        Country s=getCurrentSession().get(Country.class, l);
        getCurrentSession().delete(s);
        t.commit();
    }

    @Override
    public void create(Country country) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        getCurrentSession().save(country);
        t.commit();
    }

    @Override
    public void update(Long aLong, String country) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        Country s= getCurrentSession().get(Country.class, aLong);
        s.setCountry(country);
        getCurrentSession().save(s);
        t.commit();
    }

}
