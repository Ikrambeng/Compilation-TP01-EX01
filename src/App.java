
// public class App {
//     public static void main(String[] args) throws Exception {

//         new MyFrame();

//     }

// }

//------------------------------with javaFX------------------------------

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
// import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent mainPane = FXMLLoader.load(App.class.getResource("frame.fxml"));

        primaryStage.setTitle("TP Compilation");

        
        primaryStage.getIcons().add(new Image("comp-logo.jpg"));

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }
}
