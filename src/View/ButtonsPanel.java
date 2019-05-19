package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonsPanel extends JPanel {

    private CalculatorButton _plus;
    private CalculatorButton _minus;
    private CalculatorButton _multiply;
    private CalculatorButton _divide;
    private CalculatorButton _answer;
    private CalculatorButton _dot;
    private CalculatorButton _negative;
    private ArrayList<CalculatorButton> _numButtons;

    public ButtonsPanel(int size){
        _numButtons = new ArrayList<>();
        setPreferredSize(new Dimension(size, size * 4/5));
        _plus = new CalculatorButton("+", size);
        _minus = new CalculatorButton("-", size);
        _multiply = new CalculatorButton("*", size);
        _divide = new CalculatorButton("/", size);
        _dot = new CalculatorButton(".", size);
        _negative = new CalculatorButton("+/-", size);
        _answer  = new CalculatorAnswerButton("=", size);

        var ansPanel = new JPanel(new BorderLayout());
        ansPanel.setPreferredSize(new Dimension(size/5,size *4/5));
        ansPanel.add(_answer, BorderLayout.CENTER);
        var centerPanel = new JPanel(new GridLayout(4,3));
        centerPanel.setPreferredSize(new Dimension(size *3/5, size *4/5));
        for (int i = 0; i < 10; i++) {
            var button = generateNumButton(i, size);
            _numButtons.add(button);
            centerPanel.add(button);
        }
        centerPanel.add(_dot);
        centerPanel.add(_negative);

        var operatorsPanel = new JPanel(new GridLayout(4,1));
        operatorsPanel .setPreferredSize(new Dimension(size /5, size *4/5));
        operatorsPanel.add(_divide);
        operatorsPanel.add(_multiply);
        operatorsPanel.add(_minus);
        operatorsPanel.add(_plus);

        setLayout(new BorderLayout());
        add(ansPanel, BorderLayout.LINE_START);
        add(centerPanel, BorderLayout.CENTER);
        add(operatorsPanel, BorderLayout.LINE_END);
        setVisible(true);
    }

    private CalculatorButton generateNumButton(int i, int size) {
        return new CalculatorButton(String.valueOf(i),size);
    }

    public void addPlusListener(ActionListener actionListener){
        _plus.addActionListener(actionListener);
    }

    public void addMinusListener(ActionListener actionListener){
        _minus.addActionListener(actionListener);
    }

    public void addMultiplyListener(ActionListener actionListener){
        _multiply.addActionListener(actionListener);
    }

    public void addDivideListener(ActionListener actionListener){
        _divide.addActionListener(actionListener);
    }

    public void addDotListener(ActionListener actionListener){
        _dot.addActionListener(actionListener);
    }

    public void addNegativeListener(ActionListener actionListener){
        _negative.addActionListener(actionListener);
    }

    public void addAnswerListener(ActionListener actionListener){
        _answer.addActionListener(actionListener);
    }

    public void addNumbersListeners(ActionListener actionListener){
        _numButtons.forEach(calculatorButton -> calculatorButton.addActionListener(actionListener));
    }
}