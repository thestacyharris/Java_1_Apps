**
 * Class: CIST 2371 Introduction to Java
 * Semester: Fall 2018
 * Instructor: Stevie Prettyman
 * Description: Solution to Unit 04
 * Due: 10/04/2018
 *
 * @author Stacy Harris
 * @version 1.0
 * <p>
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 */

package Unit_04;

public class Account {

    // Properties of each account
    private String accountNum;
    private String accountType;
    private String cardNum;
    private String expireDate;


    //Getters and Setters

    public void setAccountNum(String acctNo) {
        accountNum= acctNo;
    }
    public String getAccountNum() {
        return accountNum;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String acctType) {
        accountType = acctType;
    }

    public String getCardNum(){
        return cardNum;
    }
    public void setCardNum(String cardNo) {
        cardNum = cardNo;
    }

    public String getExpireDate(){
        return expireDate;
    }
    public void setExpireDate(String expDate) {
        expireDate = expDate;
    }

    //generic constructor
    public Account(){
        accountNum = " ";
        accountType = " ";
        cardNum = " ";
        expireDate = " ";
    }

    //4-arg constructor
    public Account(String acctNo, String acctType, String cardNo, String expDate){
        accountNum = acctNo;
        accountType = acctType;
        cardNum = cardNo;
        expireDate = expDate;
    }

    //displays account information
    public void display(){
        System.out.println("The account number is:  " +getAccountNum());
        System.out.println("The account type is:  " +getAccountType());
        System.out.println("The debit card number is:  " +getCardNum());
        System.out.println("The debit card expiration date is:  " +getExpireDate());

    }

}
