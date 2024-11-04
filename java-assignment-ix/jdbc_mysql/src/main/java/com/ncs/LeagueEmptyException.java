package com.ncs;

public class LeagueEmptyException extends RuntimeException {
    public LeagueEmptyException(String message) {
        super(message);
        message = "LeagueEmptyException occured. No Leagues found.";
    }
}
