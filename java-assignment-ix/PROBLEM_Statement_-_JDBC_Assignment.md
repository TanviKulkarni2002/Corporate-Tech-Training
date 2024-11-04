Problem Statement: 

 The Duke Soccer League is a Soccer League club based out of India.every day hundreds of Leagues are played all over India which is managed and tracked by the League Admin.As the system to manage the leagues is maintained manually 
 it is becoming difficult for the League Admin to keep Track of League Played.
 Develop an Application that helps the league to manage and track All leagues Played


**Define League,LeagueRepository and League Client class as given below**

**League Class**

Note :- (-) indicates private and (+) indicates public

Step 1:
Declare the following League properties 
    -leagueId : int
    -year : int
    -season : Season
    -title : String
    
Step 2:
- Define parameterized constructor to initialize the above properties.
- Season should be a constant having the values ( Spring,Summer,Autumn and Winter )
- Provide getter for all the properties
- Override the toString() method to return League details

**LeagueRepository class has the following five methods**

Note :- Use MYSQL Database to Store and manipulate League 

      +addLeague(League league) : League 
       - the addLeague method should enable the League Admin to add a League to the Database and return the League object

      +getLeagueByTitle(String title) : List<League>
       - the getLeagueByTitle method should enable the League Admin to pass the league title as an argument. if the    League title is found in the Database . then the method should return the List of League object. or else it should throw LeagueNotFoundException.

      +getLeagueBySeason(Season season) : List<League>
        - the getLeagueBySeason method should enable the League Admin to pass the season of the League as an argument. if the Leagues  is found in the Database . then the method should return all the Leagues in the form of List. or else it should throw LeagueNotFoundException

      +getLeagueById(int leagueId) : League
       - the getLeagueById method should enable the League Admin to pass the leagueId as an argument. if the League is found  in the Collection . then the method should return the League object. or else it should throw LeagueNotFoundException

      +getAllLeagues() : List<League>
      - the getAllLeagues method should enable the League Admin to view all the Leagues available in the Database.
        if the Leagues are not Avaliable in the Database it should throw an Exception LeagueEmptyException

      +updateLeague(League) : League
      - the updateLeague method should enable the League Admin to pass League Object as an argument. if the League is found  in the Database . then the method should update the year or Season or Title. If the League is not found then it should throw LeagueNotFoundException

      +deleteLeague(League) : void
      - the deleteLeague method should enable the League Admin to pass League Object as an argument. if the League is found  in the Database . then the method should delete the League and the message "League deleted successfully.." should be printed. If the League is not found then it should throw LeagueNotFoundException



**LeagueClient class should Implement the following and handle the Exception Accordingly**

    - League Admin should create atleast 3-4 Objects of the League class
    - League Admin should be able to add the Leagues using the addLeague() method of the LeagueRepository Class
    - League Admin should be able to search the League(s) using the getLeagueByTitle() method of the LeagueRepository Class
    - League Admin should be able to search the League(s) using the getLeagueBySeason() method of the LeagueRepository Class
    - League Admin should be able to search the League(s) using the getLeagueById() method of the LeagueRepository Class
    - League Admin should be able to search the League(s) using the getAllLeague() method of the LeagueRepository Class
    - League Admin should be able to update the League using the updateLeague() method of the LeagueRepository Class
    - League Admin should be able to delete the League using the deleteLeague() method of the LeagueRepository Class
 
- Follow the comments to complete the Logics for all five methods

## Instructions
- Avoid printing unnecessary values other than expected output
- Take care of whitespace/trailing whitespace (Format your code)
- Do not change the provided class/method names
- Follow best practices while coding

