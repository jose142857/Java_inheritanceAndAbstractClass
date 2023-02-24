public class Car extends Transport{
    private String fuelType;

    public Car(String transportType, Manufactor manufactor, String fuelType) {
        super(transportType, manufactor);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double getAccelerate() {
        return 100;
    }
}
