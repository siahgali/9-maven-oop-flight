package com.oop.anonymous;

public class main {
    public static void main(String[] args) {
        FlightImpl flightImpl = new FlightImpl();
        flightImpl.flight();
        FlightInterface flightInterface = (() -> System.out.println("Anonymous fly ..."));
        flightInterface.flight();
    }
}
