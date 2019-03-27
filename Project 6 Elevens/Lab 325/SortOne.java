import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author 326
 * @version 326
 */
public class SortOne implements Ab
{
    public int menuNumber(){
        //get user input, convert to an int
        Scanner scanner = new Scanner(System.in);
        int returnVar = scanner.nextInt();
        return returnVar;
    }

    public String menuString(){
        Scanner scanner = new Scanner(System.in);
        String returnVar = scanner.nextLine();
        return returnVar;
    }

    public void main(){
        //Code for the loop, and to access methods
        int loopEndVar = 0;
        SortOne runnerObject = new SortOne();
        while(loopEndVar==0){
            //Print statements for the menu
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to add an album");
            System.out.println("Press 2 to sort the albums by quality");
            int loopVar = menuNumber();
            if(loopVar==0){
                loopEndVar=1;
            }
            if(loopVar==1){
                System.out.println(addAlb());
            }
            if(loopVar==2){
                System.out.print(runnerObject.sortAlbs());
            }
        }
    }

    private String Name;
    private int Num;
    public SortOne(){
        Name = " ";
        Num = 0;
    }
    //setters
    public void addAlb(){
        System.out.println("Please enter the name of the album");
        String albName = menuString();
        if(albName.equals("Disraeli Gears")){
            Name = albName;
            Num = 1;
        }else if(albName.equals("Wheels of Fire")){
            Name = albName;
            Num = 2;
        }else if(albName.equals("Goodbye")){
            Name = albName;
            Num = 3;
        }else if(albName.equals("Fresh Cream")){
            Name = albName;
            Num = 4;
        }
    }
    //getters
    public String getName(){
        return Name;
    }

    public int getNum(){
        return Num;
    }

    public void sortAlbs(){
        for(int i=1; i<abL.size(); i++){
            for(int o=1; o>0; o--){
                if(abL.get(o).getNum() < abL.get(o-1).getNum()){
                    Ab x = abL.get(o).getNum();
                    abL.set(abL.get(o), abL.get(o-1));
                    abL.set(abL.get(o-1), x);
                }
            }
        }
    }
}
