package com.company.java015_ex;

interface Ex2 {
    void print(String s);
}

public class LambdaEx002 {
    public static void main(String[] args) {
        Ex2 ex2 = System.out::println;
        ex2.print("Good day :)");
    }
}
