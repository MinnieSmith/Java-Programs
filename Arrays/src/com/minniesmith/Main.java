package com.minniesmith;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        myIntArray[0] = 100;

        System.out.println(myIntArray[5]);

        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray2[9]);

        int[] myIntArray3 = new int[10];
        for(int i=0; i<myIntArray3.length; i++) {
            myIntArray3[i] = i*10;
        }
        for(int i=0; i<myIntArray3.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);

        }

    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);

        }
    }
}
