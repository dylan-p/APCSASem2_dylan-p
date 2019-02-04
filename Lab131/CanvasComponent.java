import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    int x;
    int y;
    int width = 125;
    int height = 125;
    int mouseFromX;
    int mouseFromY;
    boolean shapeSelected;

    public CanvasComponent(int _width, int _height)
    {
        width = _width;
        height = _height;
        setSize(width, height);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    protected void paintComponent(Graphics g){
        g.setColor(Color.green);
        x = 265;
        y = 265;
        g.fillRect(x, y, width, height);
    } 

    public void mouseClicked(MouseEvent e){

    }

    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX >= x && mouseFromX<=x+width
        && mouseFromY >= y && mouseFromY <=y+width){
            shapeSelected = true;
            x = mouseFromX;
            y = mouseFromY;
        }
        repaint();
    }

    public void mouseReleased(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }

    public void mouseDragged(MouseEvent e){
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        x = mouseToX;
        y = mouseToY;
        repaint();
    }

    public void mouseMoved(MouseEvent e){

    }
}
