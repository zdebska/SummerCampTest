/**
 * SummerCampTest.java
 * 
 * This program prints the numbers from 1 to 100, but for multiples of 2, it prints "Baz" instead of the number,
 * and for multiples of 5, it prints "inga!". For numbers that are multiples of both 2 and 5, it prints "Bazinga!".
 * 
 * @author Zdebska Kateryna
 */

public class SummerCampTest {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            String outputString = "";
            if (i % 2 == 0) {
                outputString += "Baz";
            } 
            if (i % 5 == 0) {
                outputString += "inga!";
            }
            if (outputString.equals("")) {
                outputString = Integer.toString(i);
            }
            System.out.println(outputString);
        }
    }
}