package LoopingPattern;

public class StarPatternTwo {

    public static void main(String[] args) {
        int totalStar = 5;

        for (int rowOne = 0; rowOne < totalStar; rowOne++) {
            for (int spc = totalStar - rowOne; spc > 0; spc--) {
                System.out.print(" ");
            }
            for (int rowTwo = 0; rowTwo <= rowOne; rowTwo++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Write a Java program to generate the following *'s triangle.
/*
     *
    **
   ***
  ****
 *****

Process finished with exit code 0
 */
