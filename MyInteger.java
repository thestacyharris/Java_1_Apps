/**
 * Class: CIST 2371 Introduction to Java
 * Semester: Fall 2018
 * Instructor: Stevie Prettyman
 * Description: Solution to Unit 05 Part 2
 * Due: 10/24/2018
 * @author Stacy Harris
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */


public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //returns true if value is even
    public boolean isEven() {
        boolean isEven = false;
        if (value % 2 == 0)
            isEven = true;
        return isEven;
    }

    //returns true if value is odd
    public boolean isOdd() {
        boolean isOdd = false;
        if (value % 2 != 0)
            isOdd = true;
        return isOdd;
    }

    //returns true if value is prime
    public boolean isPrime() {
        boolean isPrime = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                isPrime = false;
            }
        }
            return isPrime;
    }

    //method //returns true if value is even
    public static boolean isEven(MyInteger n1){
        return n1.isEven();
    }

    //method returns true if value is odd
    public static boolean isOdd(MyInteger n1){
        return n1.isOdd();
    }

    //method //returns true if value is prime
    public static boolean isPrime(MyInteger n1){
        return n1.isPrime();
    }

    //method determines if values are equal, returns true/false
    public boolean equals(MyInteger n2){
        boolean isEqual = false;
        if (n2.getValue() == this.getValue())
            return true;
            return false;
    }

    //method converts array values to int
    public static int parseInt(char[] myArray){
        return Integer.parseInt(new String(myArray));
    }

    //method converts string to int
    public static int parseInt(String S1){
        return Integer.parseInt(S1);
    }

}
