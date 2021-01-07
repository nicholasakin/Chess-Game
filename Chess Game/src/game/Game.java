package game;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Game extends Application {

	@Override
	public void start(Stage stage) {
		VBox root = new VBox();
		root.getChildren().addAll(new Button("Test"));
		
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Chess v1.0");

		
	} //start
	
	
} //class
