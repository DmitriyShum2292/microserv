package com.example.fraud.model;

import java.util.Objects;

public class Customer {

    private Integer id;
    private String name;

    public Customer() {
    }

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer fraud = (Customer) o;
        return Objects.equals(id, fraud.id) && Objects.equals(name, fraud.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Fraud{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
