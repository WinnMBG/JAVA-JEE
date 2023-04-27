package com.hitema;

import com.hitema.dao.CityDaoImpl;
import com.hitema.dao.CountryDaoImpl;
import com.hitema.entities.City;
import com.hitema.entities.Country;
import com.hitema.util.HibernateUtil;

import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try (var session = HibernateUtil.openCurrentSession()) {
            if (session == null) {
                System.err.println("Erreur ouverture de Session");
                System.exit((-1));
            }
        }
        CountryDaoImpl countryDao = new CountryDaoImpl();
        List<Country> countries = countryDao.getAll();
        for (Country country : countries) {
            CityDaoImpl cityDao = new CityDaoImpl();
            List<City> cities = cityDao.getAll();
            for (City city : cities) {
                //CityDaoImpl cityDao = new CityDaoImpl();
                //Country countrye = countryDao.get(1L);
                //CityDaoImpl cityDao = new CityDaoImpl();
                //City citye = cityDao.get(21L);
                City c = new City("Pristina", 577L);
                cityDao.create(c);

                Country cn = new Country("Congo", 577L);
                countryDao.create(cn);

                cityDao.update(80L, "New York");

                countryDao.update(577L, "Congoo");

            }
        }
    }
}