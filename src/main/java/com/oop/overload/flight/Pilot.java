package com.oop.overload.flight;

public abstract class Pilot {
    private Flight currentFlight;

    public void fly(Flight f) {
        if (canAccept(f)) {
            currentFlight = f;
        } else {
            exceptionCanNotAccept();
        }
    }

    private void exceptionCanNotAccept() {
        System.out.println("Can not accept");
    }

    public abstract boolean canAccept(Flight f);
}
