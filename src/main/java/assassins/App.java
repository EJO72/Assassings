package assassins;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class App extends Application {

    static String results;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.CORNFLOWERBLUE);

        Image eagle = new Image("eagle.jpg");
        stage.getIcons().add(eagle);
        stage.setTitle("APHS Assassins 2024");
        stage.setWidth(600);
        stage.setHeight(800);
        stage.setResizable(true);
        stage.setY(50);
        stage.setX(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("PRESS E TO EXIT");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("e"));

        Text title = new Text();
        title.setText("APHS ASSASSINS 2024");
        title.setX(600);
        title.setY(100);
        title.setFont(Font.font("Impact", 50));
        title.setFill(Color.WHITE);

        Line tUnderLine = new Line();
        tUnderLine.setStartX(600);
        tUnderLine.setStartY(105);
        tUnderLine.setEndX(1040);
        tUnderLine.setEndY(105);
        tUnderLine.setStrokeWidth(3f);
        tUnderLine.setStroke(Color.WHITE);

        Image tImage = new Image("eagle.jpg");
        ImageView imageView1 = new ImageView(tImage);
        imageView1.setX(1050);
        imageView1.setY(50);
        imageView1.setFitHeight(60);
        imageView1.setFitWidth(60);

        ImageView imageView2 = new ImageView(tImage);
        imageView2.setX(530);
        imageView2.setY(50);
        imageView2.setFitHeight(60);
        imageView2.setFitWidth(60);

        Button generate = new Button("Generate:");
        generate.setLayoutX(530);
        generate.setLayoutY(120);
        generate.setFont(Font.font("Impact", 20));
        generate.setOnAction(e -> {
            Assassins game = new Assassins();
            game.Matchups();
            results = game.StringMatch();

            Text list = new Text(results);
            list.setFont(Font.font("Trebuchet MS", 20));
            list.setFill(Color.BLACK);
            list.setX(220);
            list.setY(180);

            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(list);
            scrollPane.setPrefSize(450, 800);
            scrollPane.setLayoutX(650);
            scrollPane.setLayoutY(120);

            if (results != "") {
                root.getChildren().remove(scrollPane);
            }
            root.getChildren().add(scrollPane);
        });

        Button copy = new Button("Copy");
        copy.setLayoutX(530);
        copy.setLayoutY(165);
        copy.setFont(Font.font("Impact", 20));
        copy.setOnAction(e -> {
            ClipboardContent listOfNames = new ClipboardContent();
            listOfNames.putString(results);
            Clipboard.getSystemClipboard().setContent(listOfNames);
        });

        root.getChildren().add(title);
        root.getChildren().add(tUnderLine);
        root.getChildren().add(imageView1);
        root.getChildren().add(imageView2);
        root.getChildren().add(generate);
        root.getChildren().add(copy);
        stage.setScene(scene);
        stage.show();
    }
}
