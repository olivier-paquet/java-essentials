package org.paq.java.essentials.jdk.collections.model;

import java.time.LocalDate;

public class Student {
    private final String firstName1;
    private final String lastName2;

    //Stupid commit
    private final LocalDate birthDate;

    public Student(String firstName, String lastName2, LocalDate birthDate) {
        this.firstName1 = firstName;
        this.lastName2 = lastName2;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName1 + '\'' +
                ", lastName='" + lastName2 + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
