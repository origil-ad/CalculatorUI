package View;

import javax.swing.*;
import java.awt.*;

public class CalcTextField extends JTextField {
    public CalcTextField(int size) {
        super();
        setPreferredSize(new Dimension(size, size / 5));
        setFont(new Font("SansSerif", Font.BOLD, 25));
    }
}
