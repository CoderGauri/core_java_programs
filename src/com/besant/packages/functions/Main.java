package com.besant.packages.functions;

public class Main {
    public static void main(String[] args) {
        //custom function
        int output = addNumbers(5,6);
        System.out.println(output);
        System.out.println(addNumbers(6,7));
    }
   String getName(){
        return "gauri";
    }
    static int addNumbers(int num1 , int num2){
        int result = num1 + num2;
        return result;
    }


}
