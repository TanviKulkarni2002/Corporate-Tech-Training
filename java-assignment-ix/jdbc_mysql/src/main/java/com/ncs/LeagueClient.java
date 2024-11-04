/*Note: Truncate table query needs to be run each time in mysql after running the program once, 
because leagueId has been made primary key*/

package com.ncs;

import java.util.List;

import com.ncs.League.Season;

public class LeagueClient {
    public static void main(String[] args) {
        LeagueRepository repository = new LeagueRepository();

        // Create League objects
        League league1 = new League(1, 2024, Season.SUMMER, "Summer Championship");
        League league2 = new League(2, 2023, Season.WINTER, "Winter Classic");
        League league3 = new League(3, 2022, Season.SPRING, "Spring Invitational");
        League league4 = new League(4, 2021, Season.AUTUMN, "Fall Finale");

        // Add leagues to the database
        // Comment the below addLeague method statements to see all Exception handling
        // cases.
        try {
            repository.addLeague(league1);
            repository.addLeague(league2);
            repository.addLeague(league3);
            repository.addLeague(league4);
        } catch (Exception e) {
            System.err.println("Error adding leagues: " + e.getMessage());
        }

        // Search leagues by title
        try {
            List<League> leaguesByTitle = repository.getLeagueByTitle("Summer Championship");
            leaguesByTitle.forEach(System.out::println);
        } catch (LeagueNotFoundException e) {
            System.err.println(e.getMessage());
        }

        // Search leagues by season
        try {
            List<League> leaguesBySeason = repository.getLeagueBySeason(Season.SUMMER);
            leaguesBySeason.forEach(System.out::println);
        } catch (LeagueNotFoundException e) {
            System.err.println(e.getMessage());
        }

        // Search league by Id
        try {
            League leagueById = repository.getLeagueById(1);
            System.out.println(leagueById);
        } catch (LeagueNotFoundException e) {
            System.err.println(e.getMessage());
        }

        // Get all leagues
        try {
            List<League> allLeagues = repository.getAllLeagues();
            allLeagues.forEach(System.out::println);
        } catch (LeagueEmptyException e) {
            System.err.println(e.getMessage());
        }

        // Update a league
        try {
            League updatedLeague = new League(1, 2025, Season.SUMMER, "Summer Championship v2.0");
            repository.updateLeague(updatedLeague);
            System.out.println("Updated League: " + updatedLeague);
        } catch (LeagueNotFoundException e) {
            System.err.println(e.getMessage());
        }

        // Delete a league
        try {
            repository.deleteLeague(league1);
        } catch (LeagueNotFoundException e) {
            System.err.println(e.getMessage());
        }

        /*
         * Chekcing for LeagueNotFoundException. Will throw error because leagueId is
         * priamry key.
         * But it will display the exception message.
         */
        // try {
        // repository.deleteLeague(league1);
        // } catch (LeagueNotFoundException e) {
        // System.err.println(e.getMessage());
        // }
    }
}