/* This program is a simple application to help the bank manager to keep track of all accounts and transactions */
/*****The testing class*****/
/* Here it's the default package */
package noureddinsameernaziralzar_2051710306;
/* Here I import the Scanner class */
import java.util.Scanner;
/* Here I import the InputMismatchException class */
import java.util.InputMismatchException;
/* Here I design and implement the testing class and name it "NoureddinSameerNazirAlzar_2051710306" */
public class NoureddinSameerNazirAlzar_2051710306 {
    /* Here i create the main method */ 
    public static void main(String[] args) {
        
        /* Here I create an object from Scanner class and "inputSc" is the variable that is reference variable to the object */
        Scanner inputSc=new Scanner(System.in);
        /* Here I create an object from Scanner class and "inputScNum" is the variable that is reference variable to the object */
        Scanner inputScNum=new Scanner(System.in);
        /* Here I declared and initialized the variables with 0 */
        int T=0,i = 0;
        /* Here I use (try... catch) to catch exceptions that might be thrown as the program executes, therefore the program won’t crash if the exception occurs */
try{
            /* Here I prompt the user to enter the number of the accounts that he wants to create it */
            System.out.println("Enter the number of the accounts that you want to create it: ");
            /* Here I read from the user the number of the accounts that he wants to create it */
            T=inputScNum.nextInt();
        }
        /* Here I use "catch" to catch exceptions that might be thrown as the program executes, therefore the program won’t crash if the exception occurs */
        catch(InputMismatchException e){
            /* Here I print to the user the exception(error) */
            System.out.println(e);
        }
        /* Here I use one of types of repetition (while loop) */
        while ( i < T) {
            /* Here I create (declare) a variable and name it "civil_ID" and its type is String */
            String civil_ID;
            /* Here I create (declare) a variable and name it "NameOfHolder" and its type is String */
            String NameOfHolder;
            /* Here I create (declare) a variable and name it "AgeOfHolder" and its type is int */
            int AgeOfHolder;
            /* Here I create (declare) a variable and name it "GenderOfHolder" and its type is char */
            char GenderOfHolder;
            /* Here I create (declare) a variable and name it "BalanceOfAccount" and its type is double */
            double BalanceOfAccount;
            /* Here I use (try... catch) to catch exceptions that might be thrown as the program executes, therefore the program won’t crash if the exception occurs */
            try{
                /* Here I prompt the user to enter the civil id of the holder */
                System.out.println("Enter the civil id of the holder:");
                /* Here I read from the user the civil id of the holder and store it in the variable (civil_ID) */
                civil_ID=inputSc.nextLine();
                /* Here I use one of types of selection(if...else statement) to check if this acccount is exist in ArrayList (account) or not, if the condition is false then create this new account,
                if the condition is true then print to the user that this account is exist in ArrayList (account) and it is not allowed for a holder to have more than one account */
                if(Bank.isExist("BCD"+civil_ID)){
                    /* Here I prompt the user to enter the name of the holder */
                    System.out.println("Enter the name of the holder:");
                    /* Here I read from the user the name of the holder and store it in the variable (NameOfHolder) */
                    NameOfHolder=inputSc.nextLine();
                    /* Here I prompt the user to enter the age of the holder */
                    System.out.println("Enter the age of the holder:");
                    /* Here I read from the user the age of the holder and store it in the variable (AgeOfHolder) */
                    AgeOfHolder=inputScNum.nextInt();
                    /* Here I prompt the user to enter the gender of the holder */
                    System.out.println("Enter the gender of the holder:");
                    /* Here I read from the user the gender of the holder and store it in the variable (GenderOfHolder) */
                    GenderOfHolder=inputScNum.next().charAt(0);
                    /* Here I prompt the user to enter the balance of the holder */
                    System.out.println("Enter the balance of the holder:");
                    /* Here I read from the user the balance of the holder and store it in the variable (BalanceOfAccount) */
                    BalanceOfAccount =inputScNum.nextDouble();
                    /* Here I call the static method  that is located in the Bank class and this method create a new account and take multiple arguments */ 
                    Bank.CreatingANewAccount(civil_ID,NameOfHolder,AgeOfHolder,GenderOfHolder,BalanceOfAccount);
                    /* increase the variable i by 1 */
                    i++;
                }
                else{
                    /* Here I print to the user that this account is exist and it is not allowed for a holder to have more than one account */
                    System.out.println("It is not allowed for a holder to have more than one account");
                }
            }
            /* Here I use "catch" to catch exceptions that might be thrown as the program executes, therefore the program won’t crash if the exception occurs */
            catch(InputMismatchException e){
                /* Here I print to the user the exception(error) */
                System.out.println(e);
            }
        }
        /* Here I call the static method  that is located in the Bank class and this method deposit money into a specified account */
        Bank.DepositMoney("BCD19836310117831", 100.0);
        /* Here I call the static method  that is located in the Bank class and this method deposit money into a specified account */
        Bank.DepositMoney("BCD27848319116832", 150.0);
        /* Here I call the static method  that is located in the Bank class and this method deposit money into a specified account */
        Bank.DepositMoney("BCD35808311112833", 150.0);
        /* Here I call the static method  that is located in the Bank class and this method deposit money into a specified account */
        Bank.DepositMoney("BCD01234567891011", 200.0);
        
        /* Here I call the static method  that is located in the Bank class and this method withdrawal money from a specified account */
        Bank.WithdrawalMoney("BCD19836310117831", 50.0);
        /* Here I call the static method  that is located in the Bank class and this method withdrawal money from a specified account */
        Bank.WithdrawalMoney("BCD27848319116832", 100.0);
        /* Here I call the static method  that is located in the Bank class and this method withdrawal money from a specified account */
        Bank.WithdrawalMoney("BCD35808311112833", 150.0);
        /* Here I call the static method  that is located in the Bank class and this method withdrawal money from a specified account */
        Bank.WithdrawalMoney("BCD01234567891011", 200.0);
        /* Here I call the static method  that is located in the Bank class and this method withdrawal money from a specified account */
        Bank.WithdrawalMoney("BCD19836310117831", 3000.0);
        
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD19836310117831","BCD27848319116832", 50.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD27848319116832","BCD19836310117831",100.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD35808311112833","BCD27848319116832",150.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD27848319116832","BCD35808311112833",200.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD27848319116832","BCD19836310117831",3000.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD01234567891011","BCD27848319116832",150.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD27848319116832","BCD01234567891011",100.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD47848319116724","BCD19836310117831",150.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD19836310117831","BCD47848319116724",50.0);
        /* Here I call the static method  that is located in the Bank class and this method transfer money between two specified accounts */
        Bank.TransferMoney("BCD47848319116724","BCD27848319116832",250.0);
        
        /* Here I call the static method  that is located in the Bank class and this method prints details of the transaction where the maximum amount of money has been transferred between 2 accounts */
        Bank.PrintingMaximumAOMBTwoAccount();
        /* Here I call the static method  that is located in the Bank class and this method Save all accounts(in ascending order) and transactions into a text file */
        Bank.SavingATransactionsITextFile();       
    }
}
