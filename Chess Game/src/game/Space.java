package game;

/**
 * The {@code Space} class represents a singular space on the board.
 * This class is used to set/remove the piece from the space.
 * @author Nicky Akin
 *
 */
public class Space {

	//instance variables
	private Piece piece;
	private boolean isWhite;
	
	/**
	 * Default initialization of the space to not contain a piece. 
	 */
	public Space() {
		piece = null;
	} //default constructor
	
	/**
	 * Returns the {@code Piece} that is on the calling {@code Space}.
	 * @return - {@code Piece} on the {@code Space}.
	 */
	public Piece getPiece() {
		return piece;
	} //getPiece
	
	/**
	 * Sets the {@code Piece} for the calling {@code Space}.
	 * @param piece
	 */
	public void setPiece(Piece piece) {
		this.piece = piece;
	} //setPiece
	
	/**
	 * Sets the {@code White} property of the {@code Space}.
	 * @return True if the {@code Space} is {@code White}, false if {@code Black}.
	 */
	public boolean isWhite() {
		return isWhite;
	} //isWhite
	
	/**
	 * Sets the {@code White} property of the {@code Space}.
	 * @param isWhite True if the space is to be {@code White}, false if {@code Black}.
	 */
	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	} //setColor
	
} //class
