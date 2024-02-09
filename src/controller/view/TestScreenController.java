package controller.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class TestScreenController extends ScreenController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Circle blueCircle;

    @FXML
    void initialize() {
        assert getBlueCircle() != null : "fx:id=\"blueCircle\" was not injected: check your FXML file 'TestScreen.fxml'.";

        activeScreenInstance = this;
    }

    /**
     * @return the blueCircle
     */
    public Circle getBlueCircle() {
        return blueCircle;
    }

    /**
     * @param blueCircle the blueCircle to set
     */
    public void setBlueCircle(Circle blueCircle) {
        this.blueCircle = blueCircle;
    }
}
