public class OtherSortingAlgorithms
{
    public static int compareCount;
    public static int swapCount;

    public static void main(){
        long tStart = System.nanoTime();
        compareCount = 0; 
        swapCount = 0;
        int[] ray = new int[50000];
        for(int lod = 0; lod<ray.length; lod++){
            ray[lod] = ((int)(Math.random()*10)+1);
        }
        rayPrint(ray);
        mergeSort(ray, ray.length);
        System.out.println();
        rayPrint(ray);
        long tEnd = System.nanoTime();
        long tDelta = tEnd - tStart;
        System.out.println();
        System.out.println("# of nanoseconds = " + tDelta);
        System.out.println("# of compares = " + compareCount);
        System.out.println("# of swaps = " + swapCount);
    }

    public static void bubbleSort(int[] ray){
        long tStart = System.currentTimeMillis();
        boolean sorted = false;
        int limit = ray.length;
        while(limit>0){
            for(int i = 0; i<limit-1; i++){
                compareCount++;
                if(ray[i]>ray[i+1]){
                    int swapVar = ray[i];
                    ray[i] = ray[i+1];
                    ray[i+1] = swapVar;
                    swapCount++;
                }
            }
            limit--;
        }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        System.out.println(compareCount);
    }

    public static void rayPrint(int[] ray){
        for(int i = 0; i<ray.length; i++){
            System.out.print(" " + ray[i] + " ");
        }
    }

    public static void selectSort(int[] ray){
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
                compareCount++;
                if(ray[o] == smallNum){
                    int swapVar = ray[o];
                    ray[o] = ray[replaceVar];
                    ray[replaceVar] = swapVar;
                    replaceVar++;
                    swapCount++;
                }
            }
            smallNum++;
        }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        System.out.println(compareCount);
    }

    public static void insertSort(int[] ray){
        long tStart = System.currentTimeMillis();
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
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        System.out.println(compareCount);
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2){
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
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

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left)  {a[k++] = l[i++];}
        while (j < right) {a[k++] = r[j++];}
    }
}