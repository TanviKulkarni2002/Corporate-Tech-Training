package com.ncs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ncs.League.Season;

public class LeagueRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/____"; // fill database name here in place of ____
    private static final String USER = ""; // fill your MySQL username here
    private static final String PASSWORD = ""; // fill your MySQL password here

    // Add Leagues method
    public League addLeague(League league) {
        String sql = "INSERT INTO league (leagueId, year, season, title) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, league.getLeagueId());
            preparedStatement.setInt(2, league.getYear());
            preparedStatement.setString(3, league.getSeason().name());
            preparedStatement.setString(4, league.getTitle());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("League added successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return league;
    }

    // Get leagues by title
    public List<League> getLeagueByTitle(String title) throws LeagueNotFoundException {
        List<League> leagues = new ArrayList<>();
        String sql = "SELECT * FROM league WHERE title = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, title);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                League league = new League(
                        resultSet.getInt("leagueId"),
                        resultSet.getInt("year"),
                        Season.valueOf(resultSet.getString("season")),
                        resultSet.getString("title"));
                leagues.add(league);
            }

            if (leagues.isEmpty()) {
                throw new LeagueNotFoundException("LeaguNotFoundException occured. No Leagues found title: " + title);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return leagues;
    }

    // Get leagues by season
    public List<League> getLeagueBySeason(Season season) throws LeagueNotFoundException {
        List<League> leagues = new ArrayList<>();
        String sql = "SELECT * FROM league WHERE season = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, season.name());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                League league = new League(
                        resultSet.getInt("leagueId"),
                        resultSet.getInt("year"),
                        Season.valueOf(resultSet.getString("season")),
                        resultSet.getString("title"));
                leagues.add(league);
            }

            if (leagues.isEmpty()) {
                throw new LeagueNotFoundException(
                        "LeagueNotFoundException occured. No Leagues found for season: " + season);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return leagues;
    }

    // Get leagues by Id
    public League getLeagueById(int leagueId) throws LeagueNotFoundException {
        League league = null;
        String sql = "SELECT * FROM league WHERE leagueId = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, leagueId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                league = new League(
                        resultSet.getInt("leagueId"),
                        resultSet.getInt("year"),
                        Season.valueOf(resultSet.getString("season")),
                        resultSet.getString("title"));
            } else {
                throw new LeagueNotFoundException(
                        "LeagueNotFoundException occured. No Leagues found with Id: " + leagueId);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return league;
    }

    // Get all the leagues
    public List<League> getAllLeagues() throws LeagueEmptyException {
        List<League> leagues = new ArrayList<>();
        String sql = "SELECT * FROM league";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                League league = new League(
                        resultSet.getInt("leagueId"),
                        resultSet.getInt("year"),
                        Season.valueOf(resultSet.getString("season")),
                        resultSet.getString("title"));
                leagues.add(league);
            }

            if (leagues.isEmpty()) {
                throw new LeagueEmptyException("LeagueEmptyException occured. No Leagues found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return leagues;
    }

    // Update the league
    public League updateLeague(League league) throws LeagueNotFoundException {
        String sql = "UPDATE league SET year = ?, season = ?, title = ? WHERE leagueId = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, league.getYear());
            preparedStatement.setString(2, league.getSeason().name());
            preparedStatement.setString(3, league.getTitle());
            preparedStatement.setInt(4, league.getLeagueId());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new LeagueNotFoundException(
                        "LeagueNotFoundException occured. No Leagues found with Id: " + league.getLeagueId());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return league;
    }

    // Delete the league
    public void deleteLeague(League league) throws LeagueNotFoundException {
        String sql = "DELETE FROM league WHERE leagueId = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, league.getLeagueId());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new LeagueNotFoundException(
                        "LeagueNotFoundException occured. No Leagues found with Id: " + league.getLeagueId());
            } else {
                System.out.println("League deleted successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}