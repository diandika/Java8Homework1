package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13, 51, 50, 44);
        List<Integer> evenList = findEven(list);
        List<Integer> startsWith1List = findStartsWith1(list);
        int sum = sumList(list);
        List<Integer> sortedList = sorted(list);

        System.out.println(evenList);
        System.out.println(startsWith1List);
        System.out.println(sum);
        System.out.println(sortedList);

        //continue

        List<Invoice> invoices = new ArrayList<>();

        List<Invoice> oracleAndTrainingInvoices = invoices.stream()
                .filter(inv -> inv.getCustomer() == Customer.ORACLE)
                .filter(inv -> inv.getTitle().contains("Training"))
                .sorted().toList();

        List<Integer> ids = invoices.stream()
                .filter(inv -> inv.getID())
                .collect(Collectors.toList());

        List<Integer> firstFiveIds = ids.stream()
                .limit(5).toList();
    }

    public static List<Integer> findEven(List<Integer> list){
        return list.stream()
                .filter(element -> element%2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> findStartsWith1(List<Integer> list){
        return list.stream()
                .filter(element -> element.toString().startsWith("1"))
                .collect(Collectors.toList());
    }

    public static int sumList(List<Integer> list){
        return list.stream()
                .reduce(0, Integer::sum);
    }

    public static List<Integer> sorted(List<Integer> list){
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
