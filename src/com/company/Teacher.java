package com.company;

public class Teacher extends Person {
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    public void explain() {
        System.out.println("Explanation begins.");
    }

    //region Getter and setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //endregion
}
