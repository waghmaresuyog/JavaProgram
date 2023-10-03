package LoopingPattern;

public class StarPatternOne {

    public static void main(String[] args) {
        int total = 5;
        for (int row = total; row > 0; row--) {

            for (int spc = total - row; spc > 0; spc--) {
                System.out.print(" ");
            }
            for (int rowTwo = 0; rowTwo < row; rowTwo++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Write a Java program to generate the following * triangles.
//Output:
/*
 *****
 ****
  ***
   **
    *
Process finished with exit code 0
 */
