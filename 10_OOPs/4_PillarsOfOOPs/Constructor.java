class Student {
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called...");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
    }    
}
