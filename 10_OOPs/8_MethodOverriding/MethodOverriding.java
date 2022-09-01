// Parent and child classes both contain the same function with a different definition.

class Animal{
    void eat(){
        System.out.println("Eats Anything...");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass...");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }    
}
