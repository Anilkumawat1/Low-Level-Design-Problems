import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    private final int floorNumber;
    private final Map<ParkingSpotType, List<ParkingSpot>> spots;

    public ParkingFloor(int floorNumber){
        this.floorNumber = floorNumber;
        this.spots = new HashMap<>();
        spots.put(ParkingSpotType.COMPACT,createSpots(ParkingSpotType.COMPACT,10));
        spots.put(ParkingSpotType.ELECTRIC,createSpots(ParkingSpotType.ELECTRIC,10));
        spots.put(ParkingSpotType.LARGE,createSpots(ParkingSpotType.LARGE,10));
        spots.put(ParkingSpotType.MOTORCYCLE,createSpots(ParkingSpotType.MOTORCYCLE,10));
    }
    public List<ParkingSpot> createSpots(ParkingSpotType type,int count){
        List<ParkingSpot> spotList = new ArrayList<>();
        for(int i=0;i<count;i++){
            String spotId = floorNumber + "-" + type;
            spotList.add(new ParkingSpot(spotId,type));
        }
        return spotList;
    }
    public boolean isFull(){
        for(List<ParkingSpot> parkingSpot : spots.values()){
            for(ParkingSpot spot : parkingSpot){
                if(spot.isAvailable()){
                    return true;
                }
            }
        }
        return false;
    }
    public ParkingSpot findParkingSpot(VechicleType vechicleType){
        ParkingSpotType parkingSpotType = getSpotTypeForVehicle(vechicleType);
        for(ParkingSpot parkingSpot: spots.get(parkingSpotType)){
            if(parkingSpot.isAvailable()){
                return parkingSpot;
            }
        }
        if (vechicleType == VechicleType.COMPACT && spots.containsKey(ParkingSpotType.LARGE)) {
            for (ParkingSpot spot : spots.get(ParkingSpotType.LARGE)) {
                if (spot.isAvailable()) {
                    return spot;
                }
            }
        }

        return null;
    }
    public ParkingSpotType getSpotTypeForVehicle(VechicleType vechicleType){
        switch (vechicleType){
            case MOTORCYCLE:
                return ParkingSpotType.MOTORCYCLE;
            case COMPACT:
                return ParkingSpotType.COMPACT;
            case SUV:
            case TRUCK:
                return ParkingSpotType.LARGE;
            case ELECTRIC:
                return ParkingSpotType.ELECTRIC;
            default:
                return ParkingSpotType.LARGE;
        }
    }
}
