import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent 
implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    int x;
    int y;
    int width = 125;
    int height = 125;
    int mouseFromX;
    int mouseFromY;
    boolean shapeSelected;
    int animationDeltaX = 1;
    int animationDeltaY = 0;
    int gutterX = 10;
    int gutterY = 10;
    Timer animationTimer;
    int motionSpeed = 1;

    public CanvasComponent(int _width, int _height)
    {
        width = _width;
        height = _height;
        setSize(width, height);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);
        animationTimer.start();
    }

    protected void paintComponent(Graphics g){
        g.setColor(Color.green);
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

    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = getSize();
        if(x + gutterX + width > 525){
            animationDeltaX = 0;
            animationDeltaY = -1;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        if(y + gutterY + height>525){
            animationDeltaX = 1;
            animationDeltaY = 0;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        if(x<gutterX){
            animationDeltaX = 0;
            animationDeltaY = 1;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        if(y<gutterY){
            animationDeltaX = -1;
            animationDeltaY = 0;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        else{
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        repaint();
    }

    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();
        if(keyChar == '+'){
            motionSpeed+=1;
        }
        if(keyChar == '-'){
            motionSpeed+=-1;
        }
    }

    public void keyPressed(KeyEvent e){

    }

    public void keyReleased(KeyEvent e){

    }
}