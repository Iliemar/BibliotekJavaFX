package application1D;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainController1D extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("/application1D/FXML.fxml"));
			Scene scene= new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Color");
			primaryStage.setScene(scene);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
