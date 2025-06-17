package deepCopy;
class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor
    public Employee(Employee other) {
        this.name = new String(other.name);
        this.address = new Address(other.address); // deep copy
    }

    public Address getAddress() { return address; }

    @Override
    public String toString() {
        return name + " lives in " + address.toString();
    }
}

