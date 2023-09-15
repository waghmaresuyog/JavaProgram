package javaCodePackage;

public class FactorialNum {

    public static int calculateFactorial(int number) {
        // Base case: factorial of 0 is 1
        if (number == 0) {
            return 1;
        } else {
            // Recursive case: multiply n with factorial of (n-1)
            return number * calculateFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        int numberTwo = 7;
        int factorialTwo = calculateFactorial(numberTwo);
        System.out.println("Factorial of " + numberTwo + " is: " + factorialTwo);
    }
}
/*
Write a Java recursive method to calculate the factorial of a given positive integer.
Factorial of 5 is: 120
Factorial of 7 is: 5040
 */