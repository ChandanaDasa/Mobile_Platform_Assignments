package com.example;

import Models.Address;
import Models.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
{
    Address studentAddr= new Address();
    studentAddr.setCity("Dehradun");
    studentAddr.setCountry("Idia");
    studentAddr.setPostalCode(248002);
    studentAddr.setState("UK");
    
    Student s=new Student();
    s.setAddr(studentAddr);

        System.out.println(s.getAddr());
    }
}
