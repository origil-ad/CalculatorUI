import Models.CalculatorModel;
import View.CalculatorView;

public class Maman13Q2 {

    public static void main(String[] args){
        CalculatorModel         model   =   new CalculatorModel();
        CalculatorView          view    =   new CalculatorView(model);
        CalculatorController    ctrl    =   new CalculatorController(model, view);
    }
}