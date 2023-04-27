package com.hitema;

import com.hitema.dao.CountryDaoImpl;
import com.hitema.entities.Country;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CountryDaoImpl countryDao = new CountryDaoImpl();
        countryDao.findAll().forEach(c-> System.out.println(c));
        Country country = new Country();
        country.setCountry("Monaco");
        country.setLastUpdate(LocalDateTime.now());
        var monaco = countryDao.create(country);
        var c = countryDao.read(monaco.getId());
        c.setCountry("Monacoco");
        countryDao.update(monaco);
        countryDao.delete(c);
    }
}