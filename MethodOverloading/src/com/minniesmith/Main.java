package com.minniesmith;

public class Main {

    public static void main(String[] args) {
	calcFeetAndInchesToCM(5, 1);
	calcFeetAndInchesToCM(70);
    }

    public static double calcFeetAndInchesToCM(double feet, double inches) {
        if((feet<0) || ((inches <0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimetres = (feet *12) * 2.54;
        centimetres += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " +
                centimetres + " cm");
        return centimetres;
    }

    public static double calcFeetAndInchesToCM(double inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = inches % 12;
        System.out.println(inches + " inches is equal to " + feet
                + " ft and " + remainingInches + " inches ");
        return calcFeetAndInchesToCM(feet, remainingInches);
    }

    }
