package com.oop.overload.flight;

import java.net.PasswordAuthentication;

public final class Passenger implements Comparable<Passenger>{
    private String name;
    private int memberLevel; // 1, 2 , 3
    private int memberDays;  // Arrays.sort

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

    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
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

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Passenger passengerEntered) {
        int result = passengerEntered.memberLevel -  this.memberLevel;
        if (result == 0) {
            result = passengerEntered.memberDays - this.memberDays;
        }
        return result;
    }
}
