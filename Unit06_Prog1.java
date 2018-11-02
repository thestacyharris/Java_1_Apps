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

public class Unit06_Prog1 {
    public static void main(String[] args){

        //tests Person Class
        Person sally = new Person();
        sally.setName("Sally Smith");
        System.out.println(sally.toString());

        //tests Student Class
        Student fred = new Student();
        fred.setName("Fred Smith");
        System.out.println(fred.toString());

        //tests Employee Class
        Employee mary = new Employee();
        mary.setName("Mary Doe");
        System.out.println(mary.toString());

        //tests Faculty Class
        Faculty donald = new Faculty();
        donald.setName("Donald Knuth");
        System.out.println(donald.toString());

        //tests Staff Class
        Staff john = new Staff();
        john.setName("John Hammer");
        System.out.println(john.toString());

    }
}
