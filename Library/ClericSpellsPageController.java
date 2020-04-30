package Library;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ClericSpellsPageController {

	@FXML
	private SplitPane mainPane2;
	
	int numSelections = 0; 
	
    @FXML
    private TextArea GuidanceText;

    @FXML
    private TextArea LightText;

    @FXML
    private TextArea MendingText;

    @FXML
    private TextArea ResistanceText;

    @FXML
    private TextArea SacredFlamesText;

    @FXML
    private TextArea SpareDyingText;

    @FXML
    private TextArea ThaumaturgyText;

    @FXML
    void GuidanceConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Guidance", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "ClericMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void LightConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Light", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "ClericMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void MendingConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Mending", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "ClericMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void ResistanceConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Resistance", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "ClericMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void SacredFlamesConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Sacred Flame", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "ClericMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void SpareDyingConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Spare The Dying", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "ClericMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void ThaumaturgyConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Thaumaturgy", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "ClericMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void ClassMenu(ActionEvent event) {

    }
    
    @FXML
    void ProficiencyMenu(ActionEvent event) {

    }
    
    @FXML 
    void RaceMenu(ActionEvent event) {
    	
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
   		window.setTitle("D&D 5E Character Builder - Spells");
   		window.setScene(scene);
   		window.setResizable(false);
   		window.show();
      }

}
