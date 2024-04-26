package com.example.practice1;

public class Person {
    private  String name;
    private  String lastName;
    private  int socialSecNum;

    public Person(String name, String lastName, int SocialSecNum){

        this.name = name;
        this.lastName = lastName;
        socialSecNum = SocialSecNum;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialSecNum() {
        return socialSecNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecNum(int socialSecNum) {
        this.socialSecNum = socialSecNum;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecNum=" + socialSecNum +
                '}';
    }
}
