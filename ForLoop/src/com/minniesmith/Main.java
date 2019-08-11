package com.minniesmith;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            double interest = (780.614 * i) / 100;
            System.out.println("$10000 at " + i + "% interest = " + String.format("%.2f", interest));
        }

        primeCount();

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeCount() {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
}


