import java.util.*;
public class ArrayListGorithms
{
    public static int compareCount;
    public static int swapCount;
    
    public static void main(){
        long tStart = System.nanoTime();
        compareCount = 0; 
        swapCount = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int lod = 0; lod<50000; lod++){
            list.add((int)(Math.random()*10+1));
        }
        listPrint(list);
        selectSort(list);
        System.out.println();
        listPrint(list);
        long tEnd = System.nanoTime();
        long tDelta = tEnd - tStart;
        System.out.println("# of nanoseconds = " + tDelta);
        System.out.println("# of compares = " + compareCount);
        System.out.println("# of swaps = " + swapCount);
    }

    public static void bubbleSort(ArrayList<Integer> list){
        boolean sorted = false;
        int limit =list.size();
        while(limit>0){
            for(int i = 0; i<limit-1; i++){
                compareCount++;
                if(list.get(i)>list.get(i+1)){
                    int swapVar =list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, swapVar);
                    swapCount++;
                }
            }
            limit--;
        }
    }

    public static void listPrint(ArrayList<Integer> list){
        for(int i = 0; i<list.size(); i++){
            System.out.print(" " + list.get(i) + " ");
        }
        System.out.println();
    }

    public static void selectSort(ArrayList<Integer> list){
        int smallNum = 0;
        int replaceVar = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) < smallNum){
                smallNum = list.get(i);
            }
        }

        for(int i = 0; i<list.size(); i++){
            for(int o = 0; o<list.size(); o++){
                compareCount++;
                if(list.get(o) == smallNum){
                    int swapVar = list.get(o);
                    list.set(o, list.get(replaceVar));
                    list.set(replaceVar, swapVar);
                    replaceVar++;
                    swapCount++;
                }
            }
            smallNum++;
        }
    }

    public static void insertSort(ArrayList<Integer> list){
        for(int i=1; i<list.size(); i++){
            for(int o=1; o>0; o--){
                compareCount++;
                if(list.get(o) < list.get(o-1)){
                    int x = list.get(o);
                    list.set(o, o-1);
                    list.set(o-1, x);
                    swapCount++;
                }
            }
        }
    }
}
