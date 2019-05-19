import Models.CalculatorModel;
import View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView _view;
    private CalculatorModel _model;

    public CalculatorController(CalculatorModel model, CalculatorView view){
        _model = model;
        _view = view;
        addListeners();
    }

    private void addListeners() {
        _view.addNumbersListeners(new ButtonClickedListener());
    }

    public class ButtonClickedListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            _view.addText(e.getActionCommand());
        }
    }
}
