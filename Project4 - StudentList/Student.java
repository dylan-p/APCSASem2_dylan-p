/**
 * Dylan Pratt
 * 1024
 */
public class Student
{
    private String firstName;
    private String middleName;
    private String lastName;
    private int stuNum;
    private double GPA;
    public Student(){
        firstName = " ";
        middleName = " ";
        lastName = " M";
        stuNum = 798553;
        GPA = 4;
    }
    //setters
    public void setFirstName(String inputStr){
        firstName = inputStr;
    }

    public void setMiddleName(String inputStr){
        middleName = inputStr;
    }

    public void setLastName(String inputStr){
        lastName = inputStr;
    }

    public void setGPA(double inputDoub){
        GPA = inputDoub;
    }

    public void setNum(int inputNum){
        stuNum = inputNum;
    }
    //getters
    public String getFullName(){
        return lastName + ", " + firstName + middleName;
    }

    public double getGPA(){
        return GPA;
    }

    public int getStuNum(){
        return stuNum;
    }
    
    public String getLastName(){
        return lastName;
    }
}