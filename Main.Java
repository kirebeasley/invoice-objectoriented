package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<cobisstore> inventory = new ArrayList<cobisstore>();
        ArrayList<customerpurchase> order = new ArrayList<customerpurchase>();

        cobisstore cs = new cobisstore();
        cs.setProduct("Bison Sweater");
        cs.setPrice(55.99);
        inventory.add(cs);

        cs = new cobisstore();
        cs.setProduct("Bison Tee");
        cs.setPrice(14.99);
        inventory.add(cs);

        cs = new cobisstore();
        cs.setProduct("Bison Hoodie");
        cs.setPrice(23.99);
        inventory.add(cs);

        cs = new cobisstore();
        cs.setProduct("Bison Bumpersticker");
        cs.setPrice(4.99);
        inventory.add(cs);

        Scanner input = new Scanner(System.in); String response = " ";
        int index = -1;
        do { System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) show purchases 3) finish transaction");
            response = input.nextLine();


            if (response.equals("1")) {
                for (int i = 0; i < inventory.size(); i++) {
                    System.out.println(inventory.get(i).getProduct() + " : $ " + inventory.get(i).getPrice());
                }
                System.out.println("Product: ");
                String product = input.nextLine();
                for (int i = 0; i < inventory.size(); i++) {
                    if (inventory.get(i).getProduct().equals(product)) {
                        index = i;

                        String cppd = inventory.get(index).getProduct();
                        Double cppr = inventory.get(index).getPrice();
                        customerpurchase co = new customerpurchase();
                      co.setProdpurch(cppd);
                      co.setProdprice(cppr);
                        order.add(co);
                        } }

            } if (response.equals("2")) {
                for (int i = 0; i < order.size(); i++) {
                    System.out.println(order.get(i).getProdpurch() + " : $ " + order.get(i).getProdprice()); } }

        } while (!response.equals("3"));
        double totalcost = 0.0;
        for (int i = 0; i < order.size(); i++) {
            double item = order.get(i).getProdprice();
            totalcost += item; }

        System.out.println("Your total for the day is:" + totalcost);
    }
}

