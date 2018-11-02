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

public class Employee extends Person {
    private String officeNum;
    private double salary;
    private String dateHired;

    public Employee(){

    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getOfficeNum() {
        return officeNum;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String toString(){
        return "Classname " + this.getClass().getSimpleName() + ", name = " + getName();
    }
}
