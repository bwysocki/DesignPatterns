# DesignPatterns
Presentation of design patterns.

Factory - A factory returns an instance of any one of several possible classes that have a common parent class. The common parent class can be an abstract class, or an interface. The calling program typically has a way of telling the factory what it wants, and the factory makes the decision which subclass should be returned to the calling program. It then creates an instance of that subclass, and then returns it to the calling program.

Abstract Factory - Provides a contract for creating families of related or dependent objects without having to specify their concrete classes.

Builder - Separate the construction of a complex object from its representation, allowing the same construction process to create various representations. When you have an object that has many fields.  Using constructors can become unwieldy and confusing. Using setters can cause that you will create objects that are not legal domain objects (not all mandatory fields set) and with setters we cannot create immutable objects. Supports immutable objects.

Prototype - Design patern where you specify the kinds of objects to create using a prototypical instance, and create new objects by copying/cloning this prototype.
To implement the pattern, declare an abstract base class that specifies a pure virtual clone() method. Any class that needs a "polymorphic constructor" capability derives itself from the abstract base class, and implements the clone() operation. Examples: java.lang.Object#clone() (the class has to implement java.lang.Cloneable)

Factory method - Creational method returning an implementation of an abstract/interface type without having to specify the exact class. Creation through inheritance.
Useful when you need a complicated process for constructing the object, when the construction need a dependency that you do not want for the actual class, when you need to construct different objects etc. An alternative to constructors - mostly when constructors aren't expressive enough.