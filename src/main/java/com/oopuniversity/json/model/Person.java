package com.oopuniversity.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by OOP University on 6/3/2016.
 */
public class Person {
    private String givenName;
    private String surName;

    // This object has to be a Bean, which means it needs a no-argument constructor
    public Person() {}

    public Person(String surName, String givenName) {
        this.surName = surName;
        this.givenName = givenName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
