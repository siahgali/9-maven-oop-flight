package com.oop.overload.flight;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Flight montrealToIran = new Flight();
        System.out.println("montrealToIran flight number = " + montrealToIran.getFlightNumber());

        montrealToIran.addOnePassenger(3);
        System.out.println("Passengers = " + montrealToIran.getPassengers());
        System.out.println("Seats = " + montrealToIran.getSeats());


        montrealToIran.addOnePassenger(2);
        System.out.println("Passengers = " + montrealToIran.getPassengers());
        System.out.println("Seats = " + montrealToIran.getSeats());

        System.out.println("Number of passengers for montrealToIran : " +  montrealToIran.getPassengers());

        Flight montrealToToronto = new Flight();
        System.out.println("montrealToToronto flight number = " + montrealToToronto.getFlightNumber());
        montrealToToronto.addOnePassenger(1);
        System.out.println("Number of passengers for montrealToToronto : " +  montrealToToronto.getPassengers());

        System.out.println("All passengers: " + Flight.getAllPassengers());

        Flight montrealToAlberta = new Flight(1000);
        Passenger majid = new Passenger(3,0);

        montrealToAlberta.addOnePassenger(majid);

        System.out.println("montrealToAlberta = " + montrealToAlberta);

        Flight montrealToNy = new Flight(1000);
        montrealToAlberta.addOnePassenger(majid);
        if (montrealToAlberta.equals(montrealToNy)) {
            System.out.println("they are equals");
        }
    }
}
