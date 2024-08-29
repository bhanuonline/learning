Design patterns are typical solutions to common problems in software design. They are not specific code implementations but general solutions that can be adapted to a variety of situations to improve code structure, efficiency, 
and maintainability.

### Creational desing pattern:Focus on object creation mechanisms

2.Factory design pattern
The Factory Method is a creational design pattern that defines an interface or an abstract class for creating an object but allows 
subclasses to decide which class to instantiate. It delegates the instantiation logic to subclasses.
This promotes loose coupling between the client code and the classes that it instantiates

Key Point : Encapsulation,Subclasses Determine Instantiation,Single Responsibility Principle

#### When to Use the Factory Method Pattern:

When the exact type of the object to be created isn't known until runtime.

#### Disadvantage :

Increased Complexity: It introduces additional classes and interfaces, adding a layer of abstraction that can make the code more complex to understand and maintain, especially for those unfamiliar with the pattern

Ex in Hybris :ModelService,InterceptorRegistry

    b.Abstract factory design pattern
    c.Singleton design pattern
    Builder
    Prototype
2. Structural design pattern
3. Behaviour Design pattern

