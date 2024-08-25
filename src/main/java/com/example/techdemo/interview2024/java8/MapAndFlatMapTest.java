package com.example.techdemo.interview2024.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@Getter
class PhoneNumber{
    private String type;
    private String number;
}

@Data
@AllArgsConstructor
@Getter
class ParsonMap{
    private String name;
    private List<PhoneNumber> phoneNumbers;
}

public class MapAndFlatMapTest {
    public static void main(String[] args) {
        //List<Integer> l= Arrays.asList(1,2,3,4,5);
        //System.out.println(l.stream().map(t->t*t).collect(Collectors.toList()));
        List<ParsonMap> people = Arrays.asList(
                new ParsonMap("Alice", Arrays.asList(
                        new PhoneNumber("home", "123-456-7890"),
                        new PhoneNumber("work", "234-567-8901")
                )),
                new ParsonMap("Bob", Arrays.asList(
                        new PhoneNumber("home", "345-678-9012"),
                        new PhoneNumber("Banking", "678-901-000")
                )),
                new ParsonMap("Charlie", Arrays.asList(
                        new PhoneNumber("work", "456-789-0123"),
                        new PhoneNumber("mobile", "567-890-1234"),
                        new PhoneNumber("home", "678-901-2345"),
                        new PhoneNumber("Trading", "678-901-2347")
                ))
        );


        // find people with multiple phone
        List<String>peopleWithMultiplePhone=people.stream().filter(parsonMap -> parsonMap.getPhoneNumbers().size()>2).
                map(parsonMap -> parsonMap.getName()+":"+parsonMap.getPhoneNumbers()).collect(Collectors.toList());

        peopleWithMultiplePhone.forEach(s-> {
            System.out.println(s.split(":"));
                }
        );


        // group by type
        Map<String,List<PhoneNumber>> map=people.stream().flatMap(parsonMap -> parsonMap.getPhoneNumbers().stream())
                .collect(Collectors.groupingBy(PhoneNumber::getType));
        map.forEach((s, phoneNumbers) -> {
           // System.out.println(s+"->");
           // phoneNumbers.stream().forEach(n-> System.out.println(n.getNumber()));
        });

        List<String> listOfNumberusingMap=people.stream()
                .flatMap(parsonMap -> parsonMap.getPhoneNumbers()
                        .stream()).map(p->p.getNumber())
                .collect(Collectors.toList());
        //System.out.println(listOfNumberusingMap);

        //filter only home type phone
         Predicate<PhoneNumber> p1= phoneNumber -> phoneNumber.getType().equals("Trading");
         Predicate<PhoneNumber> p2= phoneNumber -> phoneNumber.getType().equals("Banking");
        List<String> homeTypePhone=people.stream().flatMap(p->p.getPhoneNumbers().stream())
                .filter(phoneNumber -> phoneNumber.getType().equals("Trading") ||
                        phoneNumber.getType().equals("Banking"))
                .map(phoneNumber -> phoneNumber.getType()+":"+phoneNumber.getNumber())
                .collect(Collectors.toList());
       // System.out.println(homeTypePhone);

        //count no of work phone
        int countOfWorkPhone=people.stream().flatMap(parsonMap -> parsonMap.getPhoneNumbers().stream()).
                filter(p->p.getType().equals("work"))
                .collect(Collectors.toList()).size();
        //System.out.println(countOfWorkPhone);

        //unique phone
        List<String>uniquePhone=people.stream().flatMap(parsonMap -> parsonMap.getPhoneNumbers().stream()).
                map(phoneNumber -> phoneNumber.getType()).
                distinct().
                collect(Collectors.toList());
        //System.out.println(uniquePhone);





    }
}
