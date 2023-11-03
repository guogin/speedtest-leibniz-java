package org.example;

public class Main {
    public static void main(String[] args) {
        LeibnizFormula f = new LeibnizFormula(100000000);
        System.out.println(f.calculatePI());
    }
}