/*****The Bank class( the main job of the bank)*****/
/* Here it's the default package */
package noureddinsameernaziralzar_2051710306;
/* Here I import the library that includes the ArrayList class, the Collections class, the Scanner class */
import java.util.*;
/* Here I import the library that includes File class */
import java.io.*;
/* Here I design and implement a class and name it "Bank" */
public class Bank {
    /* Attributes of Bank class......... */
    /* Here I create(declare) an ArrayList and name it "account", and I create an object from ArrayList class, its type is Accounts */
    private static  ArrayList<Accounts>  account= new ArrayList<Accounts>();
    /* Here I create(declare) an ArrayList and name it "transaction", and I create an object from ArrayList class, its type is Transactions */
    private static ArrayList<Transactions> transaction=new ArrayList<Transactions>();
    /* Here I create(declare) an ArrayList and name it "transfer", and I create an object from ArrayList class, its type is Transactions */
    private static ArrayList<Transactions> transfer=new ArrayList<Transactions>();
    /* Here I create(declare) a variable and name it "x" and its type is Transactions and I create an object from Transactions class and "x" is the variable that is reference variable to the object */
    private static Transactions x=new Transactions();
    /* Constructor of Bank class......... */
    /* Here I create the constructor of Bank class (no-parameter) */
    public Bank(){
        /* Here I create an object from ArrayList class and its type is Accounts */
        account= new ArrayList<Accounts>();
        /* Here I create an object from ArrayList class, its type is Transactions */
        transaction=new ArrayList<Transactions>();
        /* Here I create an object from ArrayList class, its type is Transactions */
        transfer=new ArrayList<Transactions>();
        /* Here I create an object from Transactions class and "x" is the variable that is reference variable to the object */
        x=new Transactions();
    }
    /* Methods(Actions) of the Bank class......... */
    /* Here I create a static method and name it "CreatingANewAccount" that take multiple parameters */
    public static void CreatingANewAccount(String s,String NameOfHolder,int AgeOfHolder,char GenderOfHolder,double BalanceOfAccount){
        /* Here I create an object from Accounts class (multiple arguments) */
        Accounts a=new Accounts(s,NameOfHolder,AgeOfHolder,GenderOfHolder,BalanceOfAccount);
        /* Here I use add method that add the the new account to the ArrayList(account) */
        account.add(a);
    }
    /* Here I create a static method and name it "DepositMoney" that take two parameters,the first parameter is of type String and the second parameter is of type double */
    public static void DepositMoney(String j,double m){
        /* Here I call the method that is exist in the Transactions class that is set the value of variable checkOfStatus, here I set the variable checkOfStatus to false */
        x.setCheckOfStatus(false);
        /* Here I use one of types of selection(if...else statement) to check if this acccount is exist in ArrayList (account) or not, if the condition is true then execute the deposit operation on this account,
        if the condition is false then print to the user that this account is not exist */
        if(!isExist(j)){
            /* Here I call the method that returns the index of the account in the ArrayList and I store this index in the variable indexAccount */
            int indexAccount=equalsIndex(j);
            /* Here I add the new amount of money to the account's balance */
            getAccount().get(indexAccount).setBalanceOfAccount(getAccount().get(indexAccount).getBalanceOfAccount()+m);
            /* Here I create an object from Deposit class (two argument) */
            Transactions q =new Deposit(j,m);
            /* Here I use the add method that add the the new deposit operation to the ArrayList(transaction) */
            transaction.add(q);
            /* Here I call the method that is exist in the Transactions class that is set the value of variable checkOfStatus, here I set the variable checkOfStatus to true */
            x.setCheckOfStatus(true);
        }
        else{
            /* Here I print to the user that this account is not exist */
            System.out.println("The account "+j+" is not exist");
        }
        /* Here I print the status of operation if it was successful or not using the method that return a String */  
        System.out.println(printStatusOfOperation(x.isCheckOfStatus()));
    }
    /* Here I create a static method and name it "WithdrawalMoney" that take two parameters,the first parameter is of type String, the second parameter is of type double */        
    public static void WithdrawalMoney(String s,double w){
        /* Here I call the method that is exist in the Transactions class that is set the value of variable checkOfStatus, here I set the variable checkOfStatus to false */
        x.setCheckOfStatus(false);
        /* Here I use one of types of selection(if...else statement) to check if this acccount is exist in ArrayList (account) or not, if the condition is true then execute the withdrawal operation on this account,
        if the condition is false then print to the user that this account is not exist */
        if(!isExist(s)){
            /* Here I call the method that returns the index of the account in the ArrayList (account) and I store this index in the variable indexAccount */
            int indexAccount=equalsIndex(s);
            /* Here I use one of types of selection(if...else statement) to check if the account has the amount of money that we want to pull or not */
            if(getAccount().get(indexAccount).getBalanceOfAccount()>=w){
                /* Here I subtract the amount of money that the user wants to pull from the account's balance */
                getAccount().get(indexAccount).setBalanceOfAccount(getAccount().get(indexAccount).getBalanceOfAccount()-w);
                /* Here I create an object from Withdrawal class (two argument) */
                Transactions z =new Withdrawal(s,w);
                /* Here I use the add method that add the the new withdrawal operation to the ArrayList(transaction) */
                transaction.add(z);
                /* Here I call the method that is exist in the Transactions class that is set the value of variable checkOfStatus, here I set the variable checkOfStatus to true */
                x.setCheckOfStatus(true);
            }
            else{
                /* Here I print to the user that the balance of the account is less than the amount of money that he wants to pull */
                System.out.println("Your balance of account "+s+" is "+getAccount().get(indexAccount).getBalanceOfAccount()+"$ ,so you can't pull "+w+" from it");                
            }
        }
        else{
            /* Here I print to the user that this account is not exist */
            System.out.println("The account "+s+" is not exist");            
        }
        /* Here I print the status of operation if it was successful or not using the method that return a String */
        System.out.println(printStatusOfOperation(x.isCheckOfStatus()));
    }
    /* Here I create a static method and name it "TransferMoney" that take three parameters,the first parameter is of type String, the second parameter is of type String too, the third parameter is of type double */        
    public static void TransferMoney(String s1,String s2,double m){
        /* Here I call the method that is exist in the Transactions class that is set the value of variable checkOfStatus, here I set the variable checkOfStatus to false */
        x.setCheckOfStatus(false);
        /* Here I use one of types of selection(if...else statement) to check if the account that I want to pull the amount of money from it is exist in ArrayList (account) or not, if the condition is true then execute the transfer operation on this account,
        if the condition is false then print to the user that this account is not exist */
        if(!isExist(s1)){
            /* Here I use one of types of selection(if...else statement) to check if the account that I want to add the amount of money to it is exist in ArrayList (account) or not, if the condition is true then execute the transfer operation on this account,
            if the condition is false then print to the user that this account is not exist */
            if(!isExist(s2)){
                /* Here I call the method that returns the index of the account which I want to pull the amount of money from it in the ArrayList and I store this index in the variable indexAccount */
                int indexAccount=equalsIndex(s1);
                /* Here I use one of types of selection(if...else statement) to check if the account which I want to pull the amount of money from it has the amount of money or not */
                if(getAccount().get(indexAccount).getBalanceOfAccount()>=m){
                    /* Here I call the method that returns the index of the account which I want to add the amount of money to it in the ArrayList and I store this index in the variable indexAccount2 */
                    int indexAccount2=equalsIndex(s2);
                    /* Here I subtract the amount of money from the account's balance that the user wants to pull from */
                    getAccount().get(indexAccount).setBalanceOfAccount(getAccount().get(indexAccount).getBalanceOfAccount()-m);
                    /* Here I add the amount of money to the account's balance that the user wants to add the money to */
                    getAccount().get(indexAccount2).setBalanceOfAccount(getAccount().get(indexAccount2).getBalanceOfAccount()+m);
                    /* Here I create an object from Transfer class (three argument) */
                    Transactions q =new Transfer(s1,s2,m);
                    /* Here I use the add method that add the the new transfer operation to the ArrayList(transaction) */
                    transaction.add(q);
                    /* Here I use the add method that add the the new Tarnsfer operation to the ArrayList(transfer) */
                    transfer.add(q);
                    /* Here I call the method that is exist in the Transactions class that is set the value of variable checkOfStatus, here I set the variable checkOfStatus to true */
                    x.setCheckOfStatus(true);
                }
                else{
                    /* Here I print to the user that the balance of account which he wants to pull the amount of money from it is less than the amount of money */
                    System.out.println("The balance of account "+s1+" is "+getAccount().get(indexAccount).getBalanceOfAccount()+"$ ,so you can't transfer "+m+" from it");
                }
            }
            else{
                /* Here I print to the user that the account which he wants to add the amount of money to it is not exist */
                System.out.println("The account "+s2+" is not exist");
            }
        }
        else{
            /* Here I print to the user that the account which he wants to pull the amount of money from it is not exist */
            System.out.println("The account "+s1+" is not exist");
        }
        /* Here I print the status of operation if it was successful or not using the method that return a String */
        System.out.println(printStatusOfOperation(x.isCheckOfStatus()));
    }
    /* Here I create a static method to check if an object is exist in ArrayList or not and name it "isExist" that take one parameter,this parameter is of type String */
    public static boolean isExist(String s){  
        /* Here I use one of types of repetition (for loop) */
        for(int i=0;i<getAccount().size();i++){
            /* Here I use one of types of selection(if statement) to check if the account number is exist in the ArrayList(account),if the condition is true, then the method returns false */
            if(getAccount().get(i).getAccount_Number().equals(s)){
                /* Here the mehtod returns false */ 
                return false;      
            }
        }
        /* Here the method returns true if the previous condition is false */
        return true;
    }
    /* Here I create a static method to get the index of specific object in ArrayList and name it "equalsIndex" that take one parameter,this parameter is of type String */ 
    public static int equalsIndex(String s){
        /* Here I create (declare) and initialize variable j with 0 */
        int j=0;
        /* Here I use one of types of repetition (for loop) */
        for (int i = 0; i <getAccount().size(); i++){
            /* Here I use one of types of selection(if statement) to check if the account number is exist in the ArrayList(account),if the condition is true then return the index of account */
            if(getAccount().get(i).getAccount_Number().equals(s)){
                /* Here I store the value of i in the variable j to get the index of account */ 
                j=i;
            }
        }
        /* Here the method returns the variable j that store the index of account that is exist in the ArrayList(account) */
        return j;
    }
    /* Here I create a static method to print the details of the transaction where the maximum amount of money has been transferred between 2 accounts and name it "PrintingMaximumAOMBTwoAccount" (no-parameter) */
    public static void PrintingMaximumAOMBTwoAccount(){
        /* Here I call the method that is exist in the Transactions class that is set the value of variable checkOfStatus, here I set the variable checkOfStatus to true */
        x.setCheckOfStatus(true);
        /* Here I create an ArrayList and name it "v",its type is Double */
        ArrayList<Double> v=new ArrayList<Double>();
        /* Here I use one of types of repetition (for loop) */
        for (int i = 0; i <getTransfer().size(); i++){
            /* Here I use the add method which adds the amount of money used in each transaction done before in the ArrayList(v) */
            v.add(getTransfer().get(i).getMoneyOfTransactions());
        }
        /* Here I use one of types of repetition (for loop) */
        for (int i = 0; i <getTransfer().size(); i++) {
            /* Here I use one of types of selection(if statement) to find the maximum amount of money has been transferred between 2 accounts */
            if(Collections.max(v)==getTransfer().get(i).getMoneyOfTransactions()){
                /* Here I print to the user the details of the transaction where the maximum amount of money has been transferred between 2 accounts */
                System.out.println("The details of the transaction where the maximum amount of money has been transferred between 2 accounts:\n"+getTransfer().get(i));
            }
        }
    }
    /* Here I create a static method to save all accounts and transactions into a text file and name it "SavingATransactionsITextFile" (no-parameter) */
    public static void SavingATransactionsITextFile(){
        /* Here I create an ArrayList and name it "u",its type is String */
        ArrayList<String> u=new ArrayList<String>();
        /* Here I call the method that returns the ArrayList (which contains all accounts numbers, sorted in ascending order)and then I store this ArrayList in the ArrayList(u) */
        u=fillNewArrayListAndSortAccountNumber();
        /* Here I use (try... catch) to catch exceptions that might be thrown as the program executes, therefore the program won’t crash if the exception occurs */
        try{
            /* Here I create an object from File class and "fileTXT" is the variable that is reference variable to the object */
            File fileTxt = new File("C:\\Users\\NOUR\\OneDrive\\Documents\\NetBeansProjects\\NoureddinSameerNazirAlzar_2051710306\\NoureddinSameerNazirAlzarie_2051710306.txt");
            /* Here I create an object from PrintWriter class and "pwFile" is the variable that is reference variable to the object */
            PrintWriter pwFile = new PrintWriter(fileTxt);
            /* Here I use one of types of repetition (for loop) */
            for (int i = 0; i <getAccount().size(); i++) {
                /* Here I use one of types of repetition (for loop) */
                for (int j = 0; j <getAccount().size(); j++) {
                    /* Here I use one of types of selection(if statement) to saving all accounts into a text file and this accounts are sorted in ascending order */
                    if(u.get(i).equals(getAccount().get(j).getAccount_Number())){
                        /* Here I save each account into a text file */
                        pwFile.println(getAccount().get(j));
                    }
                }
            }
            /* Here I use one of types of repetition (for loop) */
            for (int i = 0; i <getTransfer().size(); i++) {
                /* Here I save each operation of the transactions in a text file */
                pwFile.println(getTransfer().get(i));
            }
            /* Here I close the PrintWriter when finished */
            pwFile.close();
        }
        /* Here I use "catch" to catch exceptions that might be thrown as the program executes, therefore the program won’t crash if the exception occurs */
        catch(Exception e){
            /* Here I print to the user the exception(error) */
            System.out.println(e);
        }
    }
    /* Here I create a static method to sort the accounts in ascending order */
    public static ArrayList<String> fillNewArrayListAndSortAccountNumber(){
        /* Here I create an ArrayList and name it "v",its type is String */
        ArrayList<String> v=new ArrayList<String>();
        /* Here I use one of types of repetition (for loop) */
        for (int i = 0; i <getAccount().size(); i++) {
            /* Here I use the add method which adds the amount of money for each account in the ArrayList(v) */
            v.add(getAccount().get(i).getAccount_Number());
        }
        /* Here I use the sort method which sorts the objects of the ArrayList(v) */
        Collections.sort(v);
        /* Here the method returns the ArrayList (v) after sorting its objects */
        return v;
    }

    /* Here I create a static method to print the status of each operation if it was successful or not */
    public static String printStatusOfOperation(boolean q){
        /* Here I use one of types of selection(if.....else statement) */
        if(q){
            /* Here if the previous condition is true, the method returns a String that The operation was successful */
            return "The operation was successful";
        }else{
            /* Here if the previous condition is false the method returns a String that The operation was not successful */
            return "The operation was not successful";
        }
    }
    @Override/* Here I override the toString method that is exist in the Object class */
    public String toString() {
        /* Here the method returns an assimilable String representation of the objects */
        return "Bank{" + '}';
    }
    /* Getter methods(Accessor methods)......... */
    /* Here I create a static method to get the ArrayList (account)(no-parameter) */
    public static ArrayList<Accounts> getAccount() {
        /* Here the method returns the ArrayList (account) */
        return account;
    }
    /* Here I create a static method to get the ArrayList (transaction)(no-parameter) */
    public static ArrayList<Transactions> getTransaction() {
        /* Here the method returns the ArrayList (transaction) */
        return transaction;
    }
    /* Here I create a static method to get the ArrayList (transfer)(no-parameter) */
    public static ArrayList<Transactions> getTransfer() {
        /* Here the method returns the ArrayList (transfer) */
        return transfer;
    }
    /* Here I create a static method to get the object x(no-parameter) */
    public static Transactions getX() {
        /* Here the method returns the value of object x */
        return x;
    }
    /* Setter methods(Mutator methods)......... */
    /* Here I create a static method to set the ArrayList (account)(one parameter) */
    public static void setAccount(ArrayList<Accounts> account) {
        /* Here I set the ArrayList (account) */
        Bank.account = account;
    }
    /* Here I create a static method to set the ArrayList (transaction)(one parameter) */
    public static void setTransaction(ArrayList<Transactions> transaction) {
        /* Here I set the ArrayList (transaction) */
        Bank.transaction = transaction;
    }
    /* Here I create a static method to set the ArrayList (transfer)(one parameter) */
    public static void setTransfer(ArrayList<Transactions> transfer) {
        /* Here I set the ArrayList (transfer) */
        Bank.transfer = transfer;
    }
    /* Here I create a static method to set the object x(one parameter) */
    public static void setX(Transactions x) {
        /* Here I set the value of object x */
        Bank.x = x;
    }
}
