/*****The Accounts class*****/
/* Here it's the default package */
package noureddinsameernaziralzar_2051710306;
/* Here I design and implement a class and name it "Accounts" */
public class Accounts {
    /* Attributes of Accounts class......... */
    /* Here I create (declare) a variable and name it "Account_Number" and its type is String */
    private String Account_Number;
    /* Here I create (declare) a variable and name it "BalanceOfAccount" and its type is double */
    private double BalanceOfAccount;
    /* Here I create (declare) a variable and name it "d" and its type is Holder */
    private Holder d;
    /* Constructors of Accounts class......... */
    /* Here I create the constructor of Accounts class (no-parameter) */
    public Accounts(){
        /* Here I create an object from Holder class and "d" is the variable that is reference variable to the object */
        d=new Holder();
        /* Here I store the value of null in the variable Account_Number */
        Account_Number=null;
        /* Here I store the value of 0.0 in the variable BalanceOfAccount */
        BalanceOfAccount=0.0;
    }
    /* Here I create the constructor of Accounts class (multiple parameters) */
    public Accounts(String civil_ID,String NameOfHolder,int AgeOfHolder,char GenderOfHolder,double BalanceOfAccount){
        /* Here I create an object from Holder class (multiple arguments) */
        d=new Holder(civil_ID,NameOfHolder,AgeOfHolder,GenderOfHolder);
        /* Here I set the account's balance */ 
        this.BalanceOfAccount =BalanceOfAccount;
        /* Here I set the account's number(Account_Number) */
        Account_Number="BCD"+d.getCivil_IDOfHolder();
    }
    /* Methods(Actions) of the Accounts class......... */
    @Override/* Here I override the toString method that is exist in the Object class */
    public String toString(){
        /* Here the method returns an assimilable String representation of the objects */
        return Account_Number+" "+d.getNameOfHolder()+" "+d.getAgeOfHolder()+" "+d.getGenderOfHolder()+" "+BalanceOfAccount;
    }
    /* Getter methods(Accessor methods)......... */
    /* Here I create a method to get the value of account's number(Account_Number) */
    public String getAccount_Number() {
        /* Here the method returns the value of account's number(Account_Number) */
        return Account_Number;
    }
    /* Here I create a method to get the value of account's balance(BalanceOfAccount) */
    public double getBalanceOfAccount() {
        /* Here the method returns the value of account's balance(BalanceOfAccount) */
        return BalanceOfAccount;
    }
    /* Here I create a method to get the object d */
    public Holder getD() {
        /* Here the method returns the object d */
        return d;
    }
    /* Setter methods(Mutator methods)......... */
    /* Here I create a method to set the account's number(Account_Number)(one parameter) */
    public void setAccount_Number(String Account_Number) {
        /* Here I set the account's number(Account_Number) */
        this.Account_Number = Account_Number;
    }
    /* Here I create a method to set the account's balance(BalanceOfAccount)(one parameter) */
    public void setBalanceOfAccount(double BalanceOfAccount) {
        /* Here I set the account's balance(BalanceOfAccount) */
        this.BalanceOfAccount = BalanceOfAccount;
    }
    /* Here I create a method to set the object d(one parameter) */
    public void setD(Holder d) {
        /* Here I set the value of object d */
        this.d = d;
    }
}    

