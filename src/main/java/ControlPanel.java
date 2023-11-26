import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel{
    private final JSlider redSlider, blueSlider, greenSlider, sizeSlider;
    private final JComboBox<String> shapeSelector;
    static final int RGB_max = 255;
    static final int RGB_min = 0;

    public ControlPanel() {
        setLayout(new GridLayout(4, 1));

        redSlider = new JSlider(RGB_min, RGB_max);
        createSlider("Red", redSlider);
        blueSlider = new JSlider(RGB_min, RGB_max);
        createSlider("Blue", blueSlider);
        greenSlider = new JSlider(RGB_min, RGB_max);
        createSlider("Green", greenSlider);
        sizeSlider = new JSlider(10, 100);
        createSlider("Size", sizeSlider);

        shapeSelector = new JComboBox<>(new String[]{"Circle", "Rectangle", "Square"});
        add(shapeSelector);
    }

    private void createSlider(String sliderName, JSlider slider){
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(sliderName);
        panel.add(slider, BorderLayout.BEFORE_LINE_BEGINS);
        panel.add(label, BorderLayout.NORTH);
        add(panel);
    }
    public Color getCurrentColor() {
        return new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue());
    }
    public String getCurrentShape() {
        return (String) shapeSelector.getSelectedItem();
    }

    public int getCurrentSize() {
        return sizeSlider.getValue();
    }
}

