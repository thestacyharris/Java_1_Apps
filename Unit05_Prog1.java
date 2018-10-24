/**
 * Class: CIST 2371 Introduction to Java
 * Semester: Fall 2018
 * Instructor: Stevie Prettyman
 * Description: Solution to Unit 05 Part 1
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

public class Unit05_Prog1 {

    public static void main(String arg[])
    {
        int count=0;
        //gets number of args from input on command prompt
        for(int i=0;i<arg.length;i++)
            for (int l = 0; l < arg[i].length(); l++) {
                if (i == 0) {
                    // looks for lower case in string and counts
                    if (Character.isLowerCase(arg[i].charAt(l))) count++;
                } else {

                }
            }
        System.out.println("The number of lower case characters is: " +count);
    }
}
