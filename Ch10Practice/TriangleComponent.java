import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;


/**
 * Write a description of class RectangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    
    int count;
    ArrayList<Point2D.Double> list;
    public TriangleComponent()
    {
        list = new ArrayList<Point2D.Double>();
        count = 0;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (count == 2)
        {
            Line2D.Double line = new Line2D.Double(list.get(0), list.get(1));
            g2.draw(line);
        }
        if (count == 3)
        {
            Line2D.Double line = new Line2D.Double(list.get(0), list.get(1));
            g2.draw(line);
            Line2D.Double line2 = new Line2D.Double(list.get(0), list.get(2));
            g2.draw(line2);
            Line2D.Double line3 = new Line2D.Double(list.get(2), list.get(1));
            g2.draw(line3);
        }
    }
   
    
    public void moveTriangleTo(int x,int y)
    {
        if (count == 3)
        {
            list = new ArrayList<Point2D.Double>();
            count -= 3;
        }
        Point2D.Double p = new Point2D.Double(x,y);
        list.add(p);
        count++;
        
    }
}
