public class Car extends Vehicle{
    public Car(String licenseNumber, boolean isCompact) {
        super(licenseNumber, isCompact?VechicleType.COMPACT:VechicleType.SUV);
    }
}
