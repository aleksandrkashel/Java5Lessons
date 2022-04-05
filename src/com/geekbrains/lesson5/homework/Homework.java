package com.geekbrains.lesson5.homework;

import java.util.Random;

public class Homework {
    private static final int EMPLOYEE_COUNT = 5;
    private static final int MIN_AGE = 40;

    private static final Random ageRandomize = new Random();


    public static void main(String[] args) {
        Employee[] employees = new Employee[EMPLOYEE_COUNT];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = createEmployee(i);
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }

    private static Employee createEmployee(int i) {
        return new Employee(
                "name" + i,
                "surname" + i,
                ageRandomize.nextInt(30) + 30,
                "test" + i + "@test.com",
                "+7920555778" + i,
                "Software Engineer",
                2000 + i * 100);
    }
}
