// It is used to refer immediate parent class object.
// > to access parent's properties
// > to access parent's functions
// > to access parent's constructor


class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}


public class SuperKey {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}
