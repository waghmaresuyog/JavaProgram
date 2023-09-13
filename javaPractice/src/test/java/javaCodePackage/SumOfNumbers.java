package javaCodePackage;

public class SumOfNumbers {
    public static void main(String[] args) {

        int index, number = 5, sum = 0;

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