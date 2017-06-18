package be.eekhaut.kristof.pamie.customer.domain;

public class CustomerName {

    private String firstName;
    private String lastName;

    public CustomerName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
