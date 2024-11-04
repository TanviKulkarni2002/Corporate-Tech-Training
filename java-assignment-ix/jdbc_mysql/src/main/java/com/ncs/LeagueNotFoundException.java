package com.ncs;

public class LeagueNotFoundException extends RuntimeException {
    public LeagueNotFoundException(String message) {
        super(message);
        message = "LeagueNotFoundException occured. League does not exist.";
    }
}
