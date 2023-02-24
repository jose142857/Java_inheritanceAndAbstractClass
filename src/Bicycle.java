public class Bicycle extends Transport{
    public Bicycle(String transportType, Manufactor manufactor) {
        super(transportType, manufactor);
    }

    @Override
    public double getAccelerate() {
        return 30;
    }
}
