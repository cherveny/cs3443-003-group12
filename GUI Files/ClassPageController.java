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

public class ClassPageController {
	@FXML
	private SplitPane mainPane2;
	
    @FXML
    private TextArea BarbarianText;

    @FXML
    private TextArea FighterText;

    @FXML
    private TextArea ClericText;

    @FXML
    private TextArea WizardText;

    @FXML
    private TextArea RougeText;
    
    @FXML
    private TextArea ThiefText;

    @FXML
    void BarbarianConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "BarbarianSkillsPage.fxml");

    }

    @FXML
    void ClericConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "ClericSkillsPage.fxml");
    }
    
    @FXML
    void FighterConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "FighterSkillsPage.fxml");
    }

    @FXML
    void WizardConfirm(ActionEvent event) throws IOException {
    	switchPage(event, "WizardSkillsPage.fxml");
    }
    
    @FXML
    void RogueConfirm(ActionEvent event) throws IOException{
    	switchPage(event, "RogueSkillsPage.fxml");
    }

    @FXML
    void ProficiencyMenu(ActionEvent event) {

    }

    @FXML
    void RaceMenu(ActionEvent event) throws IOException {
    	switchPage(event, "RacePage.fxml");
    }

    @FXML
    void ReviewMenu(ActionEvent event) {

    }

    @FXML
    void SpellsMenu(ActionEvent event) {

    }

   void switchPage(ActionEvent event, String nextPageFXML) throws IOException {
	   mainPane2 = FXMLLoader.load(getClass().getResource(nextPageFXML));// pane you are GOING TO
       Scene scene = new Scene(mainPane2,800,600);// pane you are GOING TO show
       Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setTitle("D&D 5E Character Builder - Skills");
		window.setScene(scene);
		window.setResizable(false);
		window.show();
   }

}
