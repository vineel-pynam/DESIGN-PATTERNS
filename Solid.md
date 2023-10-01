### Single Responsibility:
- A class should hold only one responsibility.
- A class should only have single reason to change.
- It is highly subjective depends on the context as well.

### Open Closed Principle:
- Open for Extension and Closed for Modification.
- It means that the code which is already tested, should not tested again we add some new features/functionality.

### Liskov-Substitution Principle:
- Base Class should seamlessly replaced with Derived classes.
- Using interfaces we can achieve this.

### Interface Segregation:
- Create Smaller and more specific Interfaces.
- No class should be forced to implement  methods that it won't require. So we should create smaller interfaces to mitigate this issue.

### Dependency Inversion Principle:
- High level modules should not depend on low level modules.
- There will be an abstraction layer in between High level and Low Level Modules.
- Notification Manager -> (Notification Sender (Interface) ) -> (Whatsapp Sender, SMS Sender, Gmail Sender (implements Notification Sender)).

