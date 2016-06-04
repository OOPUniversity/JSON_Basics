package com.oopuniversity.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by OOP University on 6/3/2016.
 */
public class AnotherPerson {
    @JsonProperty("givenName")
    private String firstName;
    @JsonProperty("surName")
    private String lastName;

    // This object has to be a Bean, which means it needs a no-argument constructor
    public AnotherPerson() {}

    public AnotherPerson(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
