package com.hitema.dao;

import com.hitema.entities.Country;
import com.hitema.entities.Film;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilmDaoTest {

    @Test
    void get() {
        FilmDaoImpl dao = new FilmDaoImpl();
        Film film = dao.get(1L);
        assertTrue(film.getTitle() == "ACADEMY DINOSAUR", "ERROR no such film found...");
    }

    @Test
    void getAll() {
        FilmDaoImpl dao = new FilmDaoImpl();
        List<Film> films = dao.getAll();
        assertTrue(films.size() > 0, "ERROR no films...");
    }

    @Test
    void delete() {
        FilmDaoImpl dao = new FilmDaoImpl();
        dao.delete(1001L);
        List<Film> films = dao.getAll();
        assertTrue(films.size() == 1000, "ERROR no delete...");
    }

    @Test
    void create() {
        FilmDaoImpl dao = new FilmDaoImpl();
        Film film = new Film();
        film.setTitle("MY MOVIE");
        film.setLastUpdate(LocalDateTime.now());
        dao.create(film);

        assertTrue(film.getId()!=null, "ERROR Whnile create COUNTRY");
    }

    @Test
    void update() {
       FilmDaoImpl dao = new FilmDaoImpl();
       Film film = new Film();
       dao.update(1001L, "MY MOVIE 2.0");
       Film f = dao.get(1001L);
       assertTrue(f.getTitle() == "MY MOVIE 2.0", "ERROR no modification");
    }
}