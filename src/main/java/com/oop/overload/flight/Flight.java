package com.oop.overload.flight;

public class Flight {

    public final static String FLIGHT_NUMBER_PREFIX = "SAL";
    private int passengers = 0;
    private int seats = 200;
    private boolean[] isSeatAvailable = new boolean[seats];
    private static int allPassengers;
    private String flightNumber;
    private int totalCheckedBags;

    {
        for (int i=0; i< seats; i++ ) {
            isSeatAvailable[i] = true;
        }
        System.out.println("executing initializer block");
    }

    public Flight() {

        System.out.println("executing constructor");

    }

    public Flight(int flightNumber) {
        this.flightNumber = FLIGHT_NUMBER_PREFIX + flightNumber;
    }

    public void addOnePassenger() {
        if (isSeatAvailable()) {
            passengers += 1; //passengers = passengers +1
            allPassengers += 1;
            seats -= 1;
        }
    }

    public void addOnePassenger(int bags) {
        if (isSeatAvailable()) {
            addOnePassenger();
            totalCheckedBags += bags;
        }
    }

    public void addOnePassenger(Passenger passenger) {
        addOnePassenger(passenger.getCheckedBags());
    }

    public int getPassengers() {
        return passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setSeats(int seats) {
        if (seats < 150) {
            this.seats = seats;
        }
    }

    public static int getAllPassengers() {
        return allPassengers;
    }

    public static void resetAllPassengers() {
        allPassengers = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    private boolean isSeatAvailable() {
        return passengers < seats;
    }

    @Override
    public String toString() {
        String flightStr = "Flight Number = " + flightNumber + " Number of passengers = " + passengers;
        return flightStr;
    }

    @Override
    public boolean equals(Object obj) {
        Flight flight = (Flight) obj;
        return this.flightNumber.equals(flight.getFlightNumber());
    }
}
