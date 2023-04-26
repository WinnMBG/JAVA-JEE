package com.hitema.dao;

import com.hitema.entities.Film;
import com.hitema.util.CrudDao;
import com.hitema.util.HibernateUtil;
import org.hibernate.Transaction;

import java.util.List;

public class FilmDaoImpl extends HibernateUtil implements CrudDao<Film, Long> {


    @Override
    public Film get(Long aLong) {
        return getCurrentSession().find(Film.class, aLong);
    }

    @Override
    public List<Film> getAll() {
        return getCurrentSession().createQuery("from Film", Film.class).getResultList();
    }

    @Override
    public void delete(Long l) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        Film f =getCurrentSession().get(Film.class, l);
        getCurrentSession().delete(f);
        t.commit();
    }

    @Override
    public void create(Film film) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        getCurrentSession().save(film);
        t.commit();
    }

    @Override
    public void update(Long l, String title) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        Film f = getCurrentSession().get(Film.class, l);
        f.setTitle(title);
        getCurrentSession().save(f);
        t.commit();
    }
}
