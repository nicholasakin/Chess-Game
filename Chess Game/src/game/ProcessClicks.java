package game;

import javafx.scene.image.ImageView;

/**
 * This class is responsible for setting up click listeners for the {@code Pieces} on the board.
 * Each piece has an image view associated with the image that registers the click.
 * Each empty space has a transparent piece for registering the click on empty spaces.
 * @author nicho
 *
 */
public class ProcessClicks {


	
	public static ImageView[][] setUpClicks(ImageView[][] iv) {
		iv = row0(iv);
		iv = row1(iv);
		iv = row2(iv);
		iv = row3(iv);
		iv = row4(iv);
		iv = row5(iv);
		iv = row6(iv);
		iv = row7(iv);
		
		return iv;
	}
	
	private static ImageView[][] row0(ImageView[][] iv) {
	

		iv[0][0].setOnMouseClicked(e -> {
			Game.checkClicks(0, 0);
		});
		iv[0][1].setOnMouseClicked(e -> {
			Game.checkClicks(0, 1);
		});
		iv[0][2].setOnMouseClicked(e -> {
			Game.checkClicks(0, 2);
		});
		iv[0][3].setOnMouseClicked(e -> {
			Game.checkClicks(0, 3);
		});
		iv[0][4].setOnMouseClicked(e -> {
			Game.checkClicks(0, 4);
		});
		iv[0][5].setOnMouseClicked(e -> {
			Game.checkClicks(0, 5);
		});
		iv[0][6].setOnMouseClicked(e -> {
			Game.checkClicks(0, 6);
		});
		iv[0][7].setOnMouseClicked(e -> {
			Game.checkClicks(0, 7);
		});
		return iv;
	} //row0
	
	private static ImageView[][] row1(ImageView[][] iv) {
		iv[1][0].setOnMouseClicked(e -> {
			Game.checkClicks(1, 0);
		});
		iv[1][1].setOnMouseClicked(e -> {
			Game.checkClicks(1, 1);
		});
		iv[1][2].setOnMouseClicked(e -> {
			Game.checkClicks(1, 2);
		});
		iv[1][3].setOnMouseClicked(e -> {
			Game.checkClicks(1, 3);
		});
		iv[1][4].setOnMouseClicked(e -> {
			Game.checkClicks(1, 4);
		});
		iv[1][5].setOnMouseClicked(e -> {
			Game.checkClicks(1, 5);
		});
		iv[1][6].setOnMouseClicked(e -> {
			Game.checkClicks(1, 6);
		});
		iv[1][7].setOnMouseClicked(e -> {
			Game.checkClicks(1, 7);
		});
		return iv;
	} //row1
	
	private static ImageView[][] row2(ImageView[][] iv) {
		iv[2][0].setOnMouseClicked(e -> {
			Game.checkClicks(2, 0);
		});
		iv[2][1].setOnMouseClicked(e -> {
			Game.checkClicks(2, 1);
		});
		iv[2][2].setOnMouseClicked(e -> {
			Game.checkClicks(2, 2);
		});
		iv[2][3].setOnMouseClicked(e -> {
			Game.checkClicks(2, 3);
		});
		iv[2][4].setOnMouseClicked(e -> {
			Game.checkClicks(2, 4);
		});
		iv[2][5].setOnMouseClicked(e -> {
			Game.checkClicks(2, 5);
		});
		iv[2][6].setOnMouseClicked(e -> {
			Game.checkClicks(2, 6);
		});
		iv[2][7].setOnMouseClicked(e -> {
			Game.checkClicks(2, 7);
		});
		return iv;
	} //row2
	
	private static ImageView[][] row3(ImageView[][] iv) {
		iv[3][0].setOnMouseClicked(e -> {
			Game.checkClicks(3, 0);
		});
		iv[3][1].setOnMouseClicked(e -> {
			Game.checkClicks(3, 1);
		});
		iv[3][2].setOnMouseClicked(e -> {
			Game.checkClicks(3, 2);
		});
		iv[3][3].setOnMouseClicked(e -> {
			Game.checkClicks(3, 3);
		});
		iv[3][4].setOnMouseClicked(e -> {
			Game.checkClicks(3, 4);
		});
		iv[3][5].setOnMouseClicked(e -> {
			Game.checkClicks(3, 5);
		});
		iv[3][6].setOnMouseClicked(e -> {
			Game.checkClicks(3, 6);
		});
		iv[3][7].setOnMouseClicked(e -> {
			Game.checkClicks(3, 7);
		});
		return iv;
	} //row3
	
	private static ImageView[][] row4(ImageView[][] iv) {
		iv[4][0].setOnMouseClicked(e -> {
			Game.checkClicks(4, 0);
		});
		iv[4][1].setOnMouseClicked(e -> {
			Game.checkClicks(4, 1);
		});
		iv[4][2].setOnMouseClicked(e -> {
			Game.checkClicks(4, 2);
		});
		iv[4][3].setOnMouseClicked(e -> {
			Game.checkClicks(4, 3);
		});
		iv[4][4].setOnMouseClicked(e -> {
			Game.checkClicks(4, 4);
		});
		iv[4][5].setOnMouseClicked(e -> {
			Game.checkClicks(4, 5);
		});
		iv[4][6].setOnMouseClicked(e -> {
			Game.checkClicks(4, 6);
		});
		iv[4][7].setOnMouseClicked(e -> {
			Game.checkClicks(4, 7);
		});
		return iv;
	} //row4
	
	private static ImageView[][] row5(ImageView[][] iv) {
		iv[5][0].setOnMouseClicked(e -> {
			Game.checkClicks(5, 0);
		});
		iv[5][1].setOnMouseClicked(e -> {
			Game.checkClicks(5, 1);
		});
		iv[5][2].setOnMouseClicked(e -> {
			Game.checkClicks(5, 2);
		});
		iv[5][3].setOnMouseClicked(e -> {
			Game.checkClicks(5, 3);
		});
		iv[5][4].setOnMouseClicked(e -> {
			Game.checkClicks(5, 4);
		});
		iv[5][5].setOnMouseClicked(e -> {
			Game.checkClicks(5, 5);
		});
		iv[5][6].setOnMouseClicked(e -> {
			Game.checkClicks(5, 6);
		});
		iv[5][7].setOnMouseClicked(e -> {
			Game.checkClicks(5, 7);
		});
		return iv;
	} //row5
	
	private static ImageView[][] row6(ImageView[][] iv) {
		iv[6][0].setOnMouseClicked(e -> {
			Game.checkClicks(6, 0);
		});
		iv[6][1].setOnMouseClicked(e -> {
			Game.checkClicks(6, 1);
		});
		iv[6][2].setOnMouseClicked(e -> {
			Game.checkClicks(6, 2);
		});
		iv[6][3].setOnMouseClicked(e -> {
			Game.checkClicks(6, 3);
		});
		iv[6][4].setOnMouseClicked(e -> {
			Game.checkClicks(6, 4);
		});
		iv[6][5].setOnMouseClicked(e -> {
			Game.checkClicks(6, 5);
		});
		iv[6][6].setOnMouseClicked(e -> {
			Game.checkClicks(6, 6);
		});
		iv[6][7].setOnMouseClicked(e -> {
			Game.checkClicks(6, 7);
		});
		return iv;
	} //row6
	
	private static ImageView[][] row7(ImageView[][] iv) {
		iv[7][0].setOnMouseClicked(e -> {
			Game.checkClicks(7, 0);
		});
		iv[7][1].setOnMouseClicked(e -> {
			Game.checkClicks(7, 1);
		});
		iv[7][2].setOnMouseClicked(e -> {
			Game.checkClicks(7, 2);
		});
		iv[7][3].setOnMouseClicked(e -> {
			Game.checkClicks(7, 3);
		});
		iv[7][4].setOnMouseClicked(e -> {
			Game.checkClicks(7, 4);
		});
		iv[7][5].setOnMouseClicked(e -> {
			Game.checkClicks(7, 5);
		});
		iv[7][6].setOnMouseClicked(e -> {
			Game.checkClicks(7, 6);
		});
		iv[7][7].setOnMouseClicked(e -> {
			Game.checkClicks(7, 7);
		});
		return iv;
	} //row7
	
} //Process Clicks
