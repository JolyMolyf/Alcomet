import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonalWindow {

    public PersonalWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent load = (Parent) loader.load(getClass().getResource("personal.fxml"));
        Stage qqq = new Stage();
        qqq.setTitle("Window 2014");
        System.out.print("fdfgdf");
        Scene scene = new Scene(load);
        qqq.setScene(scene);
        qqq.showAndWait();
    }

}
