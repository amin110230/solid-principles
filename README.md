# Solid Principles




        Design Smell: Symptoms of poor software design 

		#Rigidity -> hard/difficult to change (tightly coupled)        
            #Fragility -> breaks in many places when a single change is made. -> easy to break
		#Immobility -> hard to reuse
		#Software Viscosity -> easier to HACK than normal flow [Design-preserving methods VS Hacks]
		#Environment Viscosity -> Slow & inefficient development environment -> very long compile times -> Several minutes to deploy
		#Needless Complexity -> Elements not curriently useful in the design -> OVERDESIGN
		#Needless Repetation -> System has lots of repeated code elements
		#Opacity -> A module is difficult to understand
		

	
	SOLID
    -----		
		#Single Responsibility Principle [Just because you can doesn't mean you should]
                -> A class should have ONLY ONE reason to change
                -> A class should have ONLY ONE JOB
                -> Cohesion -> The extent to which elements in a given class class/module are Related and Relevent to one another [যার যেখানে থাকার কথা]
                -> Encapsulation -> Attributes and behavior relevant to a given object should be bundled together and hidden from outside access
                -> A given piece of resposibility should be bundled into a single class and hidden from other elements of the program
                -> Responsibility -> If a piece of software has several different kinds of users (aka, actors), then the disparate interests of each of
                    those users defines a piece of that software's resposibilities
                -> Each of those actors should be able to dictate changes in the software without affecting the actors
		
                How does it help us?
                    1.Testing --- A class with one resposibility will have far fewer test cases
                    2.Lower coupling --- Less functionality in a single class will have fewer dependencies
                    3.Organization --- Smaller, well-organized classes are easier to search than monolithic ones
		
		#Open Closed Principle
                -> Open for extension -> Add new functionality without changing exiting code
                -> Closed for modification 
                -> Bertrand Meyer (1988) proposed inheritance 
                -> Interfaces instead of superclasses
                -> Should not follow hierarchical based / inheritance based open closed principle
                -> Should follow Polymorphic based open closed principle (differentiate behavior using different interface with its implementations 
                    will get run time beahvior (ploymorphism))
                -> * different different behavior based on model will be different interface [stategy design pattern, interface segragation, separation of concern]
                -> removing conditios with ploymorphism
                > why not abstract method in abstract class instead of interface?
                # it will be implementation of hierarchical based open closed principle [anti pattern]
                # instead of implementation super class method, extends of interface will be preferable
                # composition over inheritance
			
		#Liskov Substitution Principle
                -> If S is a subtype of T then objects of type T objects may be replaced with objects of type S
                    [without altering any of the desirable properties of the program]
                -> [Barbara Liskov] Subclass methods should behave in the same way as the superclass method -> "Substitutability"
                -> *Extension of OCP
				
                Guidelines od LSP
                    1. Subtype should not throw new exceptions
                    2. Client should not know about subtype
                    3. Derived class should extend without replacing the functionality of old class
				
		#Interface Segregation Principle
                -> Clients should not be forced to depend on methods THEY DO NOT USE
                    [Whose client? -> Service (interface), Who is Client? -> The class that implements the interface]
                -> ISP was first used and formulated by Robert C Martin while consulting Xerox
			
                Guidelines od LSP
                    1. One fat interface need to be split to many SMALLER and RELEVENT interfaces 
                        so that clients can know about the interfaces that are relevant to them
					
		#Dependency Inversion Principle
                -> High-level modules should not depend on low-level modules.
                -> Both should depend on abstractions (interface or subclass)
                -> For any modification or change in lower level (service), do not change in the higher level (service)
			
                * When any controller will fetch any request from any service, controller will not know specific typed request.
                    service will be injected which specific typed request data wants. [autowiring]
                * We will use a service in a class then the service will not ne a class instance, will be a interface.
                    So that we can put the implementation of interface from outside depending on use case.
