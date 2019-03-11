import java.util.*;
/**
 * @author Dylan Pratt
 * @version 3011
 */
public class Yes
{
    private ArrayList<WordPair> allPairs;

    public Yes(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length-1; i++)
        {
            for (int j = i+1; j < words.length; j++)
            {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches()
    {
        int count = 0;
        for (WordPair pair: allPairs)
        {
            if (pair.getFirst().equals(pair.getSecond()))
            {
                count++;
            }
        }
        return count;
    }
}

class WordPair {
    private String one;
    private String two;
    public WordPair(String one, String two){
        this.one = one;
        this.two = two;
    }

    public String getFirst(){ return one; }

    public String getSecond(){ return two; }
}