package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
        * This is a class that keeps a list of city objects
*/

public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     * @throws IllegalArgumentException if the city already is inside
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);


    }

    /**
     * THis method sorts the list of cities
     * @return
     *     a sorted list
     */

    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;

    }



    /**
     * This method checks if there is a city in list
     * @param city
     * @return Boolean
     */

    public Boolean hasCity(City city){

        return cities.contains(city);

    }



    /**
     * This method deletes city in a list, if city not in list
     * throws and illegalArgumentException
     * @param city
     */
    public void deleteCity(City city){
        if (cities.contains(city)){
            cities.remove(city);
            return;
        }
        throw new IllegalArgumentException();


    }



    /**
     * This method counts the cities in th list
     * @return Boolean
     */
    public int countCities(){
        return cities.size();
    }

}

