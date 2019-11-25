package com.company;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public void greet(Person person) {
        System.out.println("Hello");
    }

    //region Getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion
}
