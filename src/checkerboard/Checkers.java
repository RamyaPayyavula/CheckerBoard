/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author ramya
 */
public class Checkers extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckersboardUI.fxml"));
        Parent root = loader.load();
        CheckersboardUIController controller = loader.getController();
        
        Scene scene = new Scene(root,300,300);
        
        stage.setScene(scene);
        stage.show();
        
        controller.ready(stage, scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
