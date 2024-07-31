/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        String s = new String("5");
int a = 4;
int b = 5;
String st = a++ + --b + s + a-- + ++b;
System.out.println(st + " " + a + b);
    }
}