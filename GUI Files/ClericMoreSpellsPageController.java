package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ClericMoreSpellsPageController {

	@FXML
	private AnchorPane mainPane2;
	
	int numSelections = 0; 
	
    @FXML
    private TextArea BaneText;

    @FXML
    private TextArea BlessText;

    @FXML
    private TextArea CommandText;

    @FXML
    private TextArea CreateDestroyWaterText;

    @FXML
    private TextArea CureWoundsText;

    @FXML
    private TextArea DetectEvilGoodText;

    @FXML
    private TextArea DetectMagicText;

    @FXML
    private TextArea DetectPoisonDiseaseText;

    @FXML
    private TextArea GuidingBoltText;

    @FXML
    private TextArea HealingWordText;

    @FXML
    private TextArea InflictWoundsText;

    @FXML
    private TextArea ProtectionEvilGoodText;

    @FXML
    private TextArea PurifyFoodDrinkText;

    @FXML
    private TextArea SanctuaryText;

    @FXML
    private TextArea ShieldFaithText;

    @FXML
    void BaneConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void BlessConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void CommandConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void CreateDestroyWaterConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void CureWoundsConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void DetectEvilGoodConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void DetectMagicConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void DetectPoisonDiseaseConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void GuidingBoltConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void HealingWordConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void InflictWoundsConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void ProtectionEvilGoodConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void PurifyFoodDrinkConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void SanctuaryConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void ShieldFaithConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=1) {
    		switchPage(event, "ReviewPage.fxml");
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
