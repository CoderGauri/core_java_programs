package com.besant.packages.array;

import java.util.Arrays;

public class Array_Methods {
    public static void main(String[] args) {
        int [] arr = new int [7];
        arr[4] = 5;
        for (int i: arr){
            Arrays.sort(arr);
            System.out.println(i);
        }
    }
}
