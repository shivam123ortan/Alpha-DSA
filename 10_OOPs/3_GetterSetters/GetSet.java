class Pen {
    private String color;
    private int tip;


    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Red");
        System.out.println(p.getColor());
    }    
}
