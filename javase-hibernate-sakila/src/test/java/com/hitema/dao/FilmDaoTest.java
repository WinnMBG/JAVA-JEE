package com.hitema.dao;

import com.hitema.entities.Country;
import com.hitema.entities.Film;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FilmDaoTest {

    @Test
    @Order(1)
    void create() {
        FilmDaoImpl dao = new FilmDaoImpl();
        Film film = new Film();
        film.setTitle("MY MOVIE");
        film.setLanguageId(1L);
        film.setOriginalLanguageId(1L);
        film.setLastUpdate(LocalDateTime.now());
        dao.create(film);

        assertTrue(film.getId()!=null, "ERROR Whnile create COUNTRY");
    }

    @Test
    @Order(2)
    void get() {
        FilmDaoImpl dao = new FilmDaoImpl();
        Film film = dao.get(1L);
        assertTrue(film.getTitle().equals("ACADEMY DINOSAUR"), "ERROR no such film found...");
    }

    @Test
    @Order(3)
    void testSearchById() {
        FilmDaoImpl dao = new FilmDaoImpl();
        List<Film> films = dao.searchByFilm("PUNK");
        for (Film f: films) {
            System.out.println(f.toString());
        }
        assertTrue(films.size() == 4, "Error method doesn't work");
    }

    @Test
    @Order(4)
    void getAll() {
        FilmDaoImpl dao = new FilmDaoImpl();
        List<Film> films = dao.getAll();
        assertTrue(films.size() > 0, "ERROR no films...");
    }

    @Test
    @Order(5)
    void update() {
       FilmDaoImpl dao = new FilmDaoImpl();
       Film film = new Film();
       dao.update(1007L, "MY MOVIE 2.0");
       Film f = dao.get(1007L);
       assertTrue(f.getTitle().equals("MY MOVIE 2.0"), "ERROR no modification");
    }

    @Test
    @Order(6)
    void delete() {
        FilmDaoImpl dao = new FilmDaoImpl();
        dao.delete(1007L);
        List<Film> films = dao.getAll();
        assertTrue(films.size() == 1000, "ERROR no delete...");
    }
}