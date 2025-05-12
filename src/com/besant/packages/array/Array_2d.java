package com.besant.packages.array;

public class Array_2d {
    public static void main(String[] args) {

        int rows = 3;
        int coloumns = 3;
        int[][] array1 = new int[rows][coloumns];
        array1[0][0] = 0;
        array1[0][1] = 1;
        array1[0][2] = 2;
        array1[1][0] = 3;
        array1[1][1] = 4;
        array1[1][2] = 5;
        array1[2][0] = 6;
        array1[2][1] = 7;
        array1[2][2] = 8;
        System.out.println(array1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                array1[i][j] = array1[i][j];
            }

//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < coloumns; j++) {
//                    System.out.println("[");
//                    System.out.print(array1[i][j]);
//                }
//                System.out.println("]");
//                System.out.println();


            }
        }
    }
