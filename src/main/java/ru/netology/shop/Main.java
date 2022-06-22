package ru.netology.shop;

public class Main {

    public static void main (String[] args) {
        //Product product = new Product();
        ManaderProduct manader = new ManaderProduct ();
        manader.add (new Book ( 111, "Onegin", 50, "Puchkin"));
        manader.add(new Smartphone (211, "", 250, ""));
        manader.add(new Book(113, "Arech", 550, "Remark"));
         Product[] result = manader.searchBy ("e");



    }

}
