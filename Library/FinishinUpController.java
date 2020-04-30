package Library;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FinishinUpController implements Initializable{

	@FXML
    private AnchorPane mainPane2;
	
    @FXML
    private TextField PlayerText;

    @FXML
    private ChoiceBox<String> ArmorChoice;

    @FXML
    private TextField CharacterText;

    @FXML
    private ChoiceBox<String> AlignmentChoice;
    
    

    @FXML
    void finish(ActionEvent event) throws IOException {
    	Main.character.setPlayerName(PlayerText.getText());
    	Main.character.setCharName(CharacterText.getText());
    	Main.character.setArmor(ArmorChoice.getValue());
    	Main.character.setAlignment(AlignmentChoice.getValue());
    	switchPage(event, "ReviewPage.fxml");
    }
    
    @FXML
    void fillChoices(){
    	
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if (Main.character.getChosenClass().contains("Barbarian")){
    		for ( int i = 0; i < Main.barbarianArmor.length ; i++){
    			ArmorChoice.getItems().add(Main.barbarianArmor[i]);
    		}
    	}
    	else if (Main.character.getChosenClass().contains("Cleric")){
    		for ( int i = 0; i < Main.clericArmor.length ; i++){
    			ArmorChoice.getItems().add(Main.clericArmor[i]);
    		}
    	}
    	else if (Main.character.getChosenClass().contains("Fighter")){
    		for ( int i = 0; i < Main.fighterArmor.length ; i++){
    			ArmorChoice.getItems().add(Main.fighterArmor[i]);
    		}
    	}
    	else if (Main.character.getChosenClass().contains("Rogue")){
    		for ( int i = 0; i < Main.rogueArmor.length ; i++){
    			ArmorChoice.getItems().add(Main.rogueArmor[i]);
    		}
    	}
    	else if (Main.character.getChosenClass().contains("Wizard")){
    		for ( int i = 0; i < Main.wizardArmor.length ; i++){
    			ArmorChoice.getItems().add(Main.wizardArmor[i]);
    		}
    	}
    	AlignmentChoice.getItems().add("Lawful Good");
    	AlignmentChoice.getItems().add("Neutral Good");
    	AlignmentChoice.getItems().add("Chaotic Good");
    	AlignmentChoice.getItems().add("Lawful Neutral");
    	AlignmentChoice.getItems().add("Neutral");
    	AlignmentChoice.getItems().add("Chaotic Neutral");
    	AlignmentChoice.getItems().add("Lawful Evil");
    	AlignmentChoice.getItems().add("Neutral Evil");
    	AlignmentChoice.getItems().add("Chaotic Evil");
		
	}

}
