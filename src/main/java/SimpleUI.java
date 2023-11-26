import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleUI {
    static GraphicsConfiguration gc;	// Contains this computer’s graphics configuration
    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        ControlPanel controlPanel = new ControlPanel();
        DrawingCanvas drawing = new DrawingCanvas(controlPanel);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new MainMenu(drawing));

        frame.setSize(800,800);
        frame.setLayout(new BorderLayout()); // Set layout manager
        frame.add(drawing, BorderLayout.CENTER); // Add drawing to center
        frame.getContentPane().add(new ButtonPanel(controlPanel, drawing), BorderLayout.SOUTH);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

}
