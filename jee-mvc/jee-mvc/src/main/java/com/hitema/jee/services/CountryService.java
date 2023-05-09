package com.hitema.jee.services;

import com.hitema.jee.entities.Country;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CRUD Interface
 */
public interface CountryService {
    Country create(Country country);

    Country read(Long id);

    List<Country> readAll();

    Country update(Country country);

    void delete(Long id);

}
