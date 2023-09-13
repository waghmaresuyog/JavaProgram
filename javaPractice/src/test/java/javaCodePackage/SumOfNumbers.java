package javaCodePackage;

public class SumOfNumbers {
    public static void main(String[] args) {

        int index, number = 7, sum = 0;

        System.out.println("The first number natural numbers are : " + number);

        for (index = 1; index <= number; index++) {
            System.out.println(index);
            sum += index;
        }
        System.out.println("The Sum of Natural Number upto " + number + " terms : " + sum);
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        //Using Method return the sum of all natural numbers
        sumOfNumbers.sumOfNaturalNumber(number);
        System.out.println("The Sum of Natural Number upto " + number +
                " terms : " + sumOfNumbers.sumOfNaturalNumber(number));
    }

    public int sumOfNaturalNumber(int number) {
        int sum = 0;
        for (int index = 1; index <= number; index++) {
            // System.out.println(index);
            sum += index;
        }
        return sum;
    }
}
/*Write a Java program to display n terms of natural numbers and their sum.
Test Data
Input number: 7
OutPut :The first number natural numbers are : 7
1
2
3
4
5
6
7
The Sum of Natural Number upto 7 terms : 28
The Sum of Natural Number upto 7 terms : 28*/