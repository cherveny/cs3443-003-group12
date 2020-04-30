package Library;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class ReviewPageController implements Initializable{

	@FXML
    private TextArea ReviewText;
    


/*
 * 
 * 		Following Method deals with outputting all the calculated info into a text area
 * 
 * 
 * */


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Main.character.setPassiveWisdom(10 + Main.character.getWisdomMod());
		Main.character.setAC(Main.character.getArmor());
		Main.character.createHP();
		Main.character.setSavingThrows();
		Main.character.setInspiration(2);
		
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("                                                           C H A R A C T E R    I N F O\n");
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("Character Name: ");
		ReviewText.appendText(Main.character.getCharName());
		ReviewText.appendText("		Class : ");
		ReviewText.appendText(Main.character.getChosenClass());
		ReviewText.appendText("		Race : ");
		ReviewText.appendText(Main.character.getRaceName());
		ReviewText.appendText("		Level : ");
		ReviewText.appendText(String.valueOf(Main.character.getLevel()));
		ReviewText.appendText("		Alignment : ");
		ReviewText.appendText(Main.character.getAlignment());
		ReviewText.appendText("\nPlayerName : ");
		ReviewText.appendText(Main.character.getPlayerName());
		ReviewText.appendText("\n");
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("                                                                 B A S E     S T A T S\n");
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText(String.valueOf("Strength :	"+Main.character.getStrength()) + "		"+String.valueOf(Main.character.getStrengthMod())+"\n");
		ReviewText.appendText(String.valueOf("Intelligence :"+Main.character.getIntelligence())+"		"+String.valueOf(Main.character.getIntelligenceMod())+"\n");
		ReviewText.appendText(String.valueOf("Dexterity :	"+Main.character.getDexterity())+"		"+String.valueOf(Main.character.getDexterityMod())+"\n");
		ReviewText.appendText(String.valueOf("Wisdom :  	"+Main.character.getWisdom())+"		"+String.valueOf(Main.character.getWisdomMod())+"\n");
		ReviewText.appendText(String.valueOf("Constitution :"+Main.character.getConstituition())+"		"+String.valueOf(Main.character.getConstitutionMod())+"\n");
		ReviewText.appendText(String.valueOf("Charisma :	"+Main.character.getCharisma())+"		"+String.valueOf(Main.character.getCharismaMod())+"\n");
		
		
		
		
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("                                                                B A T T L E    S T A T S\n");
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("Passive Wisdom :	  "+String.valueOf(Main.character.getPassWisdom())+"\n");
		ReviewText.appendText("Inspiration :	  "+String.valueOf(Main.character.getInspiration())+"\n");
		ReviewText.appendText("Proficiency Bonus :"+String.valueOf(Main.character.getProfBonus())+"\n");
		ReviewText.appendText("AC :        		  "+String.valueOf(Main.character.getAC())+"\n");
		ReviewText.appendText("Speed :		      "+String.valueOf(Main.character.getSpeed())+"\n");
		ReviewText.appendText("Initiative :       "+String.valueOf(Main.character.getInitiative())+"\n");
		ReviewText.appendText("HP :	              "+String.valueOf(Main.character.getHP())+"\n");
		
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("                                                              S A V I N G   T H R O W S\n");
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("Stength :      "+String.valueOf(Main.character.getStrengthSave())+"\n");
		ReviewText.appendText("Dexterity :    "+String.valueOf(Main.character.getDexteritySave())+"\n");
		ReviewText.appendText("Constitution : "+String.valueOf(Main.character.getConstitutionSave())+"\n");
		ReviewText.appendText("Intelligence : "+String.valueOf(Main.character.getIntelligenceSave())+"\n");
		ReviewText.appendText("Wisdom :       "+String.valueOf(Main.character.getWisdomSave())+"\n");
		ReviewText.appendText("Charisma :     "+String.valueOf(Main.character.getCharismaSave())+"\n");
		
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("                                                              S K I L L S\n");
		ReviewText.appendText("*************************************************************************************************************************************************\n");
		ReviewText.appendText("Acrobatics :      "+String.valueOf(Main.character.getAcrobatics())+"\n");
		ReviewText.appendText("Animal Handeling :"+String.valueOf(Main.character.getAnimalHandling())+"\n");
		ReviewText.appendText("Arcana :          "+String.valueOf(Main.character.getArcana())+"\n");
		ReviewText.appendText("Atletics :        "+String.valueOf(Main.character.getAthletics())+"\n");
		ReviewText.appendText("Deception :       "+String.valueOf(Main.character.getDeception())+"\n");
		ReviewText.appendText("History :         "+String.valueOf(Main.character.getHistory())+"\n");
		ReviewText.appendText("Insight :         "+String.valueOf(Main.character.getInsight())+"\n");
		ReviewText.appendText("Intimidation :    "+String.valueOf(Main.character.getIntimidation())+"\n");
		ReviewText.appendText("Investigation :   "+String.valueOf(Main.character.getInvestigation())+"\n");
		ReviewText.appendText("Medicine :        "+String.valueOf(Main.character.getMedicine())+"\n");
		ReviewText.appendText("Nature :          "+String.valueOf(Main.character.getNature())+"\n");
		ReviewText.appendText("Perception :      "+String.valueOf(Main.character.getPerception())+"\n");
		ReviewText.appendText("Performance :     "+String.valueOf(Main.character.getPerformance())+"\n");
		ReviewText.appendText("Persuasion :      "+String.valueOf(Main.character.getPersuasion())+"\n");
		ReviewText.appendText("Religion :        "+String.valueOf(Main.character.getReligion())+"\n");
		ReviewText.appendText("Sleight of Hand : "+String.valueOf(Main.character.getSleightOfHands())+"\n");
		ReviewText.appendText("Stealth :         "+String.valueOf(Main.character.getStealth())+"\n");
		ReviewText.appendText("Survival :        "+String.valueOf(Main.character.getSurvival())+"\n");
		
		if ( Main.character.getSpellList().size() > 0){
			ReviewText.appendText("*************************************************************************************************************************************************\n");
			ReviewText.appendText("                                                              C A N T R I P S \n");
			ReviewText.appendText("*************************************************************************************************************************************************\n");
		}
		for (int i = 0; i < Main.character.getSpellList().size(); i++){
			if (Main.character.getSpellList().get(i).getLevel() == 0){
				ReviewText.appendText(Main.character.getSpellList().get(i).getDescription()+"\n\n");
			
			}
		}
		if ( Main.character.getSpellList().size() > 0){
			ReviewText.appendText("*************************************************************************************************************************************************\n");
			ReviewText.appendText("                                                              L E V E L   1   S P E L L S \n");
			ReviewText.appendText("*************************************************************************************************************************************************\n");
			}
		
		for (int i = 0; i < Main.character.getSpellList().size(); i++){
			if (Main.character.getSpellList().get(i).getLevel() == 1){
				ReviewText.appendText(Main.character.getSpellList().get(i).getDescription()+"\n\n");
			
			}
		}

	}
}
