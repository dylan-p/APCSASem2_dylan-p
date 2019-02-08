import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent 
implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    //declares and initializes global variables
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
    //Sets up the timer and other values
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
    //remakes the square in a new location
    protected void paintComponent(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    } 

    public void mouseClicked(MouseEvent e){

    }
    //tells if the mouse has selected the rectangle
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
    //detects where the mouse is
    public void mouseDragged(MouseEvent e){
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        x = mouseToX;
        y = mouseToY;
        repaint();
    }

    public void mouseMoved(MouseEvent e){

    }
    //Moves the square
    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = getSize();
        //if the square hits the right wall
        if(x + gutterX + width > 525){
            animationDeltaX = 0;
            animationDeltaY = -1;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        //if the square hits the top wall
        if(y + gutterY + height>525){
            animationDeltaX = 1;
            animationDeltaY = 0;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        //if the square hits the left wall
        if(x<gutterX){
            animationDeltaX = 0;
            animationDeltaY = 1;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        //if the square hits the bottom wall
        if(y<gutterY){
            animationDeltaX = -1;
            animationDeltaY = 0;
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        //If the square is just existing
        else{
            x += animationDeltaX*motionSpeed;
            y += animationDeltaY*motionSpeed;
        }
        repaint();
    }
    //Speeds up or slows down the cube
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