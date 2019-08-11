package com.minniesmith;

public class Main {

    public static void main(String[] args) {

        int highScore1 = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore1);

        int highScore2 = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore2);

        int scorePosition1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Minh", scorePosition1);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position
                + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    public static int calculateAlternativeHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

}


