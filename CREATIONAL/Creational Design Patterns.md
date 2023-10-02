
### Factory Design Pattern:
- We use factory design pattern, when we tend to create Similar type of Objects.
- This pattern is used when we have a superclass with multiple subclasses and based on the input, we need to return one of the sub-class. 
- **_Ex:_** 
	- Product (Interface) <------- (Books, Furniture, Clothing, Electronics)
	- Hotel Room (Interface) <-------- (Double Bed Room, Single Bed Room, Suite) 
- **_Use case:_** Create various types of payment gateways (e.g., Razorpay, Stripe) implementing a common payment interface for an e-commerce platform.
- 