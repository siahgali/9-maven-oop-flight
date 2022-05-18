public class Main {
    public static void main(String[] args) {
        Flight montrealToIran = new Flight();
        System.out.println("montrealToIran flight number = " + montrealToIran.getFlightNumber());

        montrealToIran.addOnePassenger();
        System.out.println("Passengers = " + montrealToIran.getPassengers());
        System.out.println("Seats = " + montrealToIran.getSeats());


        montrealToIran.addOnePassenger();
        System.out.println("Passengers = " + montrealToIran.getPassengers());
        System.out.println("Seats = " + montrealToIran.getSeats());

        System.out.println("Number of passengers for montrealToIran : " +  montrealToIran.getPassengers());

        Flight montrealToToronto = new Flight();
        System.out.println("montrealToToronto flight number = " + montrealToToronto.getFlightNumber());
        montrealToToronto.addOnePassenger();
        System.out.println("Number of passengers for montrealToToronto : " +  montrealToToronto.getPassengers());

        System.out.println("All passengers: " + Flight.getAllPassengers());


    }
}
