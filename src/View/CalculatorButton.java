package View;

import javax.swing.*;
import java.awt.*;

public class CalculatorButton extends JButton {
    public CalculatorButton(String text, int size){
        super(text);
        setFont(new Font("SansSerif", Font.BOLD, 15));
        setSize(size);
    }

    protected void setSize(int size){
        setPreferredSize(new Dimension(size / 5, size / 5));
    }
}