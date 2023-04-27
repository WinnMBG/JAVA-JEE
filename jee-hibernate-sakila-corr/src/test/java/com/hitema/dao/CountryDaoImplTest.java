package com.hitema.dao;

import com.hitema.entities.Country;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountryDaoImplTest {

    private static final Logger log = LoggerFactory.getLogger(CountryDaoImplTest.class);
    static CountryDaoImpl countryDao ;
    static CityDaoImpl cityDao;


    @BeforeAll
    public static void beforeAll() {
        log.info("<<<<Instanciation DAO>>>>");
        countryDao = new CountryDaoImpl();
        cityDao = new CityDaoImpl();
    }


    @Test
    @Disabled("Le CREATE n'est pas nécessaire !!!!")
    public void create() {
        Country country = new Country();
        country.setCountry("Kossovo");
        country.setLastUpdate(LocalDateTime.now());
        countryDao.create(country);
        assertTrue(country.getId()!=null, "ERROR While create COUNTRY");
    }

    @Test
    @Order(1)
    public void getCitiesFromCountry() {
        assertNotNull(countryDao, "DAO NOT INSTANCED !!!");
        var c = countryDao.read(6l);
        assertTrue(c.getCountry().equals("Argentina"), "ERROR DB seems corrupted !!!!");
        assertTrue(c.getCities() != null, "ERROR DB seems corrupted !!!!");
        c.getCities().forEach(city -> log.trace(city.toString()));
    }

    @Test
    @Order(2)
    public void getCountryFromACity() {
        assertNotNull(cityDao, "DAO NOT INSTANCED !!!");
        var c = cityDao.read(494l);
        assertTrue(c.getCity().equals("Southampton"), "ERROR DB seems corrupted !!!!");
        assertTrue(c.getCountry() != null, "ERROR DB seems corrupted !!!!");
        log.trace(c.getCountry().toString());
    }


}