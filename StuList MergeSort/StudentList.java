
/**
 * Write a description of class Student here.
 *
 * @author Dylan
 * @version 1024
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudentList
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Student
     */
    static ArrayList<Student> studentList;
    public StudentList()
    {
        studentList = new ArrayList<Student>();
    }

    public String addStudent(){
        Scanner scanner = new Scanner(System.in);
        String studentAdded = scanner.nextLine();
        Student n1 = new Student();
        studentList.add(n1);
        if(studentAdded.indexOf(",")!=-1){
            if(studentAdded.indexOf(",")<studentAdded.indexOf(" ")){
                //In case they input it in this format: Last, First Middle AND Last, First
                int firstSpace = studentAdded.indexOf(" ");
                n1.setLastName(studentAdded.substring(0, studentAdded.indexOf(",")));
                int secondSpace = studentAdded.indexOf(" ", firstSpace+1);
                if(secondSpace!=-1){
                    n1.setFirstName(studentAdded.substring(firstSpace, secondSpace));
                    n1.setMiddleName(studentAdded.substring(secondSpace));
                }else{
                    n1.setFirstName(studentAdded.substring(firstSpace));
                }
            }
        }else{
            //In case they input it in this format: First Middle Last
            int firstSpace = studentAdded.indexOf(" ");
            n1.setFirstName(studentAdded.substring(0, firstSpace));
            n1.setMiddleName(studentAdded.substring(firstSpace, studentAdded.indexOf(" ", firstSpace+1)));
            n1.setLastName(studentAdded.substring(studentAdded.indexOf(" ", firstSpace+1)+1));
        }
        System.out.println("Now type in their student number");
        //Set the student number
        Scanner stuNumInput = new Scanner(System.in);
        int stuNumIn = stuNumInput.nextInt();
        n1.setNum(stuNumIn);
        //Set the GPA
        System.out.println("Now type in their GPA");
        Scanner stuGPAInput = new Scanner(System.in);
        double stuGPAIn = scanner.nextDouble();
        n1.setGPA(stuGPAIn);
        String returnString = "We have added " + studentAdded + " to our list of students";
        return returnString;
    }

    public static int menuNumber(){
        //get user input, convert to an int
        Scanner scanner = new Scanner(System.in);
        int returnVar = scanner.nextInt();
        return returnVar;
    }

    public String printList(){
        System.out.println("\u000c");
        int loopEndVar = studentList.size();
        int loopCountVar = 0;
        while(loopCountVar<loopEndVar){
            System.out.println(studentList.get(loopCountVar).getFullName());
            System.out.println(studentList.get(loopCountVar).getGPA());
            System.out.println(studentList.get(loopCountVar).getStuNum());
            loopCountVar++;
        }
        return "The list is printed above";
    }

    public String editStudentList(){
        System.out.println("Enter 1 if you want to enter a student number");
        System.out.println("Enter 2 if you want to enter a student's last name");
        Scanner scanner = new Scanner(System.in);
        int menuVarOne = scanner.nextInt();
        //If they want to enter number
        if(menuVarOne==1){
            System.out.println("Please enter their number");
            Scanner scannerT = new Scanner(System.in);
            int numberEnter = scannerT.nextInt();
            for(int i = 0; i<studentList.size(); i++){
                //Checks to make sure that the number entered is real
                if(studentList.get(i).getStuNum() == numberEnter){
                    System.out.println("Enter 1 to change first name");
                    System.out.println("Enter 2 to change middle name");
                    System.out.println("Enter 3 to change last name");
                    System.out.println("Enter 4 to change their number");
                    System.out.println("Enter 5 to change their GPA");
                    int numberEnterT = scannerT.nextInt();
                    if(numberEnterT == 1){
                        System.out.println("Enter their new name");
                        Scanner studentFirstNameO = new Scanner(System.in);
                        String studentFirstName = studentFirstNameO.nextLine();
                        studentList.get(i).setFirstName(studentFirstName);
                    }
                    if(numberEnterT == 2){
                        System.out.println("Enter their new name");
                        Scanner studentMiddleNameO = new Scanner(System.in);
                        String studentMiddleName = studentMiddleNameO.nextLine();
                        studentList.get(i).setMiddleName(studentMiddleName);
                    }
                    if(numberEnterT == 3){
                        System.out.println("Enter their new name");
                        Scanner studentLastNameO = new Scanner(System.in);
                        String studentLastName = studentLastNameO.nextLine();
                        studentList.get(i).setLastName(studentLastName);
                    }
                    if(numberEnterT == 4){
                        System.out.println("Now type in their student number");
                        Scanner stuNumInput = new Scanner(System.in);
                        int stuNumIn = stuNumInput.nextInt();
                        studentList.get(i).setNum(stuNumIn);
                    }
                    if(numberEnterT == 5){
                        System.out.println("Now type in their GPA");
                        Scanner stuGPAInput = new Scanner(System.in);
                        double stuGPAIn = scanner.nextDouble();
                        studentList.get(i).setGPA(stuGPAIn);
                    }
                    System.out.println("It has been changed");
                }
            }
        }else{
            //If they want to enter number
            System.out.println("Please enter their last name");
            Scanner scannerT = new Scanner(System.in);
            String nameEnter = scannerT.nextLine();
            for(int i = 0; i<studentList.size(); i++){
                //Checks to make sure that the number entered is real
                if(studentList.get(i).getLastName().equals(nameEnter)){
                    System.out.println("Enter 1 to change first name");
                    System.out.println("Enter 2 to change middle name");
                    System.out.println("Enter 3 to change last name");
                    System.out.println("Enter 4 to change their number");
                    System.out.println("Enter 5 to change their GPA");
                    int numberEnterT = scannerT.nextInt();
                    if(numberEnterT == 1){
                        System.out.println("Enter their new name");
                        Scanner studentFirstNameO = new Scanner(System.in);
                        String studentFirstName = studentFirstNameO.nextLine();
                        studentList.get(i).setFirstName(studentFirstName);
                    }
                    if(numberEnterT == 2){
                        System.out.println("Enter their new name");
                        Scanner studentMiddleNameO = new Scanner(System.in);
                        String studentMiddleName = studentMiddleNameO.nextLine();
                        studentList.get(i).setMiddleName(studentMiddleName);
                    }
                    if(numberEnterT == 3){
                        System.out.println("Enter their new name");
                        Scanner studentLastNameO = new Scanner(System.in);
                        String studentLastName = studentLastNameO.nextLine();
                        studentList.get(i).setLastName(studentLastName);
                    }
                    if(numberEnterT == 4){
                        System.out.println("Now type in their student number");
                        Scanner stuNumInput = new Scanner(System.in);
                        int stuNumIn = stuNumInput.nextInt();
                        studentList.get(i).setNum(stuNumIn);
                    }
                    if(numberEnterT == 5){
                        System.out.println("Now type in their GPA");
                        Scanner stuGPAInput = new Scanner(System.in);
                        double stuGPAIn = scanner.nextDouble();
                        studentList.get(i).setGPA(stuGPAIn);
                    }
                    System.out.println("It has been changed");
                }
            }
        }
        return "We have edited this information";
    }

    public String clearList(){
        //Clears the list
        studentList.clear();
        return "The list is now cleared";
    }

    public String deleteStudent(){
        System.out.println("Enter 1 if you want to enter a student number");
        System.out.println("Enter 2 if you want to enter a student's last name");
        Scanner scanner = new Scanner(System.in);
        int menuVarOne = scanner.nextInt();
        if(menuVarOne==1){
            //If they want to enter the student's number
            System.out.println("Please enter their number");
            Scanner scannerT = new Scanner(System.in);
            int numberEnter = scannerT.nextInt();
            for(int i = 0; i<studentList.size(); i++){
                if(studentList.get(i).getStuNum() == numberEnter){
                    studentList.remove(i);
                }
            }
        }else{
            //If they want to enter the student's last name
            System.out.println("Please enter their last name");
            Scanner scannerT = new Scanner(System.in);
            String nameEnter = scannerT.nextLine();
            for(int i = 0; i<studentList.size(); i++){
                if(studentList.get(i).getLastName().equals(nameEnter)){
                    studentList.remove(i);
                }
            }
        }
        return "That student has been deleted";
    }

    public String printStudent(){
        System.out.println("Enter 1 if you want to enter a student number");
        System.out.println("Enter 2 if you want to enter a student's last name");
        Scanner scanner = new Scanner(System.in);
        int menuVarOne = scanner.nextInt();
        if(menuVarOne==1){
            System.out.println("Please enter their number");
            Scanner scannerT = new Scanner(System.in);
            int numberEnter = scannerT.nextInt();
            for(int i = 0; i<studentList.size(); i++){
                if(studentList.get(i).getStuNum() == numberEnter){
                    System.out.println(studentList.get(i).getFullName());
                    System.out.println(studentList.get(i).getGPA());
                    System.out.println(studentList.get(i).getStuNum());
                }
            }
        }else{
            System.out.println("Please enter their last name");
            Scanner scannerT = new Scanner(System.in);
            String nameEnter = scannerT.nextLine();
            for(int i = 0; i<studentList.size(); i++){
                if(studentList.get(i).getLastName().equals(nameEnter)){
                    System.out.println(studentList.get(i).getFullName());
                    System.out.println(studentList.get(i).getGPA());
                    System.out.println(studentList.get(i).getStuNum());
                }
            }
        }
        return "Student is printed above";
    }

    public String filterSearchStudentList(){
        System.out.println("Enter 1 if you want to enter a minimum number");
        System.out.println("Enter 2 if you want to enter a minimum GPA");
        Scanner scanner = new Scanner(System.in);
        int menuVarOne = scanner.nextInt();
        int studentsExistQ = 0;
        if(menuVarOne==1){
            System.out.println("Please enter their number");
            Scanner scannerT = new Scanner(System.in);
            int numberEnter = scannerT.nextInt();
            for(int i = 0; i<studentList.size(); i++){
                if(studentList.get(i).getStuNum() <= numberEnter){
                    System.out.println(studentList.get(i).getFullName());
                    System.out.println(studentList.get(i).getGPA());
                    System.out.println(studentList.get(i).getStuNum());
                    studentsExistQ++;
                }
            }
            if(studentsExistQ == 0){
                return "No such student exists";
            }else{
                return "Students are printed above";
            }
        }else{
            System.out.println("Please enter their GPA");
            Scanner scannerT = new Scanner(System.in);
            double doubleEnter = scannerT.nextDouble();
            for(int i = 0; i<studentList.size(); i++){
                if(studentList.get(i).getGPA() <= (doubleEnter)){
                    System.out.println(studentList.get(i).getFullName());
                    System.out.println(studentList.get(i).getGPA());
                    System.out.println(studentList.get(i).getStuNum());
                    studentsExistQ++;
                }
            }
            if(studentsExistQ == 0){
                return "No such student exists";
            }else{
                return "Students are printed above";
            }
        }
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2){
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getStuNum() <= r[j].getStuNum()) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left)  {a[k++] = l[i++];}
        while (j < right) {a[k++] = r[j++];}
    }

    public void sortList(){
        Student[] tempRay = new Student[studentList.size()];
        for(int i = 0; i<studentList.size(); i++){
            tempRay[i] = studentList.get(i);
        }

        mergeSort(tempRay, tempRay.length);
        for(int i =0; i<tempRay.length; i++){
            System.out.println(tempRay[i].getStuNum());
        }

        for(int i = 0; i<studentList.size(); i++){
            studentList.set(i, tempRay[i]);
        }

    }

    public void searchList(int a, int[] sortedArray, int key, int low, int high){
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}