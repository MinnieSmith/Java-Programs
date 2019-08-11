package com.minniesmith;

public class Main {

    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
    }
}
