package com.oop.overload.flight;

public class CargoFlight extends Flight {
    private float maxCargoSpace = 500f;
    private float usedCargoSpace;
    private int seats = 20;

    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public final void addOnePackage(float h, float w, float d) {
        System.out.println("executing add1Package()");
        float size = h * w * d;
        if (hasCargoSpace(size)) {
            usedCargoSpace += size;
        } else {
            handleNoSpace();
        }
    }

    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

    @Override
    public int getSeats() {
        return this.seats;
    }
}
