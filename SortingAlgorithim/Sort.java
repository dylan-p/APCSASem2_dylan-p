import java.util.*;
/**
 * @author Dylan Pratt
 * @version 109
 */
public class Sort
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Sort
     */
    public static void main(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int lod = 0; lod<21; lod++){
            list.add((int)(Math.random()*10+1));
            lod++;
        }
        listPrint(list);
        sort(list);
        System.out.println("");
        listPrint(list);
    }

    public static void sort(ArrayList<Integer> list){
        int x = 0;
        int y = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) > x){
                x = list.get(i);
            }
            if(list.get(i) < y){
                y = list.get(i);
            }
        }

        while(x>y){
            for(int o = 0; o<list.size(); o++){
                if(list.get(o) == x){
                    list.remove(o);
                    list.add(0, x);
                }
            }
            x--;
        }
    }
    
    public static void listPrint(ArrayList<Integer> list){
            for(int i = 0; i<list.size(); i++){
            System.out.print(" " + list.get(i) + " ");
        }
    }
}
