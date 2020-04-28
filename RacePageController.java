package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class RacePageController {
	@FXML
	private SplitPane mainPane2;
	

    @FXML
    private TextArea DragonBornText;

    @FXML
    private TextArea DwarfText;

    @FXML
    private TextArea ElfText;

    @FXML
    private TextArea GnomeText;

    @FXML
    private TextArea HalfElfText;

    @FXML
    private TextArea HalfOrcText;

    @FXML
    private TextArea HalflingText;

    @FXML
    private TextArea HumanText;

    @FXML
    private TextArea TieflingText;


    @FXML
    void DragonbornConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void DwarfConfim(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void ElfConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void GnomeConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HalfElfConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HalfOrcConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HalflingConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HumanConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }
    
    @FXML
    void TieflingConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void ProficiencyMenu(ActionEvent event) {

    }

    @FXML
    void RaceMenu(ActionEvent event) {

    }

    @FXML
    void ReviewMenu(ActionEvent event)  {

    }

    @FXML
    void SpellsMenu(ActionEvent event) {

    }

    @FXML
    void ClassMenu(ActionEvent event) {

    }
    
    
    void switchPage(ActionEvent event, String nextPageFXML) throws IOException {
 	   mainPane2 = FXMLLoader.load(getClass().getResource(nextPageFXML));// pane you are GOING TO
        Scene scene = new Scene(mainPane2,800,600);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
 		window.setTitle("D&D 5E Character Builder - Class");
 		window.setScene(scene);
 		window.setResizable(false);
 		window.show();
    }

}
