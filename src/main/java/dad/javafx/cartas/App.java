package dad.javafx.cartas;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class App extends Application {
	
	private static final String [] CARD_IMAGES = {
			"aceofcups.png", 
			"aceofpents.png", 
			"aceofswords.png", 
			"aceofwands.png",
			"castle.png",
			"chariot.png", 
			"death.png",
			"devil.png", 
			"eightofcups.png", 
			"eightofpents.png", 
			"eightofswords.png", 
			"eightofwands.png", 
			"Emperor.png",
			"Empress.png", 
			"fiveofcups.png", 
			"fiveofpents.png", 
			"fiveofswords.png", 
			"fiveofwands.png",
			"fool.png",
			"fourofcups.png", 
			"fourofpents.png", 
			"fourofswords.png", 
			"fourofwands.png", 
			"hangedman.png",
			"hermit.png",
	};
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		int width = 8;
		int height = 3;

		ColumnConstraints [] cc = new ColumnConstraints[width];
		for (int i = 0; i < width; i++) {
			cc[i] = new ColumnConstraints();
			cc[i].setHgrow(Priority.ALWAYS);
			cc[i].setHalignment(HPos.CENTER);
		}
		
		RowConstraints [] rc = new RowConstraints[height];
		for (int i = 0; i < height; i++) {
			rc[i] = new RowConstraints();
			rc[i].setVgrow(Priority.ALWAYS);
			rc[i].setValignment(VPos.CENTER);
		}
		
		GridPane cardBoard = new GridPane();		
		cardBoard.getColumnConstraints().setAll(cc);
		cardBoard.getRowConstraints().setAll(rc);

		List<Card> cards = new ArrayList<>();
		for (int i = 0; i < width * height; i++) {
			Card card = new Card(CARD_IMAGES[i]);
//			card.setText("Card" + i);
			cards.add(card);
			System.out.println(i % width + "," + i / width);
			cardBoard.add(card, i % width, i / width);
		}

		primaryStage.setTitle("Cartas");
		primaryStage.setScene(new Scene(cardBoard));
		primaryStage.show();
	
	}

	public static void main(String[] args) {
		launch(args);
	}

}
