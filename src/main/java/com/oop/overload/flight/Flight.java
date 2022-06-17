package com.oop.overload.flight;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Flight implements Iterable<Passenger> , Comparable<Flight>{

    public final static String FLIGHT_NUMBER_PREFIX = "SAL"; // Constant
    private int passengers = 0;
    private int seats = 200;
    private boolean[] isSeatAvailable = new boolean[seats];
    private static int allPassengers;
    private String flightNumber;
    private int totalCheckedBags;
    private ArrayList<Passenger> passengerList = new ArrayList<>();

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

    public void addOnePassenger(Passenger passenger) {
        if (isSeatAvailable()) {
            passengers += 1; //passengers = passengers +1
            allPassengers += 1;
            seats -= 1;
            passengerList.add(passenger);
        }
    }

    public void addPassenger(int bags, Passenger passenger) {
        if (isSeatAvailable()) {
            addOnePassenger(passenger);
            totalCheckedBags += bags;

        }
    }

//    public void addOnePassengerOverLoad(Passenger passenger) {
//        addPassenger(passenger.getCheckedBags(), passenger);
//    }

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
        return passengers < getSeats();
    }

    @Override
    public String toString() {
        String flightStr = "Flight Number = " + flightNumber + " Number of passengers = " + passengers;
        return flightStr;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Flight)) {
            return false;
        }
        Flight flight = (Flight) obj;
        return new EqualsBuilder().append(this.flightNumber, flight.flightNumber).isEquals();
    }



    @Override
    public int hashCode() {
        return Objects.hash(flightNumber);
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }

    @Override
    public int compareTo(Flight flight) {
        int result = flight.getPassengers() - getPassengers();
        return result;
    }
}
