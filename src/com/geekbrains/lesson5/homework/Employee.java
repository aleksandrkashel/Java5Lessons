package com.geekbrains.lesson5.homework;

public class Employee {
    private String firstName;
    private String surname;
    private String email;
    private String phoneNumber;
    private String position;
    private int salary;
    private int age;

    public Employee(String firstName, String surname, int age, String email, String phoneNumber, String position, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String firstName, String surname) {
        this(firstName, surname, 18, null, null, null, 0);
    }

    public String validate() {
        if (age < 18) {
            return "Работник должен быть совершеннолетним!";
        }
        return null;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}
