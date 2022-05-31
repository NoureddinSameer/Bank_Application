/*****The Transactions class*****/
/* Here it's the default package */
package noureddinsameernaziralzar_2051710306;
/* Here I import the Date class */
import java.util.Date;
/* Here I design and implement a class and name it "Transactions" */
public class Transactions{
    /* Here I create (declare) a variable and name it "datecreatedOfTransactions" and its type is Date */
    private Date datecreatedOfTransactions;
    /* Here I create (declare) a variable and name it "Account_Number2" and its type is String */
    private String Account_Number2;
    /* Here I create (declare) a variable and name it "MoneyOfTransactions" and its type is double */
    private double MoneyOfTransactions;
    /* Here I create (declare) a variable and name it "a" and its type is Accounts */
    private Accounts a;
    /* Here I create (declare) a variable and name it "checkOfStatus" and its type is boolean */
    private boolean checkOfStatus;
    /* Constructors of Transactions class......... */
    /* Here I create the constructor of Transactions class (no-parameter) */
    public Transactions(){
        /* Here I create an object from Date class and "datecreatedOfTransactions" is the variable that is reference variable to the object */
        datecreatedOfTransactions=new Date();
        /* Here I create an object from Accounts class and "a" is the variable that is reference variable to the object */
        a=new Accounts();
        /* Here I store the value of null in the variable Account_Number2 */
        Account_Number2=null;
        /* Here I store the value of 0.0 in the variable MoneyOfTransactions */
        MoneyOfTransactions=0.0;
    }
    /* Here I create the constructor of Transactions class (two parameters) */
    public Transactions(String Account_Number,double MoneyOfTransactions){
        /* Here I create an object from Date class and "datecreatedOfTransactions" is the variable that is reference variable to the object */
        datecreatedOfTransactions=new Date();
        /* Here I create an object from Accounts class and "a" is the variable that is reference variable to the object */
        a=new Accounts();
        /* Here I call a method from the Accounts class that is set the account's number(Account_Number) */
        a.setAccount_Number(Account_Number);
        /* Here I set the amount of money that we will use in the operation of the required transaction */
        this.MoneyOfTransactions=MoneyOfTransactions;
    }
    /* Here I create the constructor of Transactions class (multiple parameters) */
    public Transactions(String Account_Number,String Account_Number2,double MoneyOfTransactions){
        /* Here I create an object from Date class and "datecreatedOfTransactions" is the variable that is reference variable to the object */
        datecreatedOfTransactions=new Date();
        /* Here I create an object from Accounts class and "a" is the variable that is reference variable to the object */
        a=new Accounts();
        /* Here I call a method from the Accounts class that is set the account's number(Account_Number) */
        a.setAccount_Number(Account_Number);
        /* Here I set the account's number that the user wants to transfer the amount of money to it(Account_Number2) */
        this.Account_Number2=Account_Number2;
        /* Here I set the amount of money that we will use in the operation of the required transaction */
        this.MoneyOfTransactions=MoneyOfTransactions;
    }
    /* Methods(Actions) of the Transactions class......... */
    @Override/* Here I override the toString method that is exist in the Object class */
    public String toString() {
        /* Here the method returns an assimilable String representation of the objects */
        return "Transactions{" + "datecreatedOfTransactions=" + datecreatedOfTransactions + ", Account_Number2=" + Account_Number2 + ", MoneyOfTransactions=" + MoneyOfTransactions + ", a=" + a + ", checkOfStatus=" + checkOfStatus + '}';
    }
    /* Getter methods(Accessor methods)......... */
    /* Here I create a method to get the date of each of the transactions that took place before(datecreatedOfTransactions)(no-parameter) */
    public Date getDatecreatedOfTransactions() {
        /* Here the method returns the date of each of the transactions that took place before(datecreatedOfTransactions) */
        return datecreatedOfTransactions;
    }
    /* Here I create a method to get the account's number that the user wants to transfer the amount of money to it(Account_Number2)(no-parameter) */
    public String getAccount_Number2() {
        /* Here the method returns the account's number that the user wants to transfer the amount of money to it(Account_Number2) */
        return Account_Number2;
    }
    /* Here I create a method to get the amount of money that we will use in the operation of the required transaction(MoneyOfTransactions)(no-parameter) */
    public double getMoneyOfTransactions() {
        /* Here the method returns the amount of money that we will use in the operation of the required transaction(MoneyOfTransactions) */
        return MoneyOfTransactions;
    }
    /* Here I create a method to get the object a (no-parameter) */
    public Accounts getA() {
        /* Here the method returns the object a */
        return a;
    }
    /* Here I create a method to get the status of each operation if the method returns true then the operation was executed, if the method returns false then the operation was not executed(checkOfStatus)(no-parameter) */
    public boolean isCheckOfStatus() {
        /* Here the method returns the status of each operation if the method returns true then the operation was executed, if the method returns false then the operation was not executed(checkOfStatus)(no-parameter) */
        return checkOfStatus;
    }
    /* Setter methods(Mutator methods)......... */
    /* Here I create a method to set the date of each of the transactions that took place before(datecreatedOfTransactions)(one parameter) */
    public void setDatecreatedOfTransactions(Date datecreatedOfTransactions) {
        /* Here I set the date of each of the transactions that took place before(datecreatedOfTransactions) */
        this.datecreatedOfTransactions = datecreatedOfTransactions;
    }
    /* Here I create a method to set the account's number that the user wants to transfer the amount of money to it(Account_Number2)(one parameter) */
    public void setAccount_Number2(String Account_Number2) {
        /* Here I set the account's number that the user wants to transfer the amount of money to it(Account_Number2) */
        this.Account_Number2 = Account_Number2;
    }
    /* Here I create a method to set the amount of money that we will use in the operation of the required transaction(MoneyOfTransactions)(one parameter) */
    public void setMoneyOfTransactions(double MoneyOfTransactions) {
        /* Here I set the amount of money that we will use in the operation of the required transaction(MoneyOfTransactions) */
        this.MoneyOfTransactions = MoneyOfTransactions;
    }
    /* Here I create a method to set the object a (one parameter) */
    public void setA(Accounts a) {
        /* Here I set the object a */ 
        this.a = a;
    }
    /* Here I create a method to set the status of each operation (checkOfStatus)(one parameter) */
    public void setCheckOfStatus(boolean checkOfStatus) {
        /* Here I set the status of each operation (checkOfStatus)(one parameter) */
        this.checkOfStatus = checkOfStatus;
    }
}
   

