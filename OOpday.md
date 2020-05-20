Goals for today:
- review and cement the basic OOP principles 
- become a little more comfortable with "big" applications 
- our thought process when we need to start designing an application 

Car Dealership
- which to design first? the public interface or the inner details
    - "top down or bottom up" design concept 
    - depends on a lot of factors and most teams will use both when delievering software
- Top Down: identify "top level" objects first then find objects that represent smaller portions of the system. 
    - We continually refine those definitions until the system is complete
    - In our Dealership application this may look like this designing objects in this order:
        - Dealership
        - Departments
        - Staff
        - Vehicles
- Bottom Up: the lowest level of objects would be designed first and then those objects would be combined into bigger modules until the overall system is complete. 
    - In the Dealership this would be designed in this order:
        - Vehicles
        - Departments
        - Dealership
        - Staff 

Starting with Vehicles
- object hierarchy 
    - "Gen-Spec" (Generalized-Specialized) / "is-a" relationship
    - Find common abstractions and model those in our base class then having specicialized classes derive those from the base class.

New things we learned about today:
1. Enumerations
2. instanceof keyword
3. How to work with a multifile Java program in VS Code 
4. Brief info to annotations, mainly @Override 