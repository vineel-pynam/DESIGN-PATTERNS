
### Encapsulation:
- It is the process of wrapping up code and data together in a single unit(Class).
- We restrict direct access to some members/components of the class.
- **Ex:** Getters and Setters Methods are used to set values to variables defined in the class instead of accessing directly from the instance of the class object.
- We use Access Modifiers to control the access to the members of the class.

### Access Modifiers: 
- **Private:**
	- Methods/Variables can only be accessed by the class itself. They cannot be accessed outside the class.
- **Protected:**
	- Methods/Variables can only be accessed by the class and sub-classes. In java, they can be accessed by all classes within the same package.
- **Public:**
	- Methods/Variables can be accessed outside the class.

### Abstraction:
- It is the process of hiding the implementation details from the user and showing only functionality to the user.
- It can be achieved by Abstract Classes, Interfaces.
- Abstract Classes or Interfaces cannot be instantiated on it's own and is meant to be inherited by concrete classes.
- **Abstract Classes:**
	- Can have abstract and non abstract methods.
	- Abstract methods must be implemented by the derived classes.
- **Interfaces**
	- It has only abstract methods.

### Inheritance:
- It is a process in which sub/derived - classes acquire/use methods and properties from the parent class.
- It is a **IS-A** relationship which is also known as Parent-Child Relationship.
- **Types:**
	- **Single:** Class B extends Class A
	- **Multi-Level:** Class C extends Class B extends Class A
	- **Hierarchical:** Class B and Class C extends Class A
	- **Multiple:** Class C extends Class A and Class B
	- **Hybrid:** Class D extends Class B and Class C. Class B and Class C extends Class A.

### Polymorphism:
- Ploy means many. morphism means forms => many forms
- **Compile Time Polymorphism:**
	- **Method Overloading:** Same function with different parameters.
	- At the compile itself overloaded functions will be treated as different functions and then compiled.
- **Run Time Polymorphism:**
	- **Method Overriding:** Same Function with same parameters overridden in subclasses.
	- When we are executing/running the program, at that point of time it will decided whether to call subclass method or parent class method.



