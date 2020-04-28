package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ClericSkillsPageController {
	
	@FXML
	private AnchorPane mainPane2;
	
	int numSelections = 0;  

    @FXML
    void HistorySelection(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections==2) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void InsightSelection(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections==2) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void MedicineSelection(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections==2) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void PersuasionSelection(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections==2) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }
    
    @FXML
    void ReligionSelection(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections==2) {
    		switchPage(event, "ReviewPage.fxml");
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
  		window.setTitle("D&D 5E Character Builder - Spells");
  		window.setScene(scene);
  		window.setResizable(false);
  		window.show();
     }


}
