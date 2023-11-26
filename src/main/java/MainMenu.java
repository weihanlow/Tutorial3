import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener{
    JMenu menu;         // One menu
    JMenuItem item;     // Which has one item
    DrawingCanvas drawing;
    public MainMenu(DrawingCanvas drawing){  // MainMenu constructor
        this.drawing = drawing;
        menu=new JMenu("Actions");
        item=new JMenuItem("Clear all");
        // This MainMenu object is also acting as the ActionListener object
        item.addActionListener(this);
        add(menu);                          // Add the JMenu to the JMenuBar
        menu.add(item);                     // Add the JMenuItem to the JMenu
    }

    // If 'this' is set as the ActionListener to all menu items as above, the method
    // below will be called whenever ANY menu item is selected, but the ActionEvent’s
    // ’command’ will be the text of the menu item selected
    public void actionPerformed(ActionEvent e) {
        drawing.clearShapes();
        System.out.println("Cleared all shapes");
    }
}

