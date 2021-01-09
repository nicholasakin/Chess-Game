package game;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;


public class Game extends Application {
	
	
	Scene lobbyScene;
	Scene gameScene;
	
	@Override
	public void start(Stage stage) {
		
		
		
		
		
		lobbyScene = makeLobby(stage);
	    gameScene = makeGame(stage);
		
		
		
		stage.setTitle("Chess v1.0");
		stage.setScene(lobbyScene);
		stage.show();
		
	} //start
	
	/**
	 * Helper method used to create lobby for game.
	 * Lobby allows players to wait and click 'play' to start the game.
	 * The 'play' button transitions the scene to the game scene.
	 * @param stage - Main stage of the application. Taken in to have the lobby scene applied.
	 * @return lobbyScene - Scene representing the lobby of the game
	 */
	public Scene makeLobby(Stage stage) {
		//button that transitions the lobbh scene to the game scene
		Button play = new Button("Play");
		
		//buttons action to set the scene of the main stage
		play.setOnAction(e -> {
			System.out.println("Switching scene");
			stage.setScene(gameScene);
		});
		
		//main container of the lobby
		VBox lobby = new VBox(play);
		Scene lobbyScene = new Scene(lobby);
		
		//returning the lobby scene
		return lobbyScene;
		
	} //make lobby
	
	/**
	 * Helper method used to create game scene for game.
	 * Game allows two players to play the chess game. 
	 * The players can also return to the lobby to reset the game. 
	 * The 'play' button transitions the scene to the game scene.
	 * @param stage - Main stage of the application. Taken in to have the lobby scene applied.
	 * @return gameScene - Scene representing the main game area. 
	 */
	public Scene makeGame(Stage stage) {
		//text representing the color of who's turn
		Text turn = new Text("Turn: White");
		
		//main container in game scene
		VBox root = new VBox(turn);
		Scene gameScene = new Scene(root);
		
		//scene is returned 
		return gameScene;
		
	} //makeGame
	
	
	
	
} //class
