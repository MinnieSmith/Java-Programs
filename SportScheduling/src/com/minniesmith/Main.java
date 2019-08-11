package com.minniesmith;

import java.util.ArrayList;

public class Main {
    private static Round round1 = new Round();
    private static Match match1 = new Match("T1", "T2");
    private static Match match2 = new Match("T3", "T6");
    private static Match match3 = new Match("T4", "T6");

    public static void main(String[] args) {
    round1.addMatch(match1);
    round1.addMatch(match2);
    round1.addMatch(match3);

    System.out.println(round1.getDisplayValue());
    ArrayList teams = new ArrayList<String>();
    teams.add("T1");
    teams.add("T2");
    teams.add("T3");
    teams.add("T4");
    teams.add("T5");
    teams.add("T6");
    int n = teams.size();
        System.out.println(n);



    }


}