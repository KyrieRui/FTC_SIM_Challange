public class Main {
    public static void main(String[] args) {
        String x = "1"; 
        int y = (int)x + 2; // Explicit casting
        //vbyte -> short -> int -> long
    }
}

// Class and Object: We define a class Animal with properties 
//                   name and age, and a method makeSound. 
// Then, we define a subclass Dog that inherits from Animal 
//                  and overrides the makeSound method.
// Encapsulation: The properties name and age are private, 
//                meaning they can only be accessed through public methods (getters).
// Inheritance: The Dog class inherits from the Animal class, 
//              so it has all the properties and methods of Animal.
// Polymorphism: In the Dog class, we override the makeSound method. 
//               When we call myDog.makeSound(), 
//               it executes the method defined in the Dog class, 
//               not the one in the Animal class.
