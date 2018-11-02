/**
 * Class: CIST 2371 Introduction to Java
 * Semester: Fall 2018
 * Instructor: Stevie Prettyman
 * Description: Solution to Unit 06 Part 2
 * Due: 11/2/2018
 * @author Stacy Harris
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class Unit06_Prog2 {
    public static void main(String[] args){

        Square testSquare = new Square();
        testSquare.setSide(6.0);
        testSquare.setColor("Blue");
        testSquare.setFilled(true);

        System.out.println(testSquare.howToColor());
        System.out.println("The color of the square is " + testSquare.getColor());
        System.out.println("The area of the square is " + testSquare.getArea());
        System.out.println("The perimeter of the square is " + testSquare.getPerimeter());
        System.out.println("Is the square filled? " + testSquare.getFilled());
        System.out.println("How should you color? " + testSquare.howToColor());
    }
}
