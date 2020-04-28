package application;

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
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void AcidStreamConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void AlarmConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void BurningHandsConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void CatapultConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void CharmPersonConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void ColorSprayConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void ComprehendLanguageConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void DetectMagicConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void DisguiseSelfConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void EarthTremorConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void ExpeditiousRetreatConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void FalseLifeConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void FeatherFallConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void FloatingDiskConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void FogCloudConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void HideousLaughterConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void IceKnifeConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void IdentifyConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void IllusoryScriptConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void JumpConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void LongStriderConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void MageArmorConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void MagicMissleConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }
    
    @FXML
    void ProtectionEvilGoodConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }
    
    @FXML
    void RayFrostConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void ShieldConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }
    
    @FXML
    void SilentImageConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void SleepConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void ThunderwaveConfirm(ActionEvent event) throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
    		switchPage(event, "ReviewPage.fxml");
    	}
    }

    @FXML
    void UnseenServantConfirm(ActionEvent event)throws IOException {
    	numSelections++;
    	if(numSelections>=6) {
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
