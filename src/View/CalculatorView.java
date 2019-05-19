package View;

import javax.swing.*;
import Models.CalculatorModel;

import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private final int SIZE = 500;

    private JTextField _textField;
    private JPanel _buttonsPannel;

    public CalculatorView(CalculatorModel model){

        _textField = new CalcTextField(SIZE);
        _buttonsPannel = new ButtonsPanel(SIZE);

        setLayout(new BorderLayout());
        add(_textField, BorderLayout.PAGE_START);
        add(_buttonsPannel, BorderLayout.LINE_START);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(SIZE, SIZE));
        setVisible(true);

    }

    public void addText(String actionCommand) {
        String tmp = _textField.getText();
        tmp += actionCommand;
        _textField.setText(tmp);
    }

    public void addPlusListener(ActionListener actionListener){
        ((ButtonsPanel)_buttonsPannel).addPlusListener(actionListener);
    }

    public void addMinusListener(ActionListener actionListener){
        ((ButtonsPanel)_buttonsPannel).addMinusListener(actionListener);
    }

    public void addMultiplyListener(ActionListener actionListener){
        ((ButtonsPanel)_buttonsPannel).addMultiplyListener(actionListener);
    }

    public void addDivideListener(ActionListener actionListener){
        ((ButtonsPanel)_buttonsPannel).addDivideListener(actionListener);
    }

    public void addDotListener(ActionListener actionListener){
        ((ButtonsPanel)_buttonsPannel).addDotListener(actionListener);
    }

    public void addNegativeListener(ActionListener actionListener){
        ((ButtonsPanel)_buttonsPannel).addNegativeListener(actionListener);
    }

    public void addAnswerListener(ActionListener actionListener){
        ((ButtonsPanel)_buttonsPannel).addAnswerListener(actionListener);
    }

    public void addNumbersListeners(ActionListener buttonClickedListener) {
        ((ButtonsPanel)_buttonsPannel).addNumbersListeners(buttonClickedListener);
    }
}