package com.minniesmith;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("A3") || validModel.equals("carrera")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

        public String getModel () {
            return this.model;
        }

    }
