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

public class GeometricObject {
    private String color;
    private boolean filled;
    private String creationDate;

    public GeometricObject(){

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
