import javax.swing.JFrame;

public class RectangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new RectangleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("RectangleViewer");
        frame.setVisible(true);
    }
    
    
}
