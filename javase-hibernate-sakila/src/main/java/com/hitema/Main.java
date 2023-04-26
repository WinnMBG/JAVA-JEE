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
        System.out.println("<<<<<Start Console MySql>>>>>");
        try (var session = HibernateUtil.openCurrentSession()) {
            if (session == null) {
                System.err.println("Erreur ouverture de Session");
                System.exit((-1));
            }
        }

        System.out.println("<<<<<READ ALL COUNTRIES>>>>>");
        CountryDaoImpl countryDao = new CountryDaoImpl();
        List<Country> countries = countryDao.getAll();
        for (Country country : countries) {
            System.out.println(country.toString());
        }

        System.out.println("\n");
        System.out.println("<<<<<READ ALL CITIES>>>>>");
        CityDaoImpl cityDao = new CityDaoImpl();
        List<City> cities = cityDao.getAll();
        for (City city : cities) {
            System.out.println(city.toString());
        }


        System.out.println("<<<<<READ ONE COUNTRY>>>>>");
        //CityDaoImpl cityDao = new CityDaoImpl();
        Country country = countryDao.get(1L);
        System.out.println(country.toString());


        System.out.println("<<<<<READ ONE CITY>>>>>");
        //CityDaoImpl cityDao = new CityDaoImpl();
        City city = cityDao.get(21L);
        System.out.println(city.toString());

        System.out.println("<<<<<<CREATE A CITY>>>>>>");
        City c = new City("Pristina", 577L);
        cityDao.create(c);

        System.out.println("<<<<<<CREATE A COUNTRY>>>>>>");
        Country cn = new Country("Congo", 577L);
        countryDao.create(cn);

        System.out.println("<<<<<<UPDATE A CITY>>>>>>");
        cityDao.update(80L, "New York");

        System.out.println("<<<<<<UPDATE A CITY>>>>>>");
        countryDao.update(577L, "Congoo");

        System.out.println("<<<<<End Console MySql>>>>>");
    }
}