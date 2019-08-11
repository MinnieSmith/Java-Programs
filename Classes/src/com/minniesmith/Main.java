package com.minniesmith;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car();
        Car porche = new Car();
        audi.setModel("A3");
        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel());
    }
}
