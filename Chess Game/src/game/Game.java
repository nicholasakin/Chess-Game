package game;

import java.io.*;



import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.image.*;

/**
 * The game class represents an instance of the Chess game.
 * This class is used as the main class of the Chess game. 
 * 
 * 
 * @author Nicky Akin
 *
 */
public class Game extends Application {
	
	
	private Scene lobbyScene;
	private Scene gameScene;
	private Space[][] boardArr = new Space[8][8];
	private ImageView[][] boardView = new ImageView[8][8];
	private TilePane boardBg = new TilePane(Orientation.HORIZONTAL);
	private TilePane board = new TilePane(Orientation.HORIZONTAL);
	private int[] clicks = new int[4];
	
	
	
	/**
	 * Start method of the Game Application.
	 * This method calls methods that create the game,
	 * and runs the game throughout the play through. 
	 */
	@Override
	public void start(Stage stage) {
	
		
		lobbyScene = makeLobby(stage);
	   
		
	    //makes game board
	    makeBoard();
	    gameScene = makeGame(stage);
		printBoard();

		
		stage.setTitle("Chess v1.0");
		stage.setMinWidth(480);
		stage.setScene(lobbyScene);
		stage.show();
		
	} //start
	
	/**
	 * Helper method to print the board.
	 * Used for a visual check of the board array.
	 */
	private void printBoard() {
	    for (int i = 0; i < 8; i++) {
	    	for (int j = 0; j < 8; j++) {
	    		if (boardArr[i][j].getPiece() != null) {
	    			System.out.print(boardArr[i][j].getPiece().getName() + "\t");
	    		} else {
	    		System.out.print(boardArr[i][j].getPiece() + "\t");
	    		}
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
	private Scene makeGame(Stage stage) {
		resetClicks();
		
		//text representing the color of who's turn
		Text turn = new Text("Turn: White");
		
		Button button = new Button("Test");
		button.setOnAction(e -> {
			System.out.println("Switching");
			ImageView temp = boardView[0][1];
			boardView[0][1] = boardView[0][0];
			boardView[0][0] = temp;
			Piece tempP = boardArr[0][1].getPiece();
			boardArr[0][1].setPiece(boardArr[0][0].getPiece());
			boardArr[0][0].setPiece(tempP); 
			
			printBoard();
		});
		
		//main container in game scene
		StackPane root = new StackPane();
		root.getChildren().addAll(boardBg, board);
		Scene gameScene = new Scene(root);
		
		//scene is returned 
		return gameScene;
		
	} //makeGame
	
	/**
	 * Creates a 2-d array of spaces representing the board.
	 * Shades the array black and white to checker the board.
	 */
	private void makeBoard() {
		//instantiates the board with spaces
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				
				//creaets the space
				boardArr[row][col] = new Space();
				
				//colors space in checkerboard pattern
				if (row % 2 == 0 && col % 2 == 0) {
					boardArr[row][col].setWhite(true);
				} else if (row % 2 == 1 && col % 2 == 1){
					boardArr[row][col].setWhite(true);
				} //else
				
			} //col
		} //row
		
		//Puts pieces on the correct spaces
		genPieces();
		
		//Makes board visual
		genBoard();
		
		//allows the board to be clickable
		setUpClicks();
		
	} //makeBoard
	
	/** 
	 * This method is a helper method to the {@code makeBoard()} method.
	 * This method puts the pieces on the correct spaces column by column. 
	 */
	private void genPieces() {
		Board boardGen = new Board(boardArr);
		boardArr = boardGen.genBoard();
		boardView = boardGen.getBoardView();
	} //genPieces
	
	public void setUpClicks() {
		boardView = ProcessClicks.setUpClicks(boardView);
	} //setUpClicks
	
	public void checkClicks(int x, int y) {
		//fills clicks array with coordinate of first/second click if empty
		//if first and second click have been inputted, move is processed
		System.out.println("CLicked: " + x + ", " + y);
		if (clicks[0] == -1 && clicks[1] == -1) {
			clicks[0] = x;
			clicks[1] = y;
		} else if (clicks[2] != -1 && clicks[3] != -1) {
			clicks[2] = x;
			clicks[3] = y;
		} else {
			processMove();
			resetClicks();
		} //else
		
	} //checkCLicks
	
	public void resetClicks() {
		clicks[0] = -1;
		clicks[1] = -1;
		clicks[2] = -1;
		clicks[3] = -1;
	} //resetClicks
	
	public void processMove() {
		
		
	} //processMove
	
	private void genBoard() {
		
		//tilePane
		board.setMaxWidth(480);
		board.setMinWidth(480);
		Rectangle[][] bg = new Rectangle[8][8];
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (boardView[i][j] != null) {
					board.getChildren().addAll(boardView[i][j]);
				}  //if
				
				if (boardArr[i][j].isWhite()) { //Board color white/black
					bg[i][j] = new Rectangle(60, 60);
					bg[i][j].setFill(Color.WHITE);
					boardBg.getChildren().add(bg[i][j]);
				} else {
					bg[i][j] = new Rectangle(60, 60);
					bg[i][j].setFill(Color.SLATEGRAY);
					boardBg.getChildren().add(bg[i][j]);
				} //if				
			} //j
		} //i
		
	} //genBoard
	
	
	
} //class
