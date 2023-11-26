import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private JButton button;

    public ButtonPanel(ControlPanel controlPanel, DrawingCanvas drawing) {
        button = new JButton("Click me!");
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout());

        topPanel.add(button);
        topPanel.add(controlPanel);

        add(topPanel, BorderLayout.NORTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 pressed");
            }
        });
    }
}