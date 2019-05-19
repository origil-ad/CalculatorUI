package Models;

public class CalculatorModel {

    private double _lastNumber;
    private String _operator;

    public CalculatorModel(){
        _lastNumber = 0;
        _operator = "";
    }

    public void set_lastNumber(double _lastNumber) {
        this._lastNumber = _lastNumber;
    }

    public void set_operator(String _operator) {
        this._operator = _operator;
    }

    public double calculate(double num){
        switch(_operator){
            case "+":{
                return _lastNumber + num;
            }
            case "-":{
                return _lastNumber - num;
            }
            case "*":{
                return _lastNumber * num;
            }
            case "/":{
                return _lastNumber / num;
            }
            default:{
                return num;
            }
        }
    }
}