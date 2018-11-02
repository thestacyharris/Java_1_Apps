/**
 * Class: CIST 2371 Introduction to Java
 * Semester: Fall 2018
 * Instructor: Stevie Prettyman
 * Description: Solution to Unit 06 Part 1
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

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(){

    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public String toString(){
        return "Classname " + this.getClass().getSimpleName() + ", name = " + getName();
    }
}
