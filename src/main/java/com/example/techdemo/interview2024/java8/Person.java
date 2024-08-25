package com.example.techdemo.interview2024.java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@ToString
@AllArgsConstructor
@Getter
class Bhanu{
   String name;
   int mob;
   double salary;
   int age;

}



public class Person {
    public static void main(String[] args) {
        Bhanu b1=new Bhanu("bhanu",12313,23423.0,12);
        Bhanu b2=new Bhanu("amal",7639,87.0,87);
        Bhanu b3=new Bhanu("sonu",7635,76.0,24);
        Bhanu b4=new Bhanu("kamal",234,234.0,98);
        Bhanu b5=new Bhanu("ansu",98,9867.0,42);
        Bhanu b6=new Bhanu("amol",675,123.0,76);
        Bhanu b7=new Bhanu("alok",234,499.0,98);
        Bhanu b8=new Bhanu("raju",234,500.0,98);
        List<Bhanu>listofbhanu=new ArrayList<>();
        listofbhanu.add(b1);
        listofbhanu.add(b2);
        listofbhanu.add(b3);
        listofbhanu.add(b4);
        listofbhanu.add(b5);
        listofbhanu.add(b6);
        listofbhanu.add(b7);
        listofbhanu.add(b8);
        // list start with b and age >100
       // listofbhanu.stream().filter(name->name.name.startsWith("b")).filter(age->age.age>10).forEach(System.out::println);

        Predicate<Bhanu> p1=name->name.getName().startsWith("a");
        Predicate<Bhanu> p2=age->age.getAge()>12;
        Predicate<Bhanu>p3=salary->salary.getSalary()>=100;
        Predicate<Bhanu>p4=salary->salary.getSalary()<=500;
        //salary >100 and <500

        //listofbhanu.stream().filter(p1.and(p2)).forEach(System.out::println);

        listofbhanu.stream().filter(p3.and(p4)).forEach(System.out::println);

    }
}
