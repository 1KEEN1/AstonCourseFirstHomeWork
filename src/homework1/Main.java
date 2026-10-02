package homework1;

public class Main {
    public static void main(String[] args) {
        Country country = new Country("Russia");
        Student student = new Student("Egor", country);

        country.setCountry("Germany");

        System.out.println("Student: " + student.getName());
        System.out.println("Student Country: " + student.getCountry().getCountry());

        Country another = student.getCountry();
        another.setCountry("France");

        System.out.println("Student Country after change: " + student.getCountry().getCountry());
    }
}
