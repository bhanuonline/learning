package com.example.techdemo.interview2024.java8;

//Lamda Ex
/*
* predictae
* suplier
* function
*
*
* */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface  Lamda{
    public void print(int a, int b);

    default void test(){
        System.out.println();
    }
}

interface lamda2{
    public void play(int a,int b);
}
interface  lamda3{
    public boolean iseven(int i);
}


public class Unlike {

    public static void main(String[] args) {
        Lamda lamda=(a,b)-> System.out.println(a+b);
        lamda.print(2,3);
        lamda.test();

        lamda2 lamda2=(a, b)-> System.out.println(a*b);
        lamda2.play(2,4);

        lamda3 lamda3=(i)-> i%2==0;
        boolean bool=lamda3.iseven(10);
        System.out.println(bool);

        Predicate<Integer> p=(i)->i%2==0;
        boolean b=p.test(3);
        System.out.println(b);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","Amal");
        //start with A

       // names.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
        //names.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       // numbers.stream().filter(n->n%2==0).forEach(System.out::println);
        //numbers.stream().filter(n->n>5).forEach(System.out::println);
        numbers.stream().filter(n->n>5).filter(n->n%2==0).forEach(System.out::println);

    }
}
