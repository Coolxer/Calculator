package home.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
public class MainWindowController{

    @FXML
    private JFXTextField numbersField;

    private double x, y;
    private double result;
    private String operation;

    @FXML
    void onNumpadButtonClicked(ActionEvent event) {
        String value = ((JFXButton)event.getSource()).getText();
        numbersField.setText(numbersField.getText() + value);
    }

    @FXML
    void onOperationButtonClicked(ActionEvent event) {
        String value = ((JFXButton)event.getSource()).getId();

        if(value.equals("clear")) {
            numbersField.clear();
        }else{
            StringBuffer stringBuffer = new StringBuffer(numbersField.getText());
            stringBuffer = stringBuffer.deleteCharAt(numbersField.getText().length() - 1);
            numbersField.setText(stringBuffer.toString());
        }
    }

    @FXML
    void onMultiParametersCalculationButtonClicked(ActionEvent event) {
        String value = ((JFXButton)event.getSource()).getId();

        if(!numbersField.getText().isEmpty()) {
            x = Double.parseDouble(numbersField.getText().trim());
            numbersField.clear();
        }
        operation = value;
    }

    @FXML
    void onSingleParameterButtonClicked(ActionEvent event) {
        String value = ((JFXButton)event.getSource()).getId();

        x = Double.parseDouble(numbersField.getText().trim());

        switch(value){
            case "sqrt":
                result = Math.sqrt(x);
                break;
            case "pow":
                result = Math.pow(x, 2);
                break;
            case "sin":
                result = Math.sin(x);
                break;
            case "cos":
                result = Math.cos(x);
                break;
            case "tg":
                result = Math.tan(x);
                break;
            case "ctg":
                result = 1.0 / Math.tan(x);
                break;
        }
        numbersField.setText(Double.toString(result));
    }

    @FXML
    void onEqualsButtonClicked(ActionEvent event) {

        if(!numbersField.getText().isEmpty()) {
            y = Double.parseDouble(numbersField.getText().trim());
        }

        switch(operation){
            case "plus":
                result = x + y;
                break;
            case "minus":
                System.out.println("lol");
                result = x - y;
                break;
            case "multiply":
                result = x * y;
                break;
            case "divide":
                result = x / y;
                break;
        }
        numbersField.setText(Double.toString(result));
    }

    @FXML
    void onCommaButtonClicked(ActionEvent event) {
        String value = numbersField.getText().trim();
        value += ".";
        numbersField.setText(value);
    }
}
