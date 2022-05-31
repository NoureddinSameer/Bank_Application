/*****The Holder class*****/
/* Here it's the default package */
package noureddinsameernaziralzar_2051710306;
/* Here I design and implement a class and name it "Holder" */
public class Holder{
    /* Attributes of Holder class......... */
    /* Here I create (declare) a variable and name it "civil_IDOfHolder" and its type is String */
    private String civil_IDOfHolder;
    /* Here I create (declare) a variable and name it "ageOfHolder" and its type is int */
    private int ageOfHolder;
    /* Here I create (declare) a variable and name it "genderOfHolder" and its type is char */
    private char genderOfHolder;
    /* Here I create (declare) a variable and name it "nameOfHolder" and its type is String */
    private String nameOfHolder;
    /* Constructor of Holder class......... */
    /* Here I create the constructor of Holder class (no-parameter) */
    public Holder(){
        /* Here I store the value of null in the variable civil_IDOfHolder */
        civil_IDOfHolder=null;
        /* Here I store the value of null in the variable nameOfHolder */
        nameOfHolder=null;
        /* Here I store the value of 0 in the variable ageOfHolder */
        ageOfHolder=0;
        /* Here I store the value of '\u0000' in the variable genderOfHolder */
        genderOfHolder='\u0000';
    }
    /* Here I create the constructor of Holder class (multiple parameters) */
    public Holder(String civil_ID,String NameOfHolder,int AgeOfHolder,char GenderOfHolder){
        /* Here I store the value of civil_ID in the variable civil_IDOfHolder */
        civil_IDOfHolder=civil_ID;
        /* Here I store the value of NameOfHolder in the variable nameOfHolder */
        nameOfHolder=NameOfHolder;
        /* Here I store the value of AgeOfHolder in the variable ageOfHolder */
        ageOfHolder=AgeOfHolder;
        /* Here I store the value of GenderOfHolder in the variable genderOfHolder */
        genderOfHolder=GenderOfHolder;
    }
    /* Methods(Actions) of the Holder class......... */    
    @Override/* Here I override the toString method that is exist in the Object class */
    public String toString() {
        /* Here the method returns an assimilable String representation of the objects */
        return "Holder{" + "civil_IDOfHolder=" + civil_IDOfHolder + ", ageOfHolder=" + ageOfHolder + ", genderOfHolder=" + genderOfHolder + ", nameOfHolder=" + nameOfHolder + '}';
    }
    /* Getter methods(Accessor methods)......... */
    /* Here I create a method to get the civil id of account holder(civil_IDOfHolder)(no-parameter) */
    public String getCivil_IDOfHolder() {
        /* Here the method returns the civil id of account holder(civil_IDOfHolder) */
        return civil_IDOfHolder;
    }
    /* Here I create a method to get the age of account holder(ageOfHolder)(no-parameter) */
    public int getAgeOfHolder() {
        /* Here the method returns the age of account holder(ageOfHolder) */
        return ageOfHolder;
    }
    /* Here I create a method to get the gender of account holder(genderOfHolder)(no-parameter) */
    public char getGenderOfHolder() {
        /* Here the method returns the gender of account holder(genderOfHolder) */
        return genderOfHolder;
    }
    /* Here I create a method to get the name of account holder(nameOfHolder)(no-parameter) */
    public String getNameOfHolder() {
        /* Here the method returns the name of account holder(nameOfHolder) */
        return nameOfHolder;
    }
    /* Setter methods(Mutator methods)......... */
    /* Here I create a method to set the civil id of account holder(civil_IDOfHolder)(one parameter) */
    public void setCivil_IDOfHolder(String civil_IDOfHolder) {
        /* Here I set the civil id of account holder(civil_IDOfHolder) */
        this.civil_IDOfHolder = civil_IDOfHolder;
    }
    /* Here I create a method to set the age of account holder(ageOfHolder)(one parameter) */
    public void setAgeOfHolder(int ageOfHolder) {
        /* Here I set the age of account holder(ageOfHolder) */
        this.ageOfHolder = ageOfHolder;
    }
    /* Here I create a method to set the gender of account holder(genderOfHolder)(one parameter) */
    public void setGenderOfHolder(char genderOfHolder) {
        /* Here I set the gender of account holder(genderOfHolder) */
        this.genderOfHolder = genderOfHolder;
    }
    /* Here I create a method to set the name of account holder(nameOfHolder)(one parameter) */
    public void setNameOfHolder(String nameOfHolder) {
        /* Here I set the name of account holder(nameOfHolder) */
        this.nameOfHolder = nameOfHolder;
    }
}    
