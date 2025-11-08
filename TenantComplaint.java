package rentalmanagement.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.animation.TranslateTransition;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;

public class TenantComplaint {

    @FXML Label unitNo;
    @FXML Label description;
    @FXML Label complaintDate;
    @FXML AnchorPane drawerPane;
    @FXML Button waterFilter;
    @FXML Button electricityFilter;
    @FXML Button damagesFilter;
    @FXML Button otherFilter;
    @FXML CheckBox checkBox;

    @FXML Button burger;
    private boolean drawerOpen = true;

    @FXML //for the side drawer
    private void toggleDrawer() {

        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.millis(300));
        slide.setNode(drawerPane);

        if (drawerOpen) {
            slide.setToX(-250);
            drawerOpen = false;
        } else {
            slide.setToX(0);
            drawerOpen = true;
        }
        slide.play();
    }

    @FXML
    public void initialize() {

        //navdrawer initialization
        drawerPane.setTranslateX(-350);
        drawerOpen = false;
    }

    @FXML
    private void tenantOverview (ActionEvent event) throws IOException {
        SceneManager.switchScene("OverviewOfTenants.fxml");
    }

    @FXML
    private void dashboard (ActionEvent event) throws IOException {
        SceneManager.switchScene("hello-view.fxml");
    }

    @FXML
    private void billingStatement (ActionEvent event) throws IOException {
        SceneManager.switchScene("BillingStatement.fxml");
    }




}
