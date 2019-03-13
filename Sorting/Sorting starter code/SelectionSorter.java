/**
 * @author Dylan Pratt
 * @version 3013
 */
public class SelectionSorter extends Sorter
{
    public void sort(int[] ray){
        long tStart = System.currentTimeMillis();
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
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
    }
}
