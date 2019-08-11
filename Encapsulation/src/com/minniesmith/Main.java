package com.minniesmith;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Minh", 100, "Sword");




        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
