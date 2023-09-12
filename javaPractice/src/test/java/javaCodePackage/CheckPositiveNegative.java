package javaCodePackage;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        int input;
        input = 30;
        findPositiveNegative(input);
    }

    public static void findPositiveNegative(int input) {
        String result = null;
        if (input > 0) {
            System.out.println("Number is positive");
        } else if (input < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
//Write a Java program to get a number from the user and print whether it is positive or negative.
//Test Data
//Input number: 35
//OutPut:Number is positive