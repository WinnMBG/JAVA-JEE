package com.hitema.dao;

import com.hitema.entities.Country;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CountryDaoTest {

    @Test
    void get() {
    }

    @Test
    void getAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void create() {
        CountryDaoImpl dao = new CountryDaoImpl();
        Country country = new Country();
        country.setCountry("Kossovo");
        country.setLastUpdate(LocalDateTime.now());
        dao.create(country);

        assertTrue(country.getId()!=null, "ERROR Whnile create COUNTRY");
    }

    @Test
    void update() {
        CountryDaoImpl dao = new CountryDaoImpl();
        var c = dao.get(1L);
        assertTrue(c.getCountry().equals("Afghanistan"), "ERROR DB seems to be corrupted");
    }
}