/**
 * Write a description of class Main here.
 *
 * @author Dylan Pratt
 * @version 129
 */
public class Character
{
    public static int speed;
    public static String catchphrase;
    public Character(int _speed, String _catchphrase){
        speed = _speed;
        catchphrase = _catchphrase;
    }
    
    public void setCatchphrase(String add){
        catchphrase = add;
    }
    
    public static String getCatchphrase(){
        return catchphrase;
    }
    
    public static void setSpeed(int add){
        speed = add;
    }
    
    public static int getSpeed(){
        return speed;
    }
}
