import java.awt.Rectangle;

/**
 * Write a description of class BetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class BetterRectangle
     */
    public BetterRectangle()
    {
        setLocation(5,5);
        setSize(10,10);
    }

    public double getArea()
    {
        
        double h = getHeight();
        double w = getWidth();
        return h*w;
    }
    
    public double getPerimiter()
    {
        
        double h = getHeight();
        double w = getWidth();
        return h*2 + w*2;
    }


}
