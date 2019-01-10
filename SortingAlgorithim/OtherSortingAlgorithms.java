
/**
 * Write a description of class OtherSortingAlgorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OtherSortingAlgorithms
{
    public static void main(){
        int[] ray = new int[10];
        for(int lod = 0; lod<ray.length; lod++){
            ray[lod] = ((int)(Math.random()*10)+1);
        }
        rayPrint(ray);
        selectSort(ray);
        System.out.println();
    rayPrint(ray);
    }

    public static void bubbleSort(int[] ray){
        boolean sorted = false;
        int limit = ray.length;
        while(limit>0){
            for(int i = 0; i<limit-1; i++){
                if(ray[i]>ray[i+1]){
                    int swapVar = ray[i];
                    ray[i] = ray[i+1];
                    ray[i+1] = swapVar;
                }
            }
            limit--;
        }
    }

    public static void rayPrint(int[] ray){
        for(int i = 0; i<ray.length; i++){
            System.out.print(" " + ray[i] + " ");
        }
    }
    
    public static void selectSort(int[] ray){
        int smallNum = 0;
        int replaceVar = 0;
        for(int i = 0; i<ray.length; i++){
            if(ray[i] < smallNum){
                smallNum = ray[i];
            }
        }

        for(int i = 0; i<ray.length; i++){
            for(int o = 0; o<ray.length; o++){
                if(ray[o] == smallNum){
                    int swapVar = ray[o];
                    ray[o] = ray[replaceVar];
                    ray[replaceVar] = swapVar;
                    replaceVar++;
                }
            }
            smallNum++;
        }
    }
}
