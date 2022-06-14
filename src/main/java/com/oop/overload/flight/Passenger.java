package com.oop.overload.flight;

public final class Passenger implements Comparable<Passenger>{
    private String name;
    public RewardProgram rewardProgram = new RewardProgram();
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
        this.rewardProgram.memberLevel = memberLevel;
        this.rewardProgram.memberDays = memberDays;
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
        int result = passengerEntered.rewardProgram.memberLevel -  this.rewardProgram.memberLevel;
        if (result == 0) {
            result = passengerEntered.rewardProgram.memberDays - this.rewardProgram.memberDays;
        }
        return result;
    }

    public static class RewardProgram {
        private int memberLevel; // 1, 2 , 3
        private int memberDays;  // Arrays.sort

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
