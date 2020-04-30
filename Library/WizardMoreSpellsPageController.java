package Library;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WizardMoreSpellsPageController {
	
	@FXML
	private AnchorPane mainPane2;
	
	int numSelections = 0;

    @FXML
    private TextArea AbsorbElementsText;

    @FXML
    private TextArea AcidStreamText;

    @FXML
    private TextArea AlarmText;

    @FXML
    private TextArea BurningHandsText;

    @FXML
    private TextArea CatapultText;

    @FXML
    private TextArea CharmPersonText;

    @FXML
    private TextArea ColorSprayText;

    @FXML
    private TextArea ComprehendLanguageText;

    @FXML
    private TextArea DetectMagicText;

    @FXML
    private TextArea DisguiseSelfText;

    @FXML
    private TextArea EarthTremorText;

    @FXML
    private TextArea ExpeditiousRetreatText;

    @FXML
    private TextArea FalseLifeText;

    @FXML
    private TextArea FeatherFallText;

    @FXML
    private TextArea FloatingDiskText;

    @FXML
    private TextArea FogCloudText;

    @FXML
    private TextArea Grease;

    @FXML
    private TextArea HideousLaughterText;

    @FXML
    private TextArea IceKnifeText;

    @FXML
    private TextArea IdentifyText;

    @FXML
    private TextArea IllusoryScriptText;

    @FXML
    private TextArea JumpText;

    @FXML
    private TextArea LongStriderText;

    @FXML
    private TextArea MageArmorConfirm;

    @FXML
    private TextArea MagicMissleText;

    @FXML
    private TextArea ProtectionEvilGoodText;

    @FXML
    private TextArea ShieldText;

    @FXML
    private TextArea SilentImageText;

    @FXML
    private TextArea SleepText;

    @FXML
    private TextArea ThunderwaveText;

    @FXML
    private TextArea UnseenServantText;

    @FXML
    void AbsorbElementsConfirm(ActionEvent event)  throws IOException {
    	Main.character.addSpell("Absorb Elements", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void AcidStreamConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Acid Stream", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void AlarmConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Alarm", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void BurningHandsConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Burning Hands", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void CatapultConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Catapult", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void CharmPersonConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Charm Person", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void ColorSprayConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Color Spray", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void ComprehendLanguageConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Comprehend Language", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void DetectMagicConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Detect Magic", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void DisguiseSelfConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Prestidigitation", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void EarthTremorConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Earth Tremor", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void ExpeditiousRetreatConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Expeditious Retreat", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void FalseLifeConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("False Life", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void FeatherFallConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Feather Fall", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void FloatingDiskConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Floating Disk", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void FogCloudConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Fog Cloud", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void HideousLaughterConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Hideous Laughter", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void IceKnifeConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Ice Knife", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void IdentifyConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Identify", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void IllusoryScriptConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Illusory Script", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void JumpConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Jump", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void LongStriderConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Longstrider", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void MageArmorConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Mage Armor", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void MagicMissleConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Magic Missile", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }
    
    @FXML
    void ProtectionEvilGoodConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Protection from Evil and Good", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }
    
    @FXML
    void RayFrostConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Ray of Frost", 0);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void ShieldConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Shield", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }
    
    @FXML
    void SilentImageConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Silent Image", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void SleepConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Sleep", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void ThunderwaveConfirm(ActionEvent event) throws IOException {
    	Main.character.addSpell("Thunderwave", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
    	}
    }

    @FXML
    void UnseenServantConfirm(ActionEvent event)throws IOException {
    	Main.character.addSpell("Unseen Servant", 1);
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "FinishingUp.fxml");
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
