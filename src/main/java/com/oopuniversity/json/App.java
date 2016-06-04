package com.oopuniversity.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oopuniversity.json.model.AnotherPerson;
import com.oopuniversity.json.model.Person;

import java.io.IOException;

/**
 * Created by OOP University on 6/3/2016.
 */
public class App {
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.basicDemo();
        app.objectToObjectDemo();
    }

    public void basicDemo() throws IOException {
        Person p = new Person("Doe", "John");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRepresentation = objectMapper.writeValueAsString(p);
        System.out.println(jsonRepresentation);

        Person p2 = objectMapper.readValue(jsonRepresentation, Person.class);
        System.out.println(p2);
    }

    public void objectToObjectDemo() throws IOException {
        Person p = new Person("Doe", "John");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRepresentation = objectMapper.writeValueAsString(p);
        System.out.println(jsonRepresentation);

        AnotherPerson p2 = objectMapper.readValue(jsonRepresentation, AnotherPerson.class);
        System.out.println(p2);
    }

}
