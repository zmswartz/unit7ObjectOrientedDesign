import javax.swing.JFrame;

public class TriangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new TriangleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("TriangleViewer");
        frame.setVisible(true);
    }
    
    
}
