package Library;


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

public class WizardSpellsPageController {
	@FXML
	private SplitPane mainPane2;
	
	int numSelections = 0;
	
    @FXML
    private TextArea AcidSplashText;

    @FXML
    private TextArea ChillTouchText;

    @FXML
    private TextArea ControlFlamesText;

    @FXML
    private TextArea CreateBonfireText;

    @FXML
    private TextArea DancingLightsText;

    @FXML
    private TextArea FireboltText;

    @FXML
    private TextArea FrostbiteText;

    @FXML
    private TextArea GustText;

    @FXML
    private TextArea LightText;

    @FXML
    private TextArea MagicHandsText;

    @FXML
    private TextArea MendingText;

    @FXML
    private TextArea MessageText;

    @FXML
    private TextArea MinorIllusionText;

    @FXML
    private TextArea MoldEarthText;

    @FXML
    private TextArea PosionSprayText;

    @FXML
    private TextArea ProstidigationText;

    @FXML
    private TextArea RayFrostText;

    @FXML
    private TextArea ShapeWaterText;

    @FXML
    private TextArea ShockingGraspText;

    @FXML
    private TextArea ThunderClapText;

    @FXML
    private TextArea TrueStrikeText;

    @FXML
    void AcidSplashConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Acid Splash", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void ChillTouchConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Chill Touch", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void ControlFlamesConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Control Flames", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void CreateBonfireConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Create Bonfire", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void DancingLightsConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Dancing Lights", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void FireboltConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Fire Bolt", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void FrostbiteConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Frostbite", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void GustConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Gust", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void LightConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Light", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void MagicHandsConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Mage Hand", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void MendingConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Mending", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void MessageConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Message", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void MinorIllusionConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Minor Illusion", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void MoldEarthConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Mold Earth", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void PoisonSprayConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Poison Spray", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }
    
    @FXML
    void ThunderClapConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Thunderclap", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void TrueStrikeConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("True Strike", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }
    
    @FXML
    void ShapeWaterConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Shape Water", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void ShockingGraspConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Shocking Grasp", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }
    
    @FXML
    void ProstidigationConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Prestidigitation", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }


    @FXML
    void RayFrostConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Ray of Frost", 0);
    	numSelections++;
    	if(numSelections>=3) {
    		switchPage(event, "WizardMoreSpellsPage.fxml");
    	}
    }

    @FXML
    void ReviewMenu(ActionEvent event) {

    }

    @FXML
    void SpellsMenu(ActionEvent event) {

    }
    
    @FXML
    void ProficiencyMenu(ActionEvent event) {

    }

    @FXML
    void RaceMenu(ActionEvent event) {

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
