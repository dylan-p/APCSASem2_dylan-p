import java.util.*;
/**
 * @author Dylan Pratt
 * @version 0415
 */
public class someClass
{
    public void sortStrings(ArrayList<String> names){
        String temp = "";
        for(int i=0; i<names.size(); i++)
        {
            for(int j=1; j<names.size(); j++)
            {
                if(names.get(j-1).compareTo(names.get(j))>0)
                {
                    temp = names.get(j-1);
                    names.set(j-1, names.get(j));
                    names.set(j, temp);
                }
            }
        }
    }

    public void shuffleStrings(ArrayList<String> names){
        Random rgen = new Random();  // Random number generator			
        for (int i=0; i<names.size(); i++) {
            int randomPosition = rgen.nextInt(names.size());
            String temp = names.get(i);
            names.set(i, names.get(randomPosition));
            names.set(randomPosition, temp);
        }
    }
    
    public void insertString(String word, ArrayList<String> names){
        names.add(word);
        sortStrings(names);
    }
}