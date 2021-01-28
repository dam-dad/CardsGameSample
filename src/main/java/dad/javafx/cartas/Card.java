package dad.javafx.cartas;

import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;

public class Card extends ToggleButton {
	
	public Card(String imagePath) {
		super();
		setGraphic(new ImageView("/cards/" + imagePath));
	}

}
