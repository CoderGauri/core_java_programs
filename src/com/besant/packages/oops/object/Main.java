package com.besant.packages.oops.object;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        Car Audi = new Car();
        Audi.brand = "Audi";
        Audi.color = "black";
        Audi.driving();
        Audi.racing();
        Audi.travelling();

    }
}
