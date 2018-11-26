package com.tws.refactoring.extract_method;

import java.util.Iterator;
import java.util.List;

public class OwingPrinter {

    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();

        // print banner
//        System.out.println ("*****************************");
//        System.out.println ("****** Customer totals ******");
//        System.out.println ("*****************************");
        printBanner();

        double outstanding = calculateOutstanding(orders);
        // print owings
//        while (elements.hasNext()) {
//            Order each = (Order) elements.next();
//            outstanding += each.getAmount();
//        }

        // print details
        printDetail(name,outstanding);
//        System.out.println("name: " + name);
//        System.out.println("amount: " + outstanding);
    }

    void printBanner(){
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }

    double calculateOutstanding(List<Order> orders){
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    void printDetail(String name, double outstanding){
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }


}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
