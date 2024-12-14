**What is Composition ?**

Composition is a design principle where a class contains an instance of another class to reuse its functionality. Instead of inheriting behavior (as in inheritance), composition allows you to achieve code reuse by delegating tasks to the contained object.

**When to Use Composition ?**

When you want flexibility: Composition allows you to change the behavior dynamically of your classes by changing the objects they compose.
When inheritance is not appropriate: Inheritance creates a "is-a" relationship, while composition creates a "has-a" relationship
No Fragile Hierarchy: Composition avoids issues associated with deep inheritance hierarchies.

Ex: Vehicle class that uses a MovementStrategy

    public class Vehicle {
    private MovementStrategy movementStrategy; // Composition

    // Constructor to set an initial movement strategy
    public Vehicle(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    // Delegates the move behavior to the current strategy
    public void move() {
        movementStrategy.move();
    }

    // Allows swapping the behavior at runtime
    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }
    }

Key Differences Between Interface Implementation and Class Inheritance

    Feature	                    Interface Implementation	                Class Inheritance
    Type of Relationship	    "Can-do" relationship	                    "Is-a" relationship
    Code Sharing	            No code is inherited	                    Methods and fields are inherited
    Multiple Inheritance	    A class can implement multiple interfaces	A class can extend only one class
    Default Methods (Java 8+)	Default implementations allowed	            Concrete methods directly inherited
    Polymorphism	            Based on the interface type	                Based on the parent class type

**Short Notes: Class Implementing Interface**

Definition: A class provides concrete implementations for methods declared in an interface.
Type Inheritance: Class "inherits" the interface type for polymorphism.
Relationship: "Can-do" relationship (e.g., Dog implements Barkable).
No Code Inheritance: Only method signatures are inherited, not behavior or fields.
Multiple Implementations: A class can implement multiple interfaces.
Default Methods: Interfaces can have default method implementations (Java 8+).
Purpose: Enforces a contract, enables polymorphism, and ensures loose coupling.
Example: Animal myPet = new Dog(); // Dog implements Animal.
