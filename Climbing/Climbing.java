import java.util.List;
import java.util.ArrayList;
/**
 * @author Dylan Pratt
 * @version 0410
 */
public class Climbing
{
    private List<ClimbInfo> climbList;

    //part a
    public void addClimb(String peakName, int climbTime)
    {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    //part b

    /** 
    public void addClimb(String peakName, int climbTime)
    {
    int i = 0;

    while(i < climbList.size() &&
    peakName.compareTo(climbList.get(i).getName()) > 0)
    i++;

    climbList.add(i, new ClimbInfo(peakName, climbTime));
    }
     */
    //part c
    class ClimbInfo
    {
        private String name;
        private int time;

        public ClimbInfo(String peakName, int climbTime)
        {
            name = peakName;
            time = climbTime;
        }

        public String getName()
        {
            return name;
        }

        public int getTime()
        {
            return time;
        }

        public String toString()
        {
            return "Peak name: " + name + " time: " + time;
        }
    }

    public Climbing()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimbA(String peakName, int climbTime)
    {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    public int distinctPeakNames()
    {
        if (climbList.size() == 0)
        {
            return 0;
        }

        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for (int k = 1; k < climbList.size(); k++)
        {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0)
            {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }

    public String toString()
    {
        String output ="";
        for (ClimbInfo info : climbList)
        {
            output = output + info.toString() + "\n";
        }
        return output;
    }

    public static void main(String[] args)
    {
        Climbing hikerClub = new Climbing();
        hikerClub.addClimbA("Monadnock", 274);
        hikerClub.addClimbA("Whiteface", 301);
        hikerClub.addClimbA("Algonquin", 225);
        hikerClub.addClimbA("Monadnock", 344);
        System.out.print(hikerClub);
        System.out.println("The order printed above should be Monadnock, Whiteface, Algonquin, Monadnock");
        System.out.println("Distinct peaks is " + hikerClub.distinctPeakNames() + " and should be " + 3);

        hikerClub = new Climbing();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        System.out.print(hikerClub);
        System.out.println("The order printed above should be Algonquin, Monadnock, Monadnock, Whiteface");
        System.out.println("Distinct peaks is " + hikerClub.distinctPeakNames() + " and should be " + 3);
    }

}