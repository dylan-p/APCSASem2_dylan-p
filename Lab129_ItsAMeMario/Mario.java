/**
 * Write a description of class Main here.
 *
 * @author Dylan Pratt
 * @version 129
 */
public class Mario extends Character
{
    public Mario(int _speed, String _catchphrase)
    {
        super(_speed, _catchphrase);
    }
    
    public static void setSpeed(int doubler){
        speed = doubler*2;
    }
}
