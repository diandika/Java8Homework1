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

        invoices.add(new Invoice("Training", 1, 1));
        invoices.add(new Invoice("Debt", 2, 3));
        invoices.add(new Invoice("Training", 3, 1));
        invoices.add(new Invoice("Check", 4, 4));
        invoices.add(new Invoice("Debt", 5, 2));
        invoices.add(new Invoice("Pay", 6, 1));
        invoices.add(new Invoice("Pay", 7, 2));

        List<Invoice> oracleAndTrainingInvoices = invoices.stream()
                .filter(inv -> inv.getCustomer() == Customer.ORACLE)
                .filter(inv -> inv.getTitle().contains("Training"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(oracleAndTrainingInvoices);

        List<Integer> ids = invoices.stream()
                .map(inv -> inv.getID())
                .toList();

        System.out.println(ids);

        List<Integer> firstFiveIds = ids.stream()
                .limit(5).toList();

        System.out.println(firstFiveIds);
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
