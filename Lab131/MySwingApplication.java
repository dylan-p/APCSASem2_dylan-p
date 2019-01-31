import javax.swing.*;
/**
 * @author Dylan Pratt
 * @version 131
 */
public class MySwingApplication implements Runnable
{
    public void run(){
    
    }
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
