package com.minniesmith;

public class Main {

    public static void main(String[] args) {
        printEvenNumber(5, 20);
    }


    public static void countNumber() {
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }


    public static void printEvenNumber(int number, int finishNumber) {
        int count = 0;
        while (number <= finishNumber && count <= 5) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("The even number is " + number);
            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("The total even number is " + count);
    }
}

