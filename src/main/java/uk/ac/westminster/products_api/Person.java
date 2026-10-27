package uk.ac.westminster.products_api;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private int id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public Person(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String calculateAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthDate, now);
        int years = period.getYears();

        return String.join(
                " ",
                "Person born in",
                this.birthDate.toString(),
                "is",
                String.valueOf(years),
                "old today"
        );
    }
}