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

Command - To wrap a command in an object so that it can be stored, passed into methods, and returned like any other object. When you need to issue requests to objects without knowing anything about the operation being requested or the receiver of the request. Create a command object that will passed to execusion to callback objects. Example: java.lang.Runnable, javax.swing.Action

Interpreter This pattern generally describes defining a grammar for that language and using that grammar to interpret statements in that format. A class of problems occurs repeatedly in a well-defined and well-understood domain. If the domain were characterized with a "language", then problems could be easily solved with an interpretation "engine". Examples: java.util.Pattern, java.text.Normalizer, java.text.Format

Mediator - Control tower. An object that encapsulates how a set of objects interact. Used to reduce the number of direct dependencies between classes by introducing a single object that manages message distribution. We want to design reusable components, but dependencies between the potentially reusable pieces demonstrates the "spaghetti code" phenomenon. Create class that mediates between classes (for example producer/consumer) and decouples them. Examples: java.util.Timer, java.util.concurrent.Executor#execute(), java.util.concurrent.ExecutorService#submit(), java.lang.reflect.Method#invoke()

Memento - This is a snapshot of an object�s state, so that the object can return to its original state without having to reveal it's content. Date does this by actually having a long value internally. Need to restore an object back to its previous state (e.g. "undo" or "rollback" operations). There are three ways to achive memento: Serialization. A class declared in the same package. The object can also be accessed via a proxy, which can achieve any save/restore operation on the object. Examples: java.util.Date, java.io.Serializable.

Observer - (publish/subscribe) Used to provide a way for a component to flexibly broadcast messages to interested receivers. A large monolithic design does not scale well as new graphing or monitoring requirements are levied.  Implement �Subject� object that will notify registered �Observer�s about an event. The Subject may "push" information at the Observers, or, the Observers may "pull" the information they need from the Subject. Examples: java.util.EventListener, javax.servlet.http.HttpSessionBindingListener, javax.servlet.http.HttpSessionAttributeListener, javax.faces.event.PhaseListener

State - This allows you easily change an object�s behavior at runtime based on internal state. When a monolithic object's behavior is a function of its state, and it must change its behavior at run-time depending on that state or, an application is characterised by large and numerous case statements that vector flow of control based on the state of the application Examples : java.util.Iterator, javax.faces.lifecycle.LifeCycle#execute()

Strategy - Enables an algorithm's behavior to be selected at runtime. Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it. When you need to choose implementation at runtime (other implementation is required during local, in test  or on production running application). To implement, use interface and its methods (not concrete implementation). Create some config (java, xml) that will choose implementation in runtime (based on environment). Using strategy enables you to defer decisions about which implementation to use. Often used with dependency injection.  

