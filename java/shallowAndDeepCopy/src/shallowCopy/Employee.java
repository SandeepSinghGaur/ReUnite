package shallowCopy;

class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy constructor
    public Employee(Employee other) {
        this.name = other.name;
        this.address = other.address; // 👈 shallow copy (shared reference)
    }

    public Address getAddress() { return address; }

    @Override
    public String toString() {
        return name + " lives in " + address.toString();
    }
}
