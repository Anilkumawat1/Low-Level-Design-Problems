import exception.ParkingNotFoundException;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("Downtown Parking", 3);

        Vehicle car1 = new Car("CA-1234", true);
        Vehicle car2 = new Car("CA-5678", false);
        Vehicle motorcycle = new MotorCycle("MC-1234");
        Vehicle truck = new Truck("TR-1234");

        try {
            // Park vehicles
            ParkingTicket ticket1 = parkingLot.parkVehicle(car1);
            System.out.println("Car 1 parked at spot: " + ticket1.getParkingSpot().getSpotId());

            ParkingTicket ticket2 = parkingLot.parkVehicle(car2);
            System.out.println("Car 2 parked at spot: " + ticket2.getParkingSpot().getSpotId());

            ParkingTicket ticket3 = parkingLot.parkVehicle(motorcycle);
            System.out.println("Motorcycle parked at spot: " + ticket3.getParkingSpot().getSpotId());

            ParkingTicket ticket4 = parkingLot.parkVehicle(truck);
            System.out.println("Truck parked at spot: " + ticket4.getParkingSpot().getSpotId());

            // Unpark a vehicle and calculate fee
            double fee = parkingLot.unParkVehicle(ticket2);
            System.out.println("Car 2 unparked. Fee: $" + fee);

        } catch (ParkingNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}