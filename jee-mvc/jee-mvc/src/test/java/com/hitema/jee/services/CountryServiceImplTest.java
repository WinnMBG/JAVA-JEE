package com.hitema.jee.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class CountryServiceImplTest {

    @Autowired
    private CountryService service;
    private static final Logger log = LoggerFactory.getLogger(CountryServiceImpl.class);

    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void readAll() {
        service.readAll().forEach(c -> log.trace("{}", c));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}