package game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

/**
 * This class represents an instance of the {@code Chess Board}. It is used to
 * generate the pieces in the correct positions of the board.
 * 
 * @author Nicky Akin
 *
 */
public class Board {
	Space[][] board;
	ImageView[][] boardView = new ImageView[8][8];

	public Board(Space[][] board) {
		this.board = board;
	} // constructor

	public Space[][] genBoard() {
		// loops column by column instantiating pieces of board
		try {
			for (int col = 0; col < 8; col++) {
				for (int row = 0; row < 8; row++) {

					// instantiates pieces column by column

					// Sets Rooks to proper position
					if ((col == 0 || col == 7) && (row == 0 || row == 7)) {
						if (row == 0) { // sets type of piece, value, black/white, and position
							board[row][col].setPiece(new Rook("Rook", 5, true));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\white_rook.png")));

						} else if (row == 7) {
							board[row][col].setPiece(new Rook("Rook", 5, false));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\black_rook.png")));

						} // else
					} // Rook

					// Sets Knights to proper position
					if ((col == 1 || col == 6) && (row == 0 || row == 7)) {
						if (row == 0) { // sets type of piece, value, black/white, and position
							board[row][col].setPiece(new Knight("Knight", 3, true));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\white_knight.png")));

						} else if (row == 7) {
							board[row][col].setPiece(new Knight("Knight", 3, false));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageVIew
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\black_knight.png")));

						} // else
					} // Knights

					// Sets Bishops to proper position
					if ((col == 2 || col == 5) && (row == 0 || row == 7)) {
						if (row == 0) { // sets type of piece, value, black/white, and position
							board[row][col].setPiece(new Bishop("Bishop", 3, true));
							board[row][col].getPiece().setPos(row, col);
							// adds image to imageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\white_bishop.png")));
						} else if (row == 7) {
							board[row][col].setPiece(new Bishop("Bishop", 3, false));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageVIew
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\black_bishop.png")));
						} // else
					} // Bishop

					// Sets Kings to proper position
					if ((col == 3) && (row == 0 || row == 7)) {
						if (row == 0) { // sets type of piece, value, black/white, and position
							board[row][col].setPiece(new King("King", 0, true));
							board[row][col].getPiece().setPos(row, col);
							// adds image to imageVIew
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\white_king.png")));
						} else if (row == 7) {
							board[row][col].setPiece(new King("King", 0, false));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\black_king.png")));
						} // else
					} // King

					// Sets Queens to proper position
					if ((col == 4) && (row == 0 || row == 7)) {
						if (row == 0) { // sets type of piece, value, black/white, and position
							board[row][col].setPiece(new Queen("Queen", 9, true));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\white_queen.png")));
						} else if (row == 7) {
							board[row][col].setPiece(new Queen("Queen", 9, false));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\black_queen.png")));
						} // else
					} // Queen

					// Sets Pawns to proper initial position
					if (row == 1 || row == 6) {
						if (row == 1) {
							board[row][col].setPiece(new Pawn("Pawn", 1, true));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageVIew
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\white_pawn.png")));
						} else if (row == 6) {
							board[row][col].setPiece(new Pawn("Pawn", 1, false));
							board[row][col].getPiece().setPos(row, col);
							// adds image to ImageView
							boardView[row][col] = new ImageView(
									new Image(new FileInputStream("C:util\\black_pawn.png")));
						} // else
					} // Pawns

				} // row
			} // col
		} catch (FileNotFoundException fne) {
			System.out.println("FILE NOT FOUND - IMAGE");
		} //catch
		
		// fills spots in image view with empty ImageViews
		for (int row = 2; row < 6; row++) {
			for (int col = 0; col < 8; col++) {
				board[row][col].setPiece(new Blank("Blank", 0, true));
				board[row][col].getPiece().setPos(row, col);
				//creates a transparent image
				try {
					ImageView iv = new ImageView(
							new Image(
									new FileInputStream("C:util\\blank.png"), 80, 80, false, false));
					iv.setOpacity(0.0);
					iv.setFitHeight(60);
					iv.setFitWidth(60);
					boardView[row][col] = iv;
				} catch (FileNotFoundException fne) {
					System.out.println("FILE NOT FOUND");
				} //catch
				
			} // col
		} // row

		return board;

	} // genBoard

	/**
	 * Returns the {@code ImageView[][]} representing the board visually.
	 * 
	 * @return ImageView[][] of the board images.
	 */
	public ImageView[][] getBoardView() {
		return boardView;
	} // getBoardView



} // board
