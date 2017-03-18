import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class Main extends Application {

    private PersonalWindow pw = null;

    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "mainf.fxml";
        FXMLLoader loader = new FXMLLoader();

        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

        primaryStage.setTitle("Alcoholmetre");
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.getScene().getStylesheets().add("JMetroDarkTheme.css");




        primaryStage.show();



    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }


}
