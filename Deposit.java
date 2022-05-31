/*****The Deposit class*****/
/* Here it's the default package */
package noureddinsameernaziralzar_2051710306;
/* Here I import the Date class */
import java.util.Date;
/* Here I design and implement a class and name it "Deposit" and  I use the reserved word "extends" that refer to the inheritance and I define a subclass "Deposit" from a superclass "Transactions" */
public class Deposit extends Transactions{
    /* Constructors of Deposit class......... */
    /* Here I create the constructor of Deposit class (no-parameter) */
    public Deposit(){
        /* Here I use super() to invoke a superclass's constructors */
        super();
    }
    /* Here I create the constructor of Deposit class (two parameters),the first parameter is of type String, the second parameter is of type double */
    public Deposit(String Account_Number,double MoneyOfTransactions){
        /* Here I use super to invoke a superclass's constructor that take two-argument(Account_Number,MoneyOfTransactions) */
        super(Account_Number,MoneyOfTransactions);
    }
    /* Methods(Actions) of the Deposit class......... */
    @Override/* Here I override the toString method that is exist in the Object class */
    public String toString(){
        /* Here the method returns an assimilable String representation of the objects */ 
        return "The transaction type: Deposit ,The number of account: "+getA().getAccount_Number()+" ,The amount of money: "+super.getMoneyOfTransactions()+"$ ,Date: "+super.getDatecreatedOfTransactions()+" ,"+Bank.printStatusOfOperation(Bank.getX().isCheckOfStatus());
    }
    /* Getter methods(Accessor methods)......... */
    @Override/* Here I override the isCheckOfStatus method that is exist in the Transactions class */
    public boolean isCheckOfStatus() {
        return super.isCheckOfStatus(); 
    }
    @Override/* Here I override the getA method that is exist in the Transactions class */
    public Accounts getA() {
        return super.getA();
    }
    @Override/* Here I override the getMoneyOfTransactions method that is exist in the Transactions class */
    public double getMoneyOfTransactions() {
        return super.getMoneyOfTransactions();
    }
    @Override/* Here I override the getAccount_Number2 method that is exist in the Transactions class */
    public String getAccount_Number2() {
        return super.getAccount_Number2(); 
    }
    @Override/* Here I override the getDatecreatedOfTransactions method that is exist in the Transactions class */
    public Date getDatecreatedOfTransactions() {
        return super.getDatecreatedOfTransactions(); 
    }
    /* Setter methods(Mutator methods)......... */
    @Override/* Here I override the setCheckOfStatus method that is exist in the Transactions class */
    public void setCheckOfStatus(boolean checkOfStatus) {
        super.setCheckOfStatus(checkOfStatus); 
    }
    @Override/* Here I override the setA method that is exist in the Transactions class */
    public void setA(Accounts a) {
        super.setA(a);
    }
    @Override/* Here I override the setMoneyOfTransactions method that is exist in the Transactions class */
    public void setMoneyOfTransactions(double MoneyOfTransactions) {
        super.setMoneyOfTransactions(MoneyOfTransactions); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public void setAccount_Number2(String Account_Number2) {
        super.setAccount_Number2(Account_Number2); 
    }
    @Override/* Here I override the setDatecreatedOfTransactions method that is exist in the Transactions class */
    public void setDatecreatedOfTransactions(Date datecreatedOfTransactions) {
        super.setDatecreatedOfTransactions(datecreatedOfTransactions);
    }
}
