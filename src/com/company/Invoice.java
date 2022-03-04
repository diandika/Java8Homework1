package com.company;

public class Invoice implements Comparable<Invoice>{
    private String title;
    private int ID;
    private int customer;

    public Invoice(String title, int ID, int customer){
        this.title = title;
        this.ID = ID;
        this.customer = customer;
    }

    public int getCustomer() {
        return customer;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Invoice o) {
        return this.title.compareTo(o.getTitle());
    }
}
