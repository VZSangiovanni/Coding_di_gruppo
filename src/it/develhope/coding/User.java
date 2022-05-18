package it.develhope.coding;

public class User {

    protected String name;
    protected String surname;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public void printUser() {
        System.out.println(" User is: " + getName() + " " + getSurname() + " and have " + getAge() + " years old");

    }


}
