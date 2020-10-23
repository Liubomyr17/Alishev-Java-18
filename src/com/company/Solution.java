package com.company;


public class Solution {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(12);
        System.out.println("Getting the value in the main method: " + person1.getName());
        System.out.println("Getting the age in the main method: " + person1.getAge());

    }
}

class Person {
    // Дані (поля)
    // Дії (методи)
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("You've entered the empty name!");
        } else {
            name = userName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("The age should be more than 0!");
        } else {
        this.age = userAge;
    }}

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
     }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + "," + " I'm " + age + " years old!");
        }
    }
        void sayHello() {
            System.out.println("Hello!");

        }

}