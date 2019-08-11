package com.minniesmith;

public class Match {
    // home and away team names
    private String home, away;

    /**
     * Creates a match between the provided teams.
     */
    public Match(String home, String away) {
        this.home = home;
        this.away = away;
    }

    /**
     * Returns the home team for this match.
     */
    public String getHome() {
        return this.home;
    }

    /**
     * Returns the away team for this match.
     */
    public String getAway() {
        return this.away;
    }

    /**
     * Returns a string describing this match.
     * See the project description for the required format.
     */
    public String getDisplayValue() {
        return this.home + " vs. " + this.away;
    }
}
