package com.besant.packages.functions;
import java.util.Scanner;


public class Calci {
    //input , operations , output
    public static void main(String[] args) {
//		main(args);
        calculator();
    }

    static void calculator() {
        System.out.println("Choose the operation");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. mutlitplication");
        System.out.println("4. division");
        System.out.println("5. exit");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        int number1;
        int number2;
        switch (userInput) {

            case 1:
                System.out.println("enter the first number");
                number1 = sc.nextInt();
                System.out.println("enter the second number");
                number2 = sc.nextInt();
                System.out.println("your result is");
                System.out.println(addNumbers(number1, number2));
                calculator();
                break;

            case 2:
                System.out.println("enter the first number");
                number1 = sc.nextInt();
                System.out.println("enter the second number");
                number2 = sc.nextInt();
                System.out.println("your result is");
                System.out.println(subNumbers(number1, number2));
                calculator();
                break;
            case 3:
                System.out.println("enter the first number");
                number1 = sc.nextInt();
                System.out.println("enter the second number");
                number2 = sc.nextInt();
                System.out.println("your result is");
                System.out.println(multiplyNumbers(number1, number2));
                calculator();
                break;
            case 4:
                System.out.println("enter the first number");
                number1 = sc.nextInt();
                System.out.println("enter the second number");
                number2 = sc.nextInt();
                System.out.println("your result is");
                System.out.println(divideNumbers(number1, number2));
                calculator();
                break;
            case 5:
                System.out.println("thank you for your time");
                break;
            default:
                System.err.println("invalid input try again");
                calculator();
                break;
        }
    }

    static int addNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    static int subNumbers(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    static int multiplyNumbers(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    static int divideNumbers(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    String getName() {
        String name = "amal";
        name.toUpperCase();

        return name;
    }

    //	int[] array2 = getAgeArray();
//
//	for (int i : array2) {
//		System.out.println(i);
//	}
//	static int[] getAgeArray() {
//		int[] age = { 5, 6, 7, 8, 9 };
//		return age;
//	}

}
