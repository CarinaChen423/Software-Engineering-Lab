package Lab6_E2;

class Employee {
    private String name;

    // Employee constructor
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}