// Interface is a blueprint of a class.
// > Implements Multiple Inheritance.
// > Always implements 100%.
// > All methods are public, abstract & without implementation
// > Used to achieve total abstraction.
// > Variables in interface are final, public and static.

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}



public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }   
}
