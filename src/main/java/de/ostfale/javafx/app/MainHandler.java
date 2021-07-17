package de.ostfale.javafx.app;

import de.ostfale.javafx.common.BaseHandler;
import javafx.scene.layout.BorderPane;

public class MainHandler extends BaseHandler<MainController, BorderPane> {

    private static final String FXML_PATH = "fxml/main.fxml";

    public MainHandler() {
        initHandler();
    }

    @Override
    protected String getFXMLPath() {
        return FXML_PATH;
    }
}
