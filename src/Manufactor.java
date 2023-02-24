public class Manufactor {
    private String manufatorName;
    private String countryName;

    public Manufactor(String manufatorName, String countryName) {
        this.manufatorName = manufatorName;
        this.countryName = countryName;
    }

    public String getManufatorName() {
        return manufatorName;
    }

    public void setManufatorName(String manufatorName) {
        this.manufatorName = manufatorName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
