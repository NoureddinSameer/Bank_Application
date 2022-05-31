/*****The Transfer class*****/
/* Here it's the default package */
package noureddinsameernaziralzar_2051710306;
/* Here I import the Date class */
import java.util.Date;
/* Here I design and implement a class and name it "Transfer" and  I use the reserved word "extends" that refer to the inheritance and I define a subclass "Transfer" from a superclass "Transactions" */
public class Transfer extends Transactions{
    /* Constructors of Transfer class......... */
    /* Here I create the constructor of Transfer class (no-parameter) */
    public Transfer(){
        /* Here I use super() to invoke a superclass's constructors */
        super();
    }
    /* Here I create the constructor of Transfer class (multiple parameters) */
    public Transfer(String Account_Number,String Account_Number2,double MoneyOfTransactions){
        /* Here I use super to invoke a superclass's constructor that take three-argument(Account_Number,Account_Number2,MoneyOfTransactions) */
        super(Account_Number,Account_Number2,MoneyOfTransactions);
    }
    /* Methods(Actions) of the Transfer class......... */
    @Override/* Here I override the toString method that is exist in the Object class */
    public String toString(){
        /* Here the method returns an assimilable String representation of the objects */ 
        return "The transaction type: Transfer ,From "+getA().getAccount_Number()+" To "+getAccount_Number2()+" , The amount of money: "+super.getMoneyOfTransactions()+"$ ,Date: "+super.getDatecreatedOfTransactions()+" ,"+Bank.printStatusOfOperation(Bank.getX().isCheckOfStatus());
    }
    /* Getter methods(Accessor methods)......... */
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public boolean isCheckOfStatus() {
        return super.isCheckOfStatus(); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public Accounts getA() {
        return super.getA(); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public double getMoneyOfTransactions() {
        return super.getMoneyOfTransactions(); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public String getAccount_Number2() {
        return super.getAccount_Number2(); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public Date getDatecreatedOfTransactions() {
        return super.getDatecreatedOfTransactions(); 
    }
    /* Setter methods(Mutator methods)......... */
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public void setCheckOfStatus(boolean checkOfStatus) {
        super.setCheckOfStatus(checkOfStatus); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public void setA(Accounts a) {
        super.setA(a); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public void setMoneyOfTransactions(double MoneyOfTransactions) {
        super.setMoneyOfTransactions(MoneyOfTransactions); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public void setAccount_Number2(String Account_Number2) {
        super.setAccount_Number2(Account_Number2); 
    }
    @Override/* Here I override the setAccount_Number2 method that is exist in the Transactions class */
    public void setDatecreatedOfTransactions(Date datecreatedOfTransactions) {
        super.setDatecreatedOfTransactions(datecreatedOfTransactions); 
    }
}
