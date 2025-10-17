package com.example.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CityListTest {
    public CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    public City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });


    }
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        // This line checks if the first city in the cityList (retrieved by cityList.getCities().get(0))
        // is the same as the city returned by mockCity()
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        // Now the original city should be at position 1
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testDeleteCity(){
        CityList cityList =mockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        assertEquals(2,cityList.getCities().size());
        cityList.deleteCity(city);
        assertEquals(1,cityList.getCities().size());

    }

    @Test
    void testDeleteException(){
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });

    }

    @Test
    void testCountCity(){
        CityList cityList =mockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        City city2 = new City("Edmonton","Alberta");
        assertEquals(1,cityList.getCities().size());
        cityList.add(city);
        cityList.add(city2);
        assertEquals(3,cityList.countCities());



    }

    @Test
    void testHasCity(){
        CityList cityList =mockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        //This line checks if the city is in the cityList
        //Should return false since the city has not been added to the cityList
        assertEquals(false,cityList.hasCity(city));
        //Adds the city in the cityList
        cityList.add(city);
        //Checks if the city is in the cityList, should return trues since
        //it has been added
        assertEquals(true,cityList.hasCity(city));









    }
}
