package game;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;


public class Game extends Application {
	
	VBox lobby;
	Scene lobbyScene;
	Scene gameScene;
	
	@Override
	public void start(Stage stage) {
		
		
		
		makeLobby(stage);
		
		lobbyScene = new Scene(lobby);
	    gameScene = makeGame(stage);
		
		
		
		stage.setTitle("Chess v1.0");
		stage.setScene(lobbyScene);
		stage.show();
		
	} //start
	
	/**
	 * Helper method used to create lobby for game.
	 * Lobby allows players to wait and click 'play' to start the game.
	 * The 'play' button transitions the scene to the game scene.
	 */
	public void makeLobby(Stage stage) {
		Button play = new Button("Play");
		
		play.setOnAction(e -> {
			System.out.println("Switching scene");
			stage.setScene(gameScene);
		});
		
		lobby = new VBox(play);
		
	} //make lobby
	
	public Scene makeGame(Stage stage) {
		Text turn = new Text("Turn: White");
		VBox root = new VBox(turn);
		Scene gameScene = new Scene(root);
		return gameScene;
		
		
	} //makeGame
	
	
} //class
