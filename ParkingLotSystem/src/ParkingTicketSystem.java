public class ParkingTicketSystem {
    private int ticketCounter;

    public ParkingTicketSystem() {
        this.ticketCounter = 0;
    }

    public ParkingTicket issueTicket(Vehicle vehicle, ParkingSpot spot) {
        ticketCounter++;
        return new ParkingTicket(
                "TICKET-" + ticketCounter,
                vehicle,
                spot,
                System.currentTimeMillis()
        );
    }

    public double calculateFee(ParkingTicket ticket) {
        long entryTime = ticket.getEntryTime();
        long exitTime = System.currentTimeMillis();
        long durationInMillis = exitTime - entryTime;
        long durationInHours = durationInMillis / (60 * 60 * 1000);

        // Add a minimum of 1 hour
        durationInHours = Math.max(1, durationInHours);

        // Base rate depending on vehicle type
        double hourlyRate;
        switch (ticket.getVehicle().getType()) {
            case MOTORCYCLE:
                hourlyRate = 1.0;
                break;
            case COMPACT:
                hourlyRate = 2.0;
                break;
            case ELECTRIC:
                hourlyRate = 2.5;
                break;
            case SUV:
                hourlyRate = 3.0;
                break;
            case TRUCK:
                hourlyRate = 4.0;
                break;
            default:
                hourlyRate = 2.0;
        }

        return hourlyRate * durationInHours;
    }

}
