package homework1;

public class Country {
    private String country;

    public Country (String country) {
        this.country = country;
    }

    public Country (Country other) {
        this.country = other.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
