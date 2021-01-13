package game;

/**
 * The {@code Piece} class represents a {@code Piece} on the chess board.
 * This class is the parent of the individual type of {@code Piece}.
 * The function of this class is for the inheritance of charactaristics
 * and movement of the {@code Piece}.
 * @author Nicky Akin
 *
 */
public abstract class Piece {
	
	private int value;
	private String name;
	private boolean isWhite;
	private int row;
	private int col;
	
	
	/**
	 * Constructs a piece object. A piece is a parent class to the specific piece type.
	 * The piece
	 * @param name
	 * @param value
	 * @param isWhite
	 */
	public Piece(String name, int value, boolean isWhite) {
		this.name = name;
		this.value = value;
		this.isWhite = isWhite;
	} //copy constructor
	
	/**
	 * Gets the name of the specified piece.
	 * @return name - String representing the name of the piece. 
	 */
	public String getName() {
		return name;
	} //getName
	
	/**
	 * Sets the name (type) of the piece.
	 * @param name - Specific name of the piece.
	 */
	public void setName(String name) {
		this.name = name;
	} //setName
	
	/**
	 * Gives the value of the specified piece
	 * @return value - Integer representing the value of the specified piece. 
	 */
	public int getValue() {
		return value;
	} //getValue
	
	
	/**
	 * Sets the value of the specified piece.
	 * @param value - Integer of value to represent. 
	 */
	public void setValue(int value) {
		this.value = value;
	} //sets the value of a piece
	
	/**
	 * Used to determine if the piece is white or black.
	 * @return true if white, false if black.
	 */
	public boolean isWhite() {
		return isWhite;
	} //getColor
	
	/**
	 * Used to set the color of the piece black or white.
	 * @param color true if white, black otherwise.
	 */
	public void setWhite(boolean color) {
		isWhite = color;
	} //setWhite
	
	/**
	 * Sets the coordinate of the piece on the board.
	 * These coordinates are used to determine piece movement
	 * @param row - row of the specified piece.
	 * @param col - column of the specified piece.
	 */
	public void setPos(int row, int col) {
		this.row = row;
		this.col = col;
	} //setPos
	
	/**
	 * Returns true or false whether the piece can move {@code North}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canNorth(Space[][] board, int numSpaces) {
		return false;
	} //canNorth
	
	/**
	 * Returns true or false whether the piece can move {@code South}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canSouth(Space[][] board, int numSpaces) {
		return false;
	} //canSouth
	
	/**
	 * Returns true or false whether the piece can move {@code East}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canEast(Space[][] board, int numSpaces) {
		return false;
	} //canEast
	
	/**
	 * Returns true or false whether the piece can move {@code West}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canWest(Space[][] board, int numSpaces) {
		return false;
	} //canWest
	
	
	/**
	 * Returns true or false whether the piece can move {@code NorthEast}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canNorthEast(Space[][] board, int numSpaces) {
		return false;
	} //canNorthEast
	
	/**
	 * Returns true or false whether the piece can move {@code NorthWest}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canNorthWest(Space[][] board, int numSpaces) {
		return false;
	} //canNorthWest
	
	/**
	 * Returns true or false whether the piece can move {@code SouthEast}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canSouthEast(Space[][] board, int numSpaces) {
		return false;
	} //canSouthEast
	
	/**
	 * Returns true or false whether the piece can move {@code SouthWest}.
	 * @param board - board that the piece is moving on.
	 * @param numSpaces - Number of spaces to move
	 * @return True/False indicating if the piece can make the specified move.
	 */
	public boolean canSouthWest(Space[][] board, int numSpaces) {
		return false;
	} //canSouthWest
	
	
} //class
