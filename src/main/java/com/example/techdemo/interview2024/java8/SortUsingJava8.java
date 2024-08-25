package com.example.techdemo.interview2024.java8;

import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@Builder
@ToString
class Retaliate{
    String name;
    double salary;
    int age;
    String email;

}

public class SortUsingJava8 {
    public static void main(String[] args) {
        Retaliate r1 = new Retaliate("bhanu", 234.9, 4, "bhanu@gmail.com");
        Retaliate r2 = new Retaliate("amit", 345.5, 43, "mait@yahoo.com");
        Retaliate r3 = new Retaliate("sanu", 325325.8, 42, "sanu@redif.com");
        Retaliate r4 = new Retaliate("alok", 321.4, 22, "alok@outlook.com");
        Retaliate r5 = new Retaliate("mohit", 13.4, 66, "mohit@gmail.com");
        Retaliate r6 = new Retaliate("kamal", 24.9, 57, "kamal@hotmail.com");
        Retaliate r7 = new Retaliate("rohit", 345.9, 22, "rohit@hotmail.com");
        Retaliate r8 = new Retaliate("kallu", 100, 13, "kallu@redif.com");

        List<Retaliate> r=new ArrayList<>();
        r.add(r1);
        r.add(r2);
        r.add(r3);
        r.add(r4);
        r.add(r5);
        r.add(r6);
        r.add(r7);
        r.add(r8);


        r.stream().sorted(Comparator.comparing(Retaliate::getName)).forEach(t->System.out.println(t.toString()));


    }
}
