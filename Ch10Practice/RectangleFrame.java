import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class RectangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private RectangleComponent scene;
    /**
     * Default constructor for objects of class RectangleFrame
     */
    public RectangleFrame()
    {
        scene = new RectangleComponent();
        add(scene);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        
        MouseListener l = new MousePressListener();
        
        scene.addMouseListener(l);
        
        
        
        
    }
    
    
        class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) 
        {
            int x = event.getX();
            int y = event.getY();
            scene.moveRectangleTo(x,y);
            
            scene.repaint();
        }
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
}
