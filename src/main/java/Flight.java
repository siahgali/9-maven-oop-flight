public class Flight {

    public final static String FLIGHT_NUMBER_PREFIX = "SAL";
    private int passengers = 0;
    private int seats = 200;
    private boolean[] isSeatAvailable = new boolean[seats];
    private static int allPassengers;
    private String flightNumber;
    private static  int number ;

    {
        for (int i=0; i< seats; i++ ) {
            isSeatAvailable[i] = true;
        }
        System.out.println("executing initializer block");
    }

    public Flight() {
        number += 1;
        flightNumber = FLIGHT_NUMBER_PREFIX + number;
        System.out.println("executing constructor");

    }

    public void addOnePassenger() {
        passengers += 1; //passengers = passengers +1
        allPassengers += 1;
        seats -=1;
    }

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
}
