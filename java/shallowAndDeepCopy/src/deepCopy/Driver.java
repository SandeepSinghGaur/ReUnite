package deepCopy;

public class Driver {
    public static void main(String[] args) {
        Address address = new Address("Chennai", "Tamil Nadu");
        Employee emp1 = new Employee("Sandeep", address);

        // Deep copy
        Employee emp2 = new Employee(emp1);

        // Modify emp2's address
        emp2.getAddress().setCity("Bangalore");

        // Original object remains unchanged
        System.out.println(emp1);  // Kavya lives in Chennai, Tamil Nadu
        System.out.println(emp2);  // Kavya lives in Bangalore, Tamil Nadu
    }
}
