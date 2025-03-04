public class Vehicle {
    private final String licenseNumber;
    private final VechicleType type;
    public Vehicle(String licenseNumber,VechicleType type){
        this.licenseNumber = licenseNumber;
        this.type = type;
    }
    public VechicleType getType(){
        return type;
    }
    public String getLicenseNumber(){
        return licenseNumber;
    }
}
