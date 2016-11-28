import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class View
{
    private JFrame frame;
    private JLabel screen = new JLabel("");
    private JLabel seats = new JLabel("");
    
    public View()
    {
        makeFrame();
    }
    
    public void setScreen(String screen) {
        screen = "";
    }
    
    public void setSeats(String screen) {
        screen = "";
    }
    
    private void quit()
    {
        System.exit(0);
    }
    
    private void openFile()
    {
        // this is some test output, until we do this properly
        System.out.println("open file");
    }
    
    
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");
        frame.setLayout(new FlowLayout());
        makeMenuBar(frame);
        
        Container contentPane = frame.getContentPane();
        contentPane.setPreferredSize(new Dimension(800, 600));
        
        contentPane.add(screen);
        contentPane.add(seats);
        // building is done - arrange the components and show
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Create the main frame's menu bar.
     * @param frame   The frame that the menu bar should be added to.
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(e -> openFile());
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(e -> quit());
        fileMenu.add(quitItem);
    }
    
}