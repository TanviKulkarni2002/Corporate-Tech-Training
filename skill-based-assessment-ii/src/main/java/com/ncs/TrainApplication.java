package com.ncs;

import java.util.TreeMap;
import java.util.Scanner;

public class TrainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample train data
        Train train = new Train(101, "Express Train", "Bangalore", "Mumbai", 1000.00);

        // Create a TreeMap to hold passengers
        TreeMap<Passenger, Integer> passengers = new TreeMap<>();

        // Create a Ticket object
        System.out.println("Enter the date of travel (DD/MM/YYYY) format");
        String travelDate = scanner.nextLine(); // read traveldate
        Ticket ticket = new Ticket("", travelDate, train, passengers);

        // Add passengers
        //To simplify things: only one passenger was added.
        System.out.println("\nEnter passenger details\n");
            System.out.print("Name: ");
            String name = scanner.nextLine(); // read name
            System.out.print("Age: ");
            int age = scanner.nextInt(); // read age
            System.out.print("Gender (M/F): ");
            char gender = scanner.next().charAt(0); // read gender

            ticket.addPassenger(name, age, gender);

        // Generate PNR
        String pnr = ticket.generatePnr(train.getSource(), train.getDestination(), travelDate);
        ticket.setPnr(pnr);

        // Print the ticket details
        ticket.generateTicket();

        // Close the scanner
        scanner.close();
    }
}
