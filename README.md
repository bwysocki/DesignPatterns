# DesignPatterns
Presentation of design patterns.

Factory - A factory returns an instance of any one of several possible classes that have a common parent class. The common parent class can be an abstract class, or an interface. The calling program typically has a way of telling the factory what it wants, and the factory makes the decision which subclass should be returned to the calling program. It then creates an instance of that subclass, and then returns it to the calling program.

Abstract Factory - Provides a contract for creating families of related or dependent objects without having to specify their concrete classes.

Builder - Separate the construction of a complex object from its representation, allowing the same construction process to create various representations. When you have an object that has many fields.  Using constructors can become unwieldy and confusing. Using setters can cause that you will create objects that are not legal domain objects (not all mandatory fields set) and with setters we cannot create immutable objects. Supports immutable objects.

Prototype - Design patern where you specify the kinds of objects to create using a prototypical instance, and create new objects by copying/cloning this prototype.
To implement the pattern, declare an abstract base class that specifies a pure virtual clone() method. Any class that needs a "polymorphic constructor" capability derives itself from the abstract base class, and implements the clone() operation. Examples: java.lang.Object#clone() (the class has to implement java.lang.Cloneable)

Factory method - Creational method returning an implementation of an abstract/interface type without having to specify the exact class. Creation through inheritance.
Useful when you need a complicated process for constructing the object, when the construction need a dependency that you do not want for the actual class, when you need to construct different objects etc. An alternative to constructors - mostly when constructors aren't expressive enough.

Singleton - Restricts the instantiation of a class to one object. Singleton can be implemented as Enum with one element or using private static final variable, or static block (to lazy initalize wrap it in the private static inner class). Also the thread save singleton can be used where getInstance method is synchronized (To prevent constant cost of synchronization use double check locking implementation).There are two ways to hack the Singleton: Reflection, Serialization. Only the Enum pattern can protect you from reflection hack. You can protect singleton from serialization hack by overriding readResolve() and returninng getInstance() from it  (enum singleton is protected by default).

Chain of responsibility - Allows for the decoupling between objects by passing a request from one object to the next in a chain until the request is recognized. The objects in the chain are different implementations of the same interface or abstract class. There is a potentially variable number of "handler" or "processing element" or "node" objects, and a stream of requests that must be handled. Need to efficiently process the requests without hard-wiring handler relationships and precedence, or request-to-handler mappings. 

