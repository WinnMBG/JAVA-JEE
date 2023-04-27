package com.hitema.dao;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FilmDaoImplTest {

    private static final Logger log = LoggerFactory.getLogger(FilmDaoImplTest.class);
    static FilmDaoImpl filmDao ;
    static ActorDaoImpl actorDao;

    /**
     * L'annotation beforeAll permet d'instacier un objet qui sera utilisé par tous les tests
     * Exemple : une DAO
     */
    @BeforeAll
    static void beforeAll(){
        log.info("<<<<Instanciation DAO>>>>");
        filmDao = new FilmDaoImpl();
        actorDao = new ActorDaoImpl();
    }

    @Test
        @Order(2)
            //@Disabled("Le READ n'est encore implementé !!!!")
    void create() {
        System.out.println("<<<<<CREATE FILM    >>>>>");
        System.out.println("<<<<<END CREATE FILM>>>>>");
    }


    @Test
        @Order(1)
    void getFilmFromActor() {
        log.info("<<<<<READ FILM>>>>>");
        assertNotNull(actorDao,"DAO NOT INSTANCED !!!");
        var actor = actorDao.read(35l);
        assertNotNull(actor,"WARNING FILM 1 not Found !!!");
        log.trace("L'acteur nommé {} {} a joué dans les films suivants:",actor.getFirstname(), actor.getLastname());
        actor.getFilms().forEach(f -> log.trace("{}", f));
        System.out.println("<<<<<END READ FILM>>>>>");
    }

    @Test
        @Order(2)
    void getActorsFromFilm() {
        log.info("<<<<<READ ACTORS>>>>>");
        assertNotNull(filmDao,"DAO NOT INSTANCED !!!");
        var film = filmDao.read(35l);
        assertNotNull(film,"WARNING FILM 1 not Found !!!");
        log.trace("Voici le casting du film {}", film.getTitle());
        film.getActors().forEach(f -> log.trace("{}", f));
        log.trace("<<<<<END ACTORS>>>>>");
    }
}