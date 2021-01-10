package game;

/**
 * This class represents an instance of the {@code Chess Board}.
 * It is used to generate the pieces in the correct positions of the board.
 * @author Nicky Akin
 *
 */
public class Board {
	Space[][] board;
	
	public Board(Space[][] board) {
		this.board = board;
	} //constructor
	
	public Space[][] genBoard() {
		//loops column by column instantiating pieces of board
		
		for (int col = 0; col < 8; col++) {
			for (int row = 0; row < 8; row++) {
				
				//instantiates pieces column by column
				
				//Sets Rooks to proper position
				if ( (col == 0 || col == 7) &&
					 (row == 0 || row == 7)) {
					if (row == 0) { //sets type of piece, value, black/white, and position
						board[row][col].setPiece(new Rook("Rook", 5, true));
						board[row][col].getPiece().setPos(row,  col);
					} else if (row == 7) {
						board[row][col].setPiece(new Rook("Rook", 5, false));
						board[row][col].getPiece().setPos(row,  col);
					} //else
				} //Rook
				
				//Sets Knights to proper position
				if ( (col == 1 || col == 6) &&
					 (row == 0 || row == 7) ) {
					if (row == 0 ) { //sets type of piece, value, black/white, and position
						board[row][col].setPiece(new Knight("Knight", 3, true));
						board[row][col].getPiece().setPos(row,  col);
					} else if (row == 7) {
						board[row][col].setPiece(new Knight("Knight", 3, false));
						board[row][col].getPiece().setPos(row,  col);
					} //else
				} //Knights
				
				//Sets Bishops to proper position
				if ( (col == 2 || col == 5) &&
					 (row == 0 || row == 7) ) {
					if (row == 0 ) { //sets type of piece, value, black/white, and position
						board[row][col].setPiece(new Bishop("Bishop", 3, true));
						board[row][col].getPiece().setPos(row,  col);
					} else if (row == 7) {
						board[row][col].setPiece(new Bishop("Bishop", 3, false));
						board[row][col].getPiece().setPos(row,  col);
					} //else
				} //Bishop
				
				//Sets Kings to proper position
				if ( (col == 3) &&
					 (row == 0 || row == 7) ) {
					if (row == 0 ) { //sets type of piece, value, black/white, and position
						board[row][col].setPiece(new King("King", 0, true));
						board[row][col].getPiece().setPos(row,  col);
					} else if (row == 7) {
						board[row][col].setPiece(new King("King", 0, false));
						board[row][col].getPiece().setPos(row,  col);
					} //else
				} //King
				
				//Sets Queens to proper position
				if ( (col == 4) &&
					 (row == 0 || row == 7) ) {
					if (row == 0 ) { //sets type of piece, value, black/white, and position
						board[row][col].setPiece(new Queen("Queen", 9, true));
						board[row][col].getPiece().setPos(row,  col);
					} else if (row == 7) {
						board[row][col].setPiece(new Queen("Queen", 9, false));
						board[row][col].getPiece().setPos(row,  col);
					} //else
				} //Queen
				
				//Sets Pawns to proper initial position
				if (row == 1 || row == 6) {
					if (row == 1) {
						board[row][col].setPiece(new Pawn("Pawn", 1, true));
						board[row][col].getPiece().setPos(row,  col);
					} else if (row == 6) {
						board[row][col].setPiece(new Pawn("Pawn", 1, false));
						board[row][col].getPiece().setPos(row,  col);
					} //else
				} //Pawns
				
			} //row
		} //col
		
		return board;
		
	} //genBoard
	
} //board
