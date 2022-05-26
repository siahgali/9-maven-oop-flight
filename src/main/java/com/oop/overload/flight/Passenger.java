package com.oop.overload.flight;

public final class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public Passenger(int freeBags) {
        this.freeBags = freeBags;
    }

    public Passenger(int checkedBags, int freeBags) {
        this.checkedBags = checkedBags;
        this.freeBags = freeBags;
    }

    public int getCheckedBags() {
        return checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
