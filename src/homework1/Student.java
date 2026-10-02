package homework1;

public final class Student {
    private final String name;
    private final Country country;

    public Student(String name, Country country) {
        this.name = name;
        this.country = new Country(country);
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return new Country(country);
    }
}