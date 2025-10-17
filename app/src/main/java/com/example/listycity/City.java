package com.example.listycity;

import org.jspecify.annotations.NonNull;

/**
 * This class that defines a city
**/
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;

    }

    /**
     * THis method compares city
     * @param o the object to be compared.
     * @return 0, -1 or 1 if two values are equal, less than or greater than
     */

    @Override
    public int compareTo(@NonNull City o) {
        return this.city.compareTo(o.getCityName());
    }
}
