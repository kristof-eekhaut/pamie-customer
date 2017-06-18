package be.eekhaut.kristof.pamie.customer.domain;

public class Customer {

    // TODO for testing / clean up
    public static final Customer CUSTOMER = Customer.builder()
            .id("123")
            .name(new CustomerName("Jos", "Bosman"))
            .address(Address.builder().street("Nieuwstraat").houseNumber("22").postalCode(1000).city("Brussel").build())
            .build();

    private String id;
    private CustomerName name;
    private Address address;

    private Customer(Builder builder) {
        id = builder.id;
        name = builder.name;
        address = builder.address;
    }

    public String getId() {
        return id;
    }

    public CustomerName getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private CustomerName name;
        private Address address;

        private Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(CustomerName name) {
            this.name = name;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
