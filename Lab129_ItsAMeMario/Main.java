/**
 * Write a description of class Main here.
 *
 * @author Dylan Pratt
 * @version 129
 */
public class Main
{
    public static void main(){
        Mario marioObj = new Mario(100, "It's a me, Mario!");
        marioObj.setSpeed(100);
        System.out.println(marioObj.getCatchphrase());
        System.out.println(marioObj.getSpeed());
    }
}
