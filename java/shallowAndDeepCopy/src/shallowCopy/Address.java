package shallowCopy;

class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void setCity(String city) { this.city = city; }
    public String getCity() { return city; }

    public String getState() { return state; }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}

