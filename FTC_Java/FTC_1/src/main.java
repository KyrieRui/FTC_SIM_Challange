public class Main {
    public static void main(String[] args) {
        // 创建一个对象
        Dog myDog = new Dog("Buddy", 3);
        
        // 访问对象的属性和方法
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        myDog.makeSound(); // 输出 "Woof woof"
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
