package com.codeclan.example.listofbearshomework;

/**
 * Created by user on 24/05/2017.
 */

class Bear {

    private int ranking;
    private String type;

    public Bear(int ranking, String type) {
        this.ranking = ranking;
        this.type = type;
    }

    public int getRanking() {
        return ranking;
    }

    public String getType() {
        return type;
    }
}
