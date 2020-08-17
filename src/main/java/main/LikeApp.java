package main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LikeApp extends Application{
	
	public static void main(String[] args) {
		launch();

	}
	
	@Override
    public void start(Stage primaryStage) throws Exception{
		
		VBox box = (VBox)FXMLLoader.load(getClass().getResource("/template.fxml"));
		
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	

}
