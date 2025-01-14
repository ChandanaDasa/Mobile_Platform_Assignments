package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Models.Address;
import Models.Person;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isAddressSetTest()
    {
        Address addr1 = new Address();
        addr1.setCity("Dehradun");
        addr1.setState("UK");
         
        Address addr2 = new Address();
        addr2.setCity( "Delhi");
        addr2.setState("Delhi");

        Person p=new Person();
        p.setAddr(addr1);

        boolean result = new services().isAddressSet(p, addr1);
        
        assertTrue("Address is correct and set successfully",result);
    }
}