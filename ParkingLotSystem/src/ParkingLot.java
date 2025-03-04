import exception.ParkingNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final String name;
    private final List<ParkingFloor> floors;
    private final ParkingTicketSystem ticketSystem;

    public ParkingLot(String name,int numberOfFloor){
        this.name = name;
        this.floors = new ArrayList<>();
        for(int i=0;i<numberOfFloor;i++){
            floors.add(new ParkingFloor(i));
        }
        this.ticketSystem = new ParkingTicketSystem();
    }

    public ParkingTicket parkVehicle(Vehicle vehicle){
        for(ParkingFloor parkingFloor : floors){
            ParkingSpot parkingSpot = parkingFloor.findParkingSpot(vehicle.getType());
            if(parkingSpot!=null){
                parkingSpot.assignVehicle(vehicle);
                return ticketSystem.issueTicket(vehicle,parkingSpot);
            }
        }
        throw new ParkingNotFoundException("Parking spot not available");
    }
    public double unParkVehicle(ParkingTicket parkingTicket){
        ParkingSpot parkingSpot = parkingTicket.getParkingSpot();
        parkingSpot.removeVehicle();
        return ticketSystem.calculateFee(parkingTicket);
    }
    public boolean isFull() {
        for (ParkingFloor floor : floors) {
            if (!floor.isFull()) {
                return false;
            }
        }
        return true;
    }

}
