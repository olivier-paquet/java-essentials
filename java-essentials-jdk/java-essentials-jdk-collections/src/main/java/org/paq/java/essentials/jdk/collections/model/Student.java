package org.paq.java.essentials.jdk.collections.model;

import java.time.LocalDate;

public class Student {
    private final String firstName;
    private final String lastName;

    //Stupid commit
    private final LocalDate birthDate;

    public Student(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
