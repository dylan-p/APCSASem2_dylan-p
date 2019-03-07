
/**
 * Write a description of class ie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ie
{
   String notString;
   public boolean isValid(String str){
       for(int i = 0; i<str.length()-notString.length(); i++){
           if(str.substring(i, i+notString.length()).equals(notString)){
               return false;
            }
       }
       return true;                                                                               
    }
}
