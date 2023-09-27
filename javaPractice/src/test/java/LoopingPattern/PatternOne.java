package LoopingPattern;

public class PatternOne {

    public static void patternOne(int totalRow) {
        int numberOne;
        int numberTwo;
        for (numberOne = 1; numberOne <= totalRow; numberOne++) {
            for (numberTwo = 1; numberTwo <= numberOne; numberTwo++) {
                System.out.print(numberOne);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int one, two, three = 4;

        for (one = 1; one <= three; one++) {
            for (two = 1; two <= one; two++) {
                System.out.print(one);
                System.out.print("");
            }
            System.out.println(" ");
        }
        int totalNumber = 5;
        patternOne(totalNumber);
    }
}
