// Static Keyword in java is used to share the same
// variable or method of a given class.
// We cam make static to--> Variables, Functions, Blocks, Nested Class.


class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}


public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SGPS"; // Changes for all.

        Student s2 = new Student();
        System.out.println(s2.schoolName); // Prints previous assigned. 
    }    
}
