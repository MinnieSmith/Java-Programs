package com.minniesmith;

public class Player {

    private String name;
    private int health = 100;
    private String weapon;


    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    public int getHealth() {
        return health;
    }
}
