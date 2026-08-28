import java.util.*;

class Ride {
    String passenger, driver, pickup, destination;
    double distance, fare;

    Ride(String p, String d, String from, String to, double km) {
        passenger = p;
        driver = d;
        pickup = from;
        destination = to;
        distance = km;
        fare = 50 + (km * 15);
    }

    void display() {
        System.out.println("\n--- Ride Details ---");
        System.out.println("Passenger: " + passenger);
        System.out.println("Driver: " + driver);
        System.out.println("From: " + pickup);
        System.out.println("To: " + destination);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs." + fare);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Passenger name: ");
        String passenger = sc.nextLine();

        System.out.print("Driver name: ");
        String driver = sc.nextLine();

        System.out.print("Pickup location: ");
        String pickup = sc.nextLine();

        System.out.print("Destination: ");
        String destination = sc.nextLine();

        System.out.print("Distance (km): ");
        double distance = sc.nextDouble();

        Ride ride = new Ride(
            passenger, driver, pickup, destination, distance
        );

        ride.display();

        sc.close();
    }
}