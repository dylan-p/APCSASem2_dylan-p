import java.util.*;
/**
 * @author Dylan Pratt
 * @version 109
 */
public class MySorts
{
    public static int compareCount;
    public static int swapCount;
    
    public static void main(){
        long tStart = System.nanoTime();
        compareCount = 0;
        swapCount = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int lod = 0; lod<12; lod++){
            list.add((int)(Math.random()*10+1));
        }
        listPrint(list);
        sort(list);
        System.out.println();
        listPrint(list);

        //mysort but for arrays 
        int[] ray = new int[10];
        for(int lod = 0; lod<ray.length; lod++){
            ray[lod] = ((int)(Math.random()*10)+1);
        }
        rayPrint(ray);
        myRaySort(ray);
        System.out.println();
        rayPrint(ray);
        long tEnd = System.nanoTime();
        long tDelta = tEnd - tStart;
        System.out.println("# of nanoseconds = " + tDelta);
        System.out.println("# of compares = " + compareCount);
        System.out.println("# of swaps = " + swapCount);
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
                compareCount++;
                if(list.get(o) == x){
                    list.remove(o);
                    list.add(0, x);
                    swapCount++;
                }
            }
            x--;
        }
    }

    public static void listPrint(ArrayList<Integer> list){
        for(int i = 0; i<list.size(); i++){
            System.out.print(" " + list.get(i) + " ");
        }
        System.out.println();
    }

    public static void myRaySort(int[] ray){
        for(int i=1; i<ray.length; i++){
            for(int o=1; o>0; o--){
                compareCount++;
                if(ray[o] < ray[o-1]){
                    int x = ray[o];
                    ray[o] = ray[o-1];
                    ray[o-1] = x;
                    swapCount++;
                }
            }
        }
    }

    public static void rayPrint(int[] ray){
        for(int i = 0; i<ray.length; i++){
            System.out.print(" " + ray[i] + " ");
        }
        System.out.println();
    }
}