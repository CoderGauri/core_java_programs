package com.besant.packages.functions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operator ");
        String Operator = sc.next();
        System.out.println("enter the first value");
        int a = sc.nextInt();
        System.out.println("enter the Second value");
        int b = sc.nextInt();
        System.out.println(calculator(a, b, Operator));
    }

    static int calculator(int a, int b, String Operator) {
        switch (Operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a + b;
                } else System.out.println("invalid");
                return 0;
            case "%":
                if (b != 0) {
                    return a % b;
                } else System.out.println("invalid");
                return 0;
            default:
                return 0;

        }
    }
}
