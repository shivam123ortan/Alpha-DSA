/*
 * AND --> &&
 * OR --> ||
 * XOR --> ^
 * COMPLEMENT --> ~
 * LEFT SHIFT --> <<
 * RIGHT SHIFT --> >>
 */

public class BitwiseOperators {

    public static void main(String[] args) {
        System.out.println(5&6);

        System.out.println(5|6);

        System.out.println(5^6);
        System.out.println(5^5);

        System.out.println(~5); // It should be 2 butt-->
        // Works like
        // 5 --> 0000 0101
        // complement --> 1111 1010
        // 1's complement --> 0000 0101
        // add 1 --> 00000110 --> -6
        // not of +ve value is alway -ve

        System.out.println(10<<1);

        System.out.println(10>>1);

    }
}