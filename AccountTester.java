/**
 * Class: CIST 2371 Introduction to Java
 * Semester: Fall 2018
 * Instructor: Stevie Prettyman
 * Description: Solution to Unit 04
 * Due: 10/04/2018
 **
 * @author Stacy Harris
 * @version 1.0
 * <p>
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 */

package Unit_04;

import java.util.Scanner;

public class AccountTester {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the account number: ");
        String acctNo=input.next();

        System.out.println("Enter the account type: ");
        String acctType=input.next();

        System.out.println("Enter the debit card number: ");
        String cardNo=input.next();

        System.out.println("Enter the debit card expiration date: ");
        String expDate=input.next();

        Account a1;
        a1 = new Account(acctNo, acctType, cardNo, expDate);
       a1.display();

        System.out.println(" ");

        Account a2;
        a2 = new Account ("1236", "savings", "97896", "11/21");
        a2.display();

    }

}
