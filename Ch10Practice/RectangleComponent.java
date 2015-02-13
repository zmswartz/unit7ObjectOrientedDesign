import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * Write a description of class RectangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleComponent extends JComponent
{
    private Rectangle box;
    private int y = 100;
    private int x = 100;
    private int width = 20;
    private int height = 30;
    public RectangleComponent()
    {
        box = new Rectangle(x,y,width,height);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
    
    public void moveRectangleTo(int x,int y)
    {
        box.setLocation(x,y);
        repaint();
    }
}
