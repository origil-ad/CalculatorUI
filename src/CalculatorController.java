import Models.CalculatorModel;
import View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorController {
    private CalculatorView _view;
    private CalculatorModel _model;
    private boolean _isAfterOperator;

    CalculatorController(CalculatorModel model, CalculatorView view) {
        _model = model;
        _view = view;
        _isAfterOperator = false;
        addListeners();
    }

    private void addListeners() {
        _view.addNumbersListeners(new ButtonClickedListener());
        _view.addDotListener(new ButtonClickedListener());
        _view.addOperatorsListeners(new OperatorClickedListener());
        _view.addNegativeListener(new NegativeClickedListener());
        _view.addAnswerListener(new AnswerClickedListener());
    }

    public class ButtonClickedListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (_isAfterOperator){
                _view.setNumber("");
                _isAfterOperator = false;
            }
            _view.addText(e.getActionCommand());
        }
    }

    public class OperatorClickedListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            var operator = e.getActionCommand();
            var currentNum = _view.getNumber();

            var result = _model.calculate(Double.parseDouble(currentNum));
            _model.set_operator(operator);
            _model.set_lastNumber(result);
            _view.setNumber(String.valueOf(result));
            _isAfterOperator = true;
        }
    }

    public class NegativeClickedListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            var currentNum = _view.getNumber();
            if (currentNum.startsWith("-")) {
                _view.setNumber(currentNum.substring(1));
            } else {
                _view.setNumber("-" + currentNum);
            }
        }
    }

    public class AnswerClickedListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            var currentNum = _view.getNumber();

            var result = _model.calculate(Double.parseDouble(currentNum));
            _model.set_operator("");
            _model.set_lastNumber(result);
            _view.setNumber(String.valueOf(result));
            _isAfterOperator = true;
        }
    }
}