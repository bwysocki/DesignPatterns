# DesignPatterns
Presentation of design patterns.

Factory - A factory returns an instance of any one of several possible classes that have a common parent class. The common parent class can be an abstract class, or an interface. The calling program typically has a way of telling the factory what it wants, and the factory makes the decision which subclass should be returned to the calling program. It then creates an instance of that subclass, and then returns it to the calling program.

Abstract Factory - Provides a contract for creating families of related or dependent objects without having to specify their concrete classes.

Builder - Separate the construction of a complex object from its representation, allowing the same construction process to create various representations. When you have an object that has many fields.  Using constructors can become unwieldy and confusing. Using setters can cause that you will create objects that are not legal domain objects (not all mandatory fields set) and with setters we cannot create immutable objects. Supports immutable objects.
