import javax.swing.*;
/**
 * @author Dylan Pratt
 * @version 131
 */
public class MySwingApplication implements Runnable
{
    JFrame frame;
    CanvasComponent canvasComponent;
    public void run(){
        frame = new JFrame();
        frame.setSize(525, 525);
        canvasComponent = new CanvasComponent(125, 125);
        frame.add(canvasComponent);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}