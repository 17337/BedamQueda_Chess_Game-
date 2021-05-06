package sample.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Board extends VBox {
    private GridPane board;
    //private BorderPane borderPane;
    private final Label[] numbersCoordinates;
    private final Label[] numbersCoordinates2;
    private Label[] lettersCoordinates;
    private Label[] lettersCoordinates2;

    /**
     * Constructor
     */
    public Board()
    {
        this.board = new GridPane();
        //this.borderPane = new BorderPane();
        this.lettersCoordinates = new Label[]{new Label("a"), new Label("b"),new Label("c"),
                new Label("d"), new Label("e"), new Label("f"), new Label("g"),
                new Label("h")};
        this.numbersCoordinates = new Label[]{new Label("8"), new Label("7"),new Label("6"),
                new Label("5"), new Label("4"), new Label("3"), new Label("2"),
                new Label("1")};
        this.lettersCoordinates2 = new Label[]{new Label("a"), new Label("b"),new Label("c"),
                new Label("d"), new Label("e"), new Label("f"), new Label("g"),
                new Label("h")};
        this.numbersCoordinates2 = new Label[]{new Label("8"), new Label("7"),new Label("6"),
                new Label("5"), new Label("4"), new Label("3"), new Label("2"),
                new Label("1")};
        this.setCoordinatesLabels();
        this.getChildren().addAll(this.board);
    }

    /**
     * Sets the coordinates labels around the game board // Define os rótulos de coordenadas à volta do tabuleiro de jogo
     */
    private void setCoordinatesLabels()
    {
        for (int i = 0; i < this.lettersCoordinates.length; i++)
        {
            this.lettersCoordinates[i].setPrefSize(70, 10);
            this.lettersCoordinates[i].setStyle("-fx-font-size: 15");
            this.lettersCoordinates[i].setAlignment(Pos.TOP_CENTER);
            this.lettersCoordinates2[i].setPrefSize(70, 10);
            this.lettersCoordinates2[i].setStyle("-fx-font-size: 15");
            this.lettersCoordinates2[i].setAlignment(Pos.BOTTOM_CENTER);
            this.numbersCoordinates2[i].setPrefSize(10, 70);
            this.numbersCoordinates2[i].setStyle("-fx-font-size: 15");
            this.numbersCoordinates2[i].setAlignment(Pos.CENTER_LEFT);
            this.numbersCoordinates[i].setPrefSize(10, 70);
            this.numbersCoordinates[i].setStyle("-fx-font-size: 15");
            this.numbersCoordinates[i].setAlignment(Pos.CENTER_RIGHT);

        }

        for (int i = 0; i < 8; i++)
        {
            this.board.add(this.lettersCoordinates[i], i + 1, 0);
            this.board.add(this.lettersCoordinates2[i], i + 1, 9);
            this.board.add(this.numbersCoordinates[i], 0, i + 1);
            this.board.add(this.numbersCoordinates2[i], 9, i + 1);
        }
    }


}