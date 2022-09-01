// Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Derived Class
class Fish extends Animal{ // Single Level Inheritance
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}

// Derived Class
class Rohu extends Fish{ // Multilevel Inheritance
    int quantity;

    void weEat(){
        System.out.println("We Eating");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
