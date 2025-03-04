public class ParkingTicket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final Long entryTime;
    private Long exitTime;
    private final ParkingSpot parkingSpot;
    private double fee;

    public ParkingTicket(String ticketId,Vehicle vehicle,ParkingSpot parkingSpot,Long entryTime){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }
    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setExitTime(Long exitTime) {
        this.exitTime = exitTime;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
