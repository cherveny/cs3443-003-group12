package Library;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RogueSkillsPageController {
	@FXML
	private AnchorPane mainPane2;
	
	int numSelections = 0;

    @FXML
    void AcrobaticsSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Acrobatic");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void AthleticsSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Athletic");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void DeceptionSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Deception");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void InsightSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Insight");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void IntimidationSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Intimidation");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void InvestigationSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Investigation");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void PerceptionSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Perception");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void PerformanceSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Performance");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void PersuasionSelection(ActionEvent event)throws IOException {
    	Main.character.setSkills("Persuasion");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }
    
    @FXML
    void StealthSelection(ActionEvent event)throws IOException {
    	Main.character.setSkills("Stealth");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }
    
    @FXML
    void SleightHandSelection(ActionEvent event) throws IOException {
    	Main.character.setSkills("Sleight");
    	numSelections++;
    	if(numSelections==4) {
    		switchPage(event, "FinishingUp.fxml");
    	}
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

    @FXML
    void ClassMenu(ActionEvent event) {

    }
    
    void switchPage(ActionEvent event, String nextPageFXML) throws IOException {
  	   mainPane2 = FXMLLoader.load(getClass().getResource(nextPageFXML));// pane you are GOING TO
         Scene scene = new Scene(mainPane2,800,600);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
  		window.setTitle("D&D 5E Character Builder - Review");
  		window.setScene(scene);
  		window.setResizable(false);
  		window.show();
     }

}
