import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 150;
    
    private JFrame frame;
    private JPanel panel;
    private JButton button, button2;
    private JLabel label;
    public ButtonViewer()
    {
        frame = new JFrame();
        panel = new JPanel();
        
        button = new JButton("Click me!");
        panel.add(button);
        
        button2 = new JButton("Click me too!");
        panel.add(button2);
        
        label = new JLabel("No button Clicked");
        panel.add(label);
        
        frame.add(panel);
        
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);//Must have. most common mistake
        button2.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



    public class ClickListener implements ActionListener
    {
    
        public void actionPerformed(ActionEvent event)
        {
        
            label.setText(event.getActionCommand() + " was clicked");
       
        }
    }



    public static void main(String[] args)
    {
        ButtonViewer feafdsa = new ButtonViewer();
    }
}
