import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Controller {
    Human h = null;
    PersonalWindow pw = null;
    final Stage dialog = new Stage();;

    @FXML
    public void initialize() throws IOException {

        File f = new File("properties.data");
        if (!f.exists()) {
            //new PersonalWindow();

        }

        FXMLLoader loader2 = new FXMLLoader();
        Parent root2 = (Parent) loader2.load(getClass().getResourceAsStream("personal.fxml"));
        Scene scene2 = new Scene(root2);
        dialog.setScene(scene2);
        dialog.initModality(Modality.WINDOW_MODAL);
//        ToggleGroup gender = new ToggleGroup();
//        male.setToggleGroup(gender);
//        female.setToggleGroup(gender);
//        File f = new File("properties.data");
//        if (f.exists() && !f.isDirectory()) {
//            h = Human.readFromFile();
//            if (h != null) {
//                massOfThePerson.setText(String.valueOf(h.getP()));
//                if (h.isG()) {
//                    male.fire();
//                } else {
//                    female.fire();
//                }
//            }
//        }
    }


    @FXML
    public RadioButton female;
    @FXML
    public RadioButton male;
    @FXML
    public TextField massOfThePerson;
    @FXML
    public TextField procentOfAlchohol;
    @FXML
    public TextField time;
    @FXML
    public TextField amountOfDrunken;
    @FXML
    public Button submit;
    @FXML
    public TextField result;
    @FXML
    public Label lPersonsMass;
    @FXML
    public Label lProcentOfAlchohol ;
    @FXML
    public Label lAmountOfAlchohol;
    @FXML
    public Label lSelectYourGender;
    @FXML
    public Button personal;
    @FXML
    public void counter() {
        double c;
        double a;
        double p;
        double r;
        double b = 0.13;
        double t;
        double procent = Double.valueOf(procentOfAlchohol.getText());
        double amount = Double.valueOf(amountOfDrunken.getText());
        if (male.isSelected()) {r = 0.68;} else {r = 0.55;}
        t = Double.valueOf(time.getText());
        a = amount * procent;
        p = Double.valueOf(massOfThePerson.getText())/100;

        h = new Human(p, male.isSelected());
        h.savetofile();

        c = a / (p * r) - b * t;
        result.setText(String.valueOf(c));


    }

    @FXML
    public void goToWindow() throws IOException {

        dialog.showAndWait();
    }
}
