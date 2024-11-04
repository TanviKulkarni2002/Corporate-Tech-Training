package com.ncs;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Ticket {
    private int counter = 100; // Initialize counter for PNR generation
    private String pnr;
    private String travelDate;
    private Train train;
    private TreeMap<Passenger, Integer> passengers;
    private double totalFare;

    public Ticket(String pnr, String travelDate, Train train, TreeMap<Passenger, Integer> passengers) {
        this.pnr = pnr;
        this.travelDate = travelDate;
        this.train = train;
        this.passengers = passengers;
        calculateTotalTicketPrice();
    }

    public double calculateTotalTicketPrice() {
        totalFare = 0;
        for (Entry<Passenger, Integer> entry : passengers.entrySet()) {
            Passenger passenger = entry.getKey();
            int ticketCount = entry.getValue();
            double fare = train.getTicketPrice(); // Get the base ticket price

            // Discounts based on age and gender
            if (passenger.getAge() <= 12) {
                fare *= 0.5; // 50% off for children
            } else if (passenger.getAge() >= 60) {
                fare *= 0.4; // 60% off for seniors
            } else if (passenger.getGender() == 'F') {
                fare *= 0.75; // 25% off for females
            }
            totalFare += fare * ticketCount; // Add to total fare
        }
        return totalFare;
    }

    public void generateTicket() {
        System.out.println("\n***** Printing Ticket Details *****\n");
        System.out.println("PNR: " + pnr);
        System.out.println("Train No: " + train.getTrainNumber());
        System.out.println("Train Name: " + train.getTrainName());
        System.out.println("From: " + train.getSource());
        System.out.println("To: " + train.getDestination());
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Passengers:");

        for (Entry<Passenger, Integer> entry : passengers.entrySet()) {
            Passenger passenger = entry.getKey();
            int ticketCount = entry.getValue();
            double fare = train.getTicketPrice(); // Get the base fare again for display

            // Calculate fare again for display
            if (passenger.getAge() <= 12) {
                fare *= 0.5; // 50% off for children
                totalFare+=fare;
            } else if (passenger.getAge() >= 60) {
                fare *= 0.4; // 60% off for seniors
                totalFare+=fare;
            } else if (passenger.getGender() == 'F') {
                fare *= 0.75; // 25% off for females
                totalFare+=fare;
            }

            System.out.printf("%s %d %s %.2f (x%d)\n", passenger.getName(), passenger.getAge(), passenger.getGender(), fare, ticketCount);
        }
        System.out.printf("Total Price: %.2f\n", totalFare);

    }

    public String generatePnr(String source, String destination, String travelDate) {
        // Extract the first characters of the source and destination
        String sourceInitial = source.substring(0, 1).toUpperCase();
        String destinationInitial = destination.substring(0, 1).toUpperCase();

        // Format the travel date to yyyymmdd
        String[] dateParts = travelDate.split("/");
        String formattedDate = String.format("%s%s%s", dateParts[2], dateParts[1], dateParts[0]);

        // Generate the PNR number with the counter
        return String.format("%s%s_%s_%d", sourceInitial, destinationInitial, formattedDate, counter++);
    }

    public void addPassenger(String name, int age, char gender) {
        gender = Character.toUpperCase(gender); // Convert char to String
        Passenger newPassenger = new Passenger(name, age, gender); // Create a new Passenger object

        // Check if the passenger already exists
        if (passengers.containsKey(newPassenger)) {
            passengers.put(newPassenger, passengers.get(newPassenger) + 1); // Increment ticket count
        } else {
            passengers.put(newPassenger, 1); // Add new passenger with ticket count
        }
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getTravelDate(){
        return travelDate;
    }
}