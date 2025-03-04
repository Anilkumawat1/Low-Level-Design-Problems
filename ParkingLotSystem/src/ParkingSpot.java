public class ParkingSpot {
    private final String spotId;
    private final ParkingSpotType type;
    private Vehicle vehicle;
    private boolean isAvailable;

    public ParkingSpot(String spotId,ParkingSpotType type){
        this.spotId = spotId;
        this.type = type;
        this.isAvailable = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable = false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        isAvailable = true;
    }
    public String getSpotId(){
        return spotId;
    }
    public ParkingSpotType getType(){
        return type;
    }
}
