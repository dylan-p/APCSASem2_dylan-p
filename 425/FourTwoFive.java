import java.util.*;
/**
 * Dylan Pratt
 * 0425
 */
public class FourTwoFive
{
    //start of problem 1
    public Integer findMissing(ArrayList<Integer> arrl){
        int sum = 5050; 
        int smallSum = 0; 
        for(int i = 1; i <arrl.size(); i++){ 
            smallSum +=i; 
        } 
        return sum-smallSum;
    }
    //end of problem 1

    //start of problem 2
    public int findSum(int[] a1, int[] a2, int targ){
        int returnVal = a1[0] + a1[1];
        int returnValTwo = a2[0] + a2[1];
        for(int i = 0; i<a1.length; i++){
            for(int c = i; c<a1.length; c++){
                if(a1[i] + a1[c] > returnVal && a1[i] +a1[c] < targ){
                    returnVal = a1[i] + a1[c];
                }
            }
        }
        for(int i = 0; i<a2.length; i++){
            for(int c = i; c<a2.length; c++){
                if(a2[i] + a2[c] > returnVal && a2[i] +a2[c] < targ){
                    returnValTwo = a2[i] + a2[c];
                }
            }
        }
        return returnVal + returnValTwo;
    }
    //end of problem 2

    //start of problem 3
    public String findFirstRepeating(String letters){
        char[] chars = letters.toCharArray();
        Arrays.sort(chars);
        for(int i = 0; i<chars.length; i++){
            if(chars[i] == chars[i+1]){
                String returnString = Character.toString(chars[i]);
                return returnString;
            }
        }
        return "";
    } 
    //end of problem 3

    //start of problem 4
    public ArrayList<Integer> findIntersection(int[] a1, int[] a2, int [] a3){
        ArrayList<Integer> returnRay = new ArrayList<Integer>();
        for(int i = 0; i<a1.length; i++){
            for(int r = 0; r<a2.length; r++){
                for(int c = 0; c<a3.length; c++){
                    if(a3[c] == a2[r] && a3[c] == a1[i]){
                        returnRay.add(a3[c]);
                    }
                }
            }
        }
        return returnRay;
    }
    //end of problem 4

    //start of problem 5
    public int[][] flipDiagonal(int[][] Mat){
        int[][] MatTwo = new int[Mat.length][Mat[0].length];
        for(int r = 0; r<Mat.length; r++){
            for(int c = 0; c<Mat[r].length; c++){
                MatTwo[r][c] = Mat[c][r];
            }
        }
        for(int r = 0; r<Mat.length; r++){
            for(int c = 0; c<Mat[r].length; c++){
                Mat[r][c] = MatTwo[c][r];
            }
        }
        return Mat;
    }
    //end of problem 5
}