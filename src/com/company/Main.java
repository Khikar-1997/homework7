package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.greet(student);
        student.goToLesson();
        student.setAge(21);
        System.out.println("Students age = " + student.getAge());

        System.out.println();

        Teacher teacher = new Teacher();
        teacher.greet(teacher);
        teacher.explain();
        teacher.setAge(28);
        System.out.println("Teachers age = " + teacher.getAge());
    }
}