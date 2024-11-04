package com.ncs;

public class League {

    public enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    private int leagueId;
    private int year;
    Season season;
    private String title;

    // Parameterized constructor declaration
    public League(int leagueId, int year, Season season, String title) {
        this.leagueId = leagueId;
        this.year = year;
        this.title = title;
        this.season = season;
    }

    // Getter and Setter for each field
    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "LeagueId: " + leagueId + " Year: " + year + " Season: " + season + " Title: " + title;
    }

}