package com.oop.overload.flight;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Passenger zahra = new Passenger("Zahra", 2, 100);
        Passenger parnia = new Passenger("Parnia", 3, 50);
        Passenger fatemeh  = new Passenger("Fatemeh", 1, 200);

        Flight montrealToIran = new Flight(2000);
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

        Flight montrealToFrance = new Flight(4000);

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


        //List<Flight> flightList = new ArrayList<>();
        ArrayList<Flight> flightList = new ArrayList<>();
        flightList.add(montrealToIran);
        flightList.add(montrealToToronto);
        flightList.add(montrealToToronto);

//        Flight[] flghtArray = new Flight[flightList.size()];
//        flghtArray = (Flight[]) flightList.toArray();
//        flightList.removeIf(new Predicate<Flight>() {
//            @Override
//            public boolean test(Flight flight) {
//                return flight.getFlightNumber().equals("SAL6000") ;
//            }
//        });

        flightList.removeIf(flight -> flight.getFlightNumber().equals("SAL6000"));

//        for (Flight flight: flightList) {
//            System.out.println(flight + " ");
//        }

        flightList.forEach(fl -> System.out.println(fl + " "));

        System.out.println(flightList);
        if (flightList.contains(montrealToFrance)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Set<Flight> flightSet = new HashSet<>();
        HashSet<Flight> flightSet = new HashSet<>();
        flightSet.add(montrealToToronto);
        flightSet.add(montrealToIran);
        flightSet.add(montrealToToronto);
        flightSet.add(montrealToToronto);

        flightSet.forEach(flight -> System.out.println("FlightSet " + flight + " "));


//        HashSet<String> colors = new HashSet<>();
//        colors.add("yellow");
//        colors.add("yellow");
//        colors.add("black");
//        colors.add("yellow");
//        colors.forEach(c -> System.out.println(c + " "));

        SortedSet<Flight> flightSorted = new TreeSet<>();
        flightSorted.add(montrealToToronto);
        flightSorted.add(montrealToIran);
        flightSorted.add(montrealToFrance);
        flightSorted.add(montrealToFrance);

        flightSorted.forEach(flight -> System.out.println("Sorted flight " + flight));

}

    private static void verifyCanAccessAFlight(Pilot pilot, Flight flight) {
        if (pilot.canAccept(flight)) {
            System.out.println("Yes you can be this flight pilot");
        } else {
            System.out.println("Sorry you can not be the pilot of this flight");
        }
    }
}
