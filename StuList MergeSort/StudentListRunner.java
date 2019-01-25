
/**
 * Write a description of class StudentRunner here.
 *
 * @author Dylan Pratt
 * @version 1029
 */
public class StudentListRunner extends StudentList
{
    public StudentListRunner(){
        StudentList studentListObject = new StudentList();
    }

    public static void main(){
        //Code for the loop, and to access methods
        int loopEndVar = 0;
        StudentList runnerObject = new StudentList();
        while(loopEndVar==0){
            //Print statements for the menu
            System.out.println("Press 1 to add a student");
            System.out.println("Press 2 to print student list");
            System.out.println("Press 3 to edit the student list");
            System.out.println("Press 4 to clear the list");
            System.out.println("Press 5 to delete a student");
            System.out.println("Press 6 to print a student");
            System.out.println("Press 7 to filter search the list");
            System.out.println("Press 8 to merge sort the list");
            System.out.println("Press 9 to search the list worse");
            System.out.println("Press 0 to quit");
            int loopVar = menuNumber();
            if(loopVar==0){
                loopEndVar=1;
            }
            if(loopVar==1){
                System.out.println("Please enter the name of the student");
                System.out.println(runnerObject.addStudent());
            }
            if(loopVar==2){
                System.out.println(runnerObject.printList());
            }
            if(loopVar==3){
                System.out.println(runnerObject.editStudentList());
            }
            if(loopVar==4){
                System.out.println(runnerObject.clearList());
            }
            if(loopVar==5){
                System.out.println(runnerObject.deleteStudent());
            }
            if(loopVar==6){
                System.out.println(runnerObject.printStudent());
            }
            if(loopVar==7){
                System.out.println(runnerObject.filterSearchStudentList());
            }
            if(loopVar==8){
                runnerObject.sortList();
            }
            if(loopVar==9){
                System.out.println("What would you like to search for?");
                int newVar = menuNumber();
                //runnerObject.searchList(newVar);
            }
        }
    }
}