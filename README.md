# designPatterns
Practising the use of the Abstract Factory, Composite and Observer design patterns in Java.

#### TODO
+ rework the composite pattern to more closely resemble a general approach


### Abstract factory design pattern
+ (+) removes new() calls from most functions.
+ (+) ideally, it can create an additional abstraction layer for interacting and using the included classes.
+ (-) adds an additional layer of complexity and abstraction.
+ (-) doesn't really make sense unless there's a bunch of classes that exhibit similar behavior.
+ (-) small changes of components of factories might require more wide-ranging changes / restructuring or related or dependent components.

### Composite design pattern
+ (+) allows interacting with objects in the same way as with a collection of objects
+ (+) is recursive, which is often of advantage, and generally allows for shorter code
+ (+) the most intuitive way of representing many data structures, such as trees or file directories (also trees)
+ (-) might overly generalize the data structure.

### Observer design pattern
+ (+) allows for efficient separation of trigger and reaction, loosely connecting interacting objects; thus reinforcing the core principles of OOP.
+ (+) removes the need for observing clients to check a condition constantly, since once the condition is met, the info is pushed to the Observers.
+ (+) multiple protocols possible, including pushing and pulling.
+ (-) as with any of the above: might add unnecessary complexity.