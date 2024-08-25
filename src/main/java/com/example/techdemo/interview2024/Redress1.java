package com.example.techdemo.interview2024;


//Deep Copy example
class Address implements Cloneable{
     String name;
     String pincode;

    public Address(String name, String pincode){
        this.name=name;
        this.pincode=pincode;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public String name;
    Address   address;

    public Person(String name, Address  address){
        this.name=name;
        this.address=address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p= (Person) super.clone();
        p.address= (Address) address.clone();
        return p;
    }
}

public class Redress1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address a1=new Address("Amauli","212631");
        Person p1=new Person("bhanu",a1);

        Person c1= (Person) p1.clone();
        Person c2= (Person) c1.clone();
        c2.name="Changed Bhanu";
        c2.address.pincode="208010";
        System.out.println(c1.name+" ,"+c1.address.pincode);
        System.out.println(c2.name+", "+c2.address.pincode);

    }
}
