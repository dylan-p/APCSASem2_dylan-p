public class GridTester
{
    private int columns;
    private int rows; 
    public Cell[][] arr;
    /**
     * Constructor for objects of class GridTester
     */
    public GridTester(int rowParam, int colParam)
    {
        rows = rowParam;
        columns = colParam;
        arr = new Cell[rows][columns];
    }

    public void loadOccupied(){
        for(int i =0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                int randomNum = (int)(Math.random()*3)+1;
                if(randomNum == 1){
                    arr[i][j] = true;
                }
                else{
                    arr[i][j] = false;
                }
            }
        }
    }
}