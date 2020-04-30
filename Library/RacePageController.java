package Library;


import java.io.IOException;

import MainPackage.*;
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
    	Main.character.setRaceName("Dragonborn");
    	Main.character.setRaceChoice("Dragonborn");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    	
    }

    @FXML
    void DwarfConfim(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Dwarf");
    	Main.character.setRaceChoice("Dwarf");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void ElfConfirm(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Elf");
    	Main.character.setRaceChoice("Elf");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void GnomeConfirm(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Gnome");
    	Main.character.setRaceChoice("Gnome");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HalfElfConfirm(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Half Elf");
    	Main.character.setRaceChoice("Half Elf");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HalfOrcConfirm(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Half Orc");
    	Main.character.setRaceChoice("Half Orc");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HalflingConfirm(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Halfling");
    	Main.character.setRaceChoice("Halfling");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    }

    @FXML
    void HumanConfirm(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Human");
    	Main.character.setRaceChoice("Human");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
    	switchPage(event, "ClassPage.fxml");
    }
    
    @FXML
    void TieflingConfirm(ActionEvent event) throws IOException {
    	Main.character.setRaceName("Tiefling");
    	Main.character.setRaceChoice("Tiefling");
    	Main.character.addRaceinfo();
    	Main.character.abilityModifiers();
    	Main.character.setLevel(1);
    	Main.character.setSkills();
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
