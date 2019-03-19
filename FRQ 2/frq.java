import java.util.*;
public class frq
{
    public String decodeString(ArrayList<StringPart> parts)
    {
        String expanded = "";
        for (StringPart nextPart : parts)
        {
            int ending = nextPart.getStart()+nextPart.getLength();
            expanded += masterString.substring(nextPart.getStart(), ending);
        }
        return expanded;
    } 

    public ArrayList<StringPart> encodeString(String word)
    {
        ArrayList<StringPart> parts = new ArrayList<StringPart>();
        int index = 0;
        while (index < word.length())
        {
            StringPart nextPart = findPart(word.substring(index));
            parts.add(nextPart);
            index += nextPart.getLength();
        }
        return parts;
    } 
}
