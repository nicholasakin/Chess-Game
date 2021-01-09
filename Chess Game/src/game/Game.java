package game;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

/**
 * The game class represents an instance of the Chess game.
 * This class is used as the main class of the Chess game. 
 * 
 * 
 * @author nicho
 *
 */
public class Game extends Application {
	
	
	private Scene lobbyScene;
	private Scene gameScene;
	private Space[][] board = new Space[8][8];
	
	/**
	 * Start method of the Game Application.
	 * This method calls methods that create the game,
	 * and runs the game throughout the play through. 
	 */
	@Override
	public void start(Stage stage) {
	
		
		lobbyScene = makeLobby(stage);
	    gameScene = makeGame(stage);
		
	    //makes game board
	    makeBoard();
		printBoard();

		
		stage.setTitle("Chess v1.0");
		stage.setScene(lobbyScene);
		stage.show();
		
	} //start
	
	private void printBoard() {
	    for (int i = 0; i < 8; i++) {
	    	for (int j = 0; j < 8; j++) {
	    		System.out.print(board[i][j].isWhite() + "\t");
	    	} //j
	    	System.out.println();
	    } //i
	}
	
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
	
	
	public void makeBoard() {
		//instantiates the board with spaces
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				board[row][col] = new Space();
				if (row % 2 == 0 && col % 2 == 0) {
					board[row][col].setWhite(false);
				} else if (row % 2 == 1 && col % 2 == 0){
					board[row][col].setWhite(true);
				}
			} //col
		} //row
		
		//makes 2-d array representing board
		//loops column by column instantiating pieces of board
		
		for (int col = 0; col < 8; col++) {
			for (int row = 0; row < 8; row++) {
				
				//instantiates pieces column by column
				if (col == 0 && row == 0 || row == 7) {
					if (row == 0) {
						board[row][col].setPiece(new King("Rook", 7, true));
						board[row][col].getPiece().setPos(row,  col);
					} else {
						board[row][col].setPiece(new King("Rook", 7, false));
						board[row][col].getPiece().setPos(row,  col);
					} //else
					
				} //Rook
				
				if (row == 1 || row == 6) {
					if (row == 1) {
						board[row][col].setPiece(new King("Pawn", 1, true));
					} else {
						board[row][col].setPiece(new King("Pawn", 1, false));
					} //else
				} //Pawns
				
			} //row
		} //col
		
	} //makeBoard
	
	
} //class
