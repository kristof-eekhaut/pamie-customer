package be.eekhaut.kristof.pamie.customer.domain;

public class Address {

    private String street;
    private String houseNumber;
    private int postalCode;
    private String city;

    private Address(Builder builder) {
        street = builder.street;
        houseNumber = builder.houseNumber;
        postalCode = builder.postalCode;
        city = builder.city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String street;
        private String houseNumber;
        private int postalCode;
        private String city;

        private Builder() {
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder houseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder postalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
