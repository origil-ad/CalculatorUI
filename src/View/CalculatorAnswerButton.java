package View;

import java.awt.*;

public class CalculatorAnswerButton extends CalculatorButton {
    public CalculatorAnswerButton(String text, int size) {
        super(text, size);
    }

    @Override
    public void setSize(int size) {
        setPreferredSize(new Dimension(size / 5, size * 4 / 5));
    }
}
