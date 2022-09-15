/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.RestAPI;

/**
 *
 * @author j_kim10@uncg.edu
 */
public class Countries {
    private String country;
    private String abbreviation;

    public Countries(String country, String abbreviation) {
        this.country = country;
        this.abbreviation = abbreviation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.country = abbreviation;
    }
}
