package de.ostfale.javafx;

import de.ostfale.javafx.app.MainHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    private final Logger log = LoggerFactory.getLogger(MainApp.class);

    @Override
    public void start(Stage primaryStage) throws Exception {
        log.info("Start Application...");
        MainHandler mainHandler = new MainHandler();
        Scene scene = new Scene(mainHandler.getUiRoot(), 1100, 700);
        scene.getStylesheets().add("/css/style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
