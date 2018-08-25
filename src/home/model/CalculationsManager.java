package home.model;

import home.model.operations.MultiParametersOperations;
import home.model.operations.OneParameterOperations;

public class CalculationsManager {
    private OneParameterOperations oneParameterOperations;
    private MultiParametersOperations multiParametersOperations;

    private double result;

    public double calculate(OneParameterOperations _oneParameterOperations, double x){
        switch(_oneParameterOperations){
            case SQRT:
                result = Math.sqrt(x);
                break;
            case POW:
                result = Math.pow(x, 2);
                break;
            case SIN:
                result = Math.sin(x);
                break;
            case COS:
                result = Math.cos(x);
                break;
            case TG:
                result = Math.tan(x);
                break;
            case CTG:
                result = 1.0 / Math.tan(x);
                break;
            default:
                result = 0;
        }
        return result;
    }

    public double calculate(MultiParametersOperations _multiParameterOperations, double x, double y ){
        switch(_multiParameterOperations){
            case ADDITION:
                result = x + y;
                break;
            case SUBTRACTION:
                result = x - y;
                break;
            case MULTIPLICATION:
                result = x * y;
                break;
            case DIVISION:
                result = x / y;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
