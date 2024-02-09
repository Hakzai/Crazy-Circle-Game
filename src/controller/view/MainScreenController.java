package controller.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainScreenController extends ScreenController {
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbMainTitle;

    @FXML
    private Label lbPressStart;

    @FXML
    void initialize() {
        assert getLbMainTitle() != null : "fx:id=\"lbMainTitle\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert getLbPressStart() != null : "fx:id=\"lbPressStart\" was not injected: check your FXML file 'MainScreen.fxml'.";
        
        activeScreenInstance = this;
    }

    /**
     * @return the lbMainTitle
     */
    public Label getLbMainTitle() {
        return lbMainTitle;
    }

    /**
     * @param lbMainTitle the lbMainTitle to set
     */
    public void setLbMainTitle(Label lbMainTitle) {
        this.lbMainTitle = lbMainTitle;
    }

    /**
     * @return the lbPressStart
     */
    public Label getLbPressStart() {
        return lbPressStart;
    }

    /**
     * @param lbPressStart the lbPressStart to set
     */
    public void setLbPressStart(Label lbPressStart) {
        this.lbPressStart = lbPressStart;
    }
}
