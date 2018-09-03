package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private CityMapper mapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFindCityById() {
        City city = mapper.findByState("China");
        assertNotNull(city);
    }

    @Test
    public void testCreateCity() {
        City stockholm = new City(100,"Stockholm","Sweden","SE");
        mapper.createCity(stockholm);
        City city = mapper.findByState("Sweden");
        assertEquals("Stockholm",city.getName());
        assertEquals("SE",city.getCountry());
    }


}
