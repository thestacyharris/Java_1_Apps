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

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){

    }
    public void setSide(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return side * 4;
    }

    public String howToColor(){
        return "color all four sides";
    }
}
