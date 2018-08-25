package home;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML
    private JFXTextField numbersField;

    @FXML
    private JFXButton zero0Button;

    @FXML
    private JFXButton equalsButton;

    @FXML
    private JFXButton dotButton;

    @FXML
    private JFXButton one1Button;

    @FXML
    private JFXButton four4Button;

    @FXML
    private JFXButton two2Button;

    @FXML
    private JFXButton three3Button;

    @FXML
    private JFXButton minusButton;

    @FXML
    private JFXButton five5Button;

    @FXML
    private JFXButton six6Button;

    @FXML
    private JFXButton multiplyButton;

    @FXML
    private JFXButton eight8Button;

    @FXML
    private JFXButton nine9Button;

    @FXML
    private JFXButton divideButton;

    @FXML
    private JFXButton sqrtButton;

    @FXML
    private JFXButton pow2Button;

    @FXML
    private JFXButton seven7Button;

    @FXML
    private JFXButton plusButton;

    @FXML
    private JFXButton backspaceButton;

    @FXML
    private JFXButton clearButton;

    private JFXButton[] numButtons = {zero0Button, one1Button, two2Button, three3Button,
                                      four4Button, five5Button, six6Button, seven7Button,
                                      eight8Button, nine9Button};

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/home/view/mainWindow.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 320, 530));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
