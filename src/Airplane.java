public class Airplane extends Transport{
    private String fuelType;

    public Airplane(String transportType, Manufactor manufactor, String fuelType) {
        super(transportType, manufactor);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void takeOff(){
        System.out.println("It took off");
    }

    public void landing(){
        System.out.println("It is landing");
    }

    @Override
    public double getAccelerate() {
        return 900;
    }
}
