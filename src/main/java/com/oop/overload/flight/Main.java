package com.oop.overload.flight;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Passenger zahra = new Passenger("Zahra", 2, 100);
        Passenger parnia = new Passenger("Parnia", 3, 50);
        Passenger fatemeh  = new Passenger("Fatemeh", 1, 200);

        Flight montrealToIran = new Flight();
        System.out.println("montrealToIran flight number = " + montrealToIran.getFlightNumber());


        montrealToIran.addOnePassenger(zahra);
        System.out.println("Passengers = " + montrealToIran.getPassengers());
        System.out.println("Seats = " + montrealToIran.getSeats());


        montrealToIran.addOnePassenger(parnia);
        System.out.println("Passengers = " + montrealToIran.getPassengers());
        System.out.println("Seats = " + montrealToIran.getSeats());

        for (Passenger passenger:montrealToIran) {
            System.out.println(passenger + " ");
        }
        System.out.println("Number of passengers for montrealToIran : " +  montrealToIran.getPassengers());

        Flight montrealToToronto = new Flight(6000);
        System.out.println("montrealToToronto flight number = " + montrealToToronto.getFlightNumber());
        montrealToToronto.addOnePassenger(fatemeh);
        System.out.println("Number of passengers for montrealToToronto : " +  montrealToToronto.getPassengers());

        System.out.println("All passengers: " + Flight.getAllPassengers());

        Flight montrealToFrance = new Flight();

//
//        Flight montrealToAlberta = new Flight(1000);
//        Passenger majid = new Passenger(3,0);
//
//        if (montrealToAlberta.equals(majid)) {
//
//        }
//        montrealToAlberta.addOnePassenger(majid);
//
//        System.out.println("montrealToAlberta = " + montrealToAlberta);
//
//        Flight montrealToNy = new Flight(1000);
//        montrealToAlberta.addOnePassenger(majid);
//        if (montrealToAlberta.equals(montrealToNy)) {
//            System.out.println("they are equals");
//        }
//
//        CargoFlight cargoFlightMontrealToToronto = new CargoFlight(1001);
//        cargoFlightMontrealToToronto.addOnePackage(1f, 2.5f, 3.0f);
//        Passenger jack = new Passenger(2,0);
//        cargoFlightMontrealToToronto.addOnePassenger(jack);
//
//        FullLicensePilot shapour = new FullLicensePilot();
//        verifyCanAccessAFlight(shapour, montrealToAlberta);
//
//        CargoOnlyPilot massi = new CargoOnlyPilot();
//        verifyCanAccessAFlight(massi, montrealToAlberta);



        Passenger[] passengers = {
                zahra, parnia, fatemeh
        };

        Arrays.sort(passengers);

        for (Passenger passenger: passengers) {
            System.out.println(passenger.getName());
        }


        List<Flight> flightList = new ArrayList<>();
        flightList.add(montrealToIran);
        flightList.add(montrealToToronto);

        for (Flight flight: flightList) {
            System.out.println(flight + " ");
        }

        System.out.println(flightList);
        if (flightList.contains(montrealToFrance)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

}

    private static void verifyCanAccessAFlight(Pilot pilot, Flight flight) {
        if (pilot.canAccept(flight)) {
            System.out.println("Yes you can be this flight pilot");
        } else {
            System.out.println("Sorry you can not be the pilot of this flight");
        }
    }
}
