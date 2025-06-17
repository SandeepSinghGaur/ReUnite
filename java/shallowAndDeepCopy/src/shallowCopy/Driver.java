package shallowCopy;
/*
✅ When is Shallow Copy Used and Useful in Java?
⚙️ General Use Case
Use shallow copy when you want to duplicate an object, but:

You are okay with shared references inside it.

The nested or referenced objects are immutable or not meant to change independently.

You want to reduce memory usage and improve performance by avoiding full duplication.

💡 Real-World Examples Where Shallow Copy is Useful
Scenario	Why Shallow Copy is Suitable
DTO to DTO mapping	Often the nested fields are read-only
Cloning config/state objects	Configuration values don't change — safe to share references
Frameworks (e.g., Spring Bean copying)	Spring sometimes uses shallow copies for proxy objects
Caching layer (when data is immutable)	Saves memory when data can be reused safely
Collections of immutable data	You can share references safely if objects aren't modified

📌 Example: Copying a Product Object with Shared Category
java
Copy
Edit
class Category {
    String name;
    Category(String name) {
        this.name = name;
    }
}

class Product {
    String name;
    Category category;

    Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    // Shallow copy
    Product(Product other) {
        this.name = other.name;
        this.category = other.category; // shared reference
    }
}
✅ Safe when:

The Category object won’t change or is treated as immutable

You don’t mind product1.category == product2.category

🧠 When Shallow Copy Is Automatically Used in Java
Operation	Copy Type	Notes
Assignment (=)	Reference	No copy at all
Object.clone() default	Shallow copy	Only copies fields, not nested objects
Array.clone()	Shallow copy	Clones array, but elements are shared
ArrayList.clone()	Shallow copy	List is cloned, but elements are not

java
Copy
Edit
List<StringBuilder> list1 = new ArrayList<>();
list1.add(new StringBuilder("Java"));
List<StringBuilder> list2 = (ArrayList<StringBuilder>) ((ArrayList<StringBuilder>) list1).clone();

list2.get(0).append(" 8");
System.out.println(list1.get(0)); // Output: Java 8 (shared object)
🧠 Key Advantages of Shallow Copy
Advantage	Description
✅ Fast	No recursion — just field-level copy
✅ Memory efficient	Reuses references — avoids duplicating data
✅ Simpler	Easier to implement

⚠️ When to Avoid Shallow Copy
If the object graph contains mutable fields

If changes in one instance shouldn’t affect the other

If thread safety or complete isolation is required

✅ Summary
Use Shallow Copy When…
Objects are immutable
Shared references are intentional
You need better performance and lower memory usage
You don’t care if nested objects are shared

 */
public class Driver {
    public static void main(String[] args) {
        Address address = new Address("Chennai", "Tamil Nadu");
        Employee emp1 = new Employee("Sandeep", address);

        // Shallow copy
        Employee emp2 = new Employee(emp1);

        // Change address in the second employee
        emp2.getAddress().setCity("Bangalore");

        // Both objects are affected
        System.out.println(emp1);  // Output: Kavya lives in Bangalore, Tamil Nadu
        System.out.println(emp2);  // Output: Kavya lives in Bangalore, Tamil Nadu
    }
}
