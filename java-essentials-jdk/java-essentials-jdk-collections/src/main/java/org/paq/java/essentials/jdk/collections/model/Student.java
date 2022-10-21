package org.paq.java.essentials.jdk.collections.model;

import java.time.LocalDate;

public class Student {
    private final String firstName1;
    private final String lastName;

    //Stupid commit
    private final LocalDate birthDate;

    public Student(String firstName, String lastName, LocalDate birthDate) {
        this.firstName1 = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName1 + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
