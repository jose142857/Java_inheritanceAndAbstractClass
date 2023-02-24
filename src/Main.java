public class Main {
    public static void main(String[] args) {
        Manufactor m1 = new Manufactor("HonDa","Japan");
        Manufactor m2 = new Manufactor("Airbus","America");

        Transport t1 = new Airplane("Airplane",m2,"Diesel");
        Transport t2 = new Car("Car",m1,"Electronic");
        Transport t3 = new Bicycle("Bicycle",m1);

        System.out.println(t1.getManufactorName());
        System.out.println(t1.manufactor.getCountryName());
        System.out.println(t1.getAccelerate());

        System.out.println("TEST T2");
        System.out.println("\n");
        System.out.println(t2.getManufactorName());
        System.out.println(t2.manufactor.getCountryName());
        System.out.println(t2.getAccelerate());


        System.out.println("TEST T3");
        System.out.println("\n");
        System.out.println(t3.transportType);
        System.out.println(t3.getManufactorName());
        System.out.println(t3.manufactor.getCountryName());
        System.out.println(t3.getAccelerate());


    }
}