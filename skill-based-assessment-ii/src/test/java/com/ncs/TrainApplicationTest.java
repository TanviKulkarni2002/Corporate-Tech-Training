package com.ncs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class TrainApplicationTest {
    private Train train;
    private TreeMap<Passenger, Integer> passengers;
    private Ticket ticket;

    @BeforeEach
    void setUp() {
        // Initialize a Train object
        train = new Train(101, "Express Train", "Bangalore", "Mumbai", 1000.00);
        
        // Initialize TreeMap for passengers
        passengers = new TreeMap<>();
        
        // Initialize Ticket object with a placeholder PNR
        ticket = new Ticket("", "21/01/2024", train, passengers);
    }

    @Test
    void testAddPassenger() {
        ticket.addPassenger("Alice", 25, 'F');
        assertEquals(1, passengers.size());
        assertTrue(passengers.containsKey(new Passenger("Alice", 25, 'F')));
        assertEquals(1, passengers.get(new Passenger("Alice", 25, 'F')));
    }

    @Test
    void testAddMultiplePassengers() {
        ticket.addPassenger("Bob", 30, 'M');
        ticket.addPassenger("Alice", 25, 'F');
        ticket.addPassenger("Alice", 25, 'F'); // Adding Alice again
        
        assertEquals(2, passengers.size()); // Alice should have increased ticket count
        assertEquals(2, passengers.get(new Passenger("Alice", 25, 'F')));
        assertEquals(1, passengers.get(new Passenger("Bob", 30, 'M')));
    }

    @Test
    void testGeneratePnr() {
        String pnr = ticket.generatePnr(train.getSource(), train.getDestination(), ticket.getTravelDate());
        assertNotNull(pnr);
        assertTrue(pnr.matches("^[A-Z]{2}_\\d{8}_\\d{3}$")); // Validate format
    }

    @Test
    void testCalculateTotalTicketPrice() {
        ticket.addPassenger("Alice", 10, 'F'); // Child
        ticket.addPassenger("Bob", 65, 'M');   // Senior
        ticket.addPassenger("Charlie", 30, 'M'); // Adult
        
        double totalPrice = ticket.calculateTotalTicketPrice();
        
        // Total price calculations based on discounts
        double expectedTotal = (1000.00 * 0.5) + (1000.00 * 0.4) + (1000.00);
        assertEquals(expectedTotal, totalPrice);
    }

    @Test
    void testGenerateTicket() {
        ticket.addPassenger("Alice", 30, 'F');
        String pnr = ticket.generatePnr(train.getSource(), train.getDestination(), ticket.getTravelDate());
        ticket.setPnr(pnr);
        
        // Capture the printed output
        // Note: You might want to redirect the output stream to validate the printed ticket.
        ticket.generateTicket();
        
        // Assertions on ticket details can be done if the output is captured
        // You may need to use libraries like SystemLambda to capture output if required.
    }
}
