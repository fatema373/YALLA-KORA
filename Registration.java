package com.company;

import java.util.Scanner;

public class Registration {

    private String Name;
    private String Password;
    private String Email;
    private String Gender;
    private String phoneNumber;
    private int Age;
    private String nationalID;
    public Registration(){
        Name="";
        Password="";
        Email="";
        Gender="";
        phoneNumber="";
        Age=0;
        nationalID="";
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getGender() {
        return Gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public String getNationalID() {
        return nationalID;
    }
    public void userInfo(){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter your userName: ");
        Name= input.next();
        System.out.println("Enter your Password: ");
        Password= input.next();
        System.out.println("Enter your Email: ");
        Email= input.next();
        System.out.println("Enter your Gender: ");
        Gender= input.next();
        System.out.println("Enter your phoneNumber: ");
        phoneNumber= input.next();
        System.out.println("Enter your Age: ");
        Age= input.nextInt();
        System.out.println("Enter your National Id: ");
        nationalID= input.next();
    }

    @Override
    public String toString() {
        return
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Gender='" + Gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Age=" + Age +
                ", nationalID='" + nationalID + '\'';
    }
}
