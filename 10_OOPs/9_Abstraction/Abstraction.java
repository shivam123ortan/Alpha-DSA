// Hiding all unnecessary details and showing only 
// the important parts to the user.

// > Cannot create an instance of abstract class.
// > Can have abstract/non-abstract methods.
// > Can have constructors.


abstract class Animal{
    String color;
    
    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("Animal eats...");
    }

    abstract void walk(); // No implementation means abstract method.
}

class Horse extends Animal{
    void changeColor(){
        color = "White";
    }
    
    void walk(){
        System.out.println("tugud tugud...");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("walks on two legs...");
    }
}


public class Abstraction {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }    
}
