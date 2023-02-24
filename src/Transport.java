public abstract class Transport {
    protected String transportType;
    protected Manufactor manufactor;

    public Transport(String transportType, Manufactor manufactor) {
        this.transportType = transportType;
        this.manufactor = manufactor;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public Manufactor getManufactor() {
        return manufactor;
    }

    public void setManufactor(Manufactor manufactor) {
        this.manufactor = manufactor;
    }
    public String getManufactorName(){
    return this.manufactor.getManufatorName();
    }
    public void start(){
        System.out.println("It get started");
    }

    public void accelerate(){
        System.out.println("It get faster");
    }

    public void stop(){
        System.out.println("It get stopped");
    }

    public abstract double getAccelerate();



}
