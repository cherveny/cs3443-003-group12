package Library;


	
import MainPackage.Cantrip;
import MainPackage.Character;
import MainPackage.CharacterClass;
import MainPackage.Dragonborn;
import MainPackage.Dwarf;
import MainPackage.Elf;
import MainPackage.Gnome;
import MainPackage.HalfElf;
import MainPackage.HalfOrc;
import MainPackage.Halfling;
import MainPackage.Human;
import MainPackage.SpellFirst;
import MainPackage.Tiefling;
import MainPackage.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	//initializing instance of each race to grab infor from the later in code
	public static Character character = new Character();
	public static Dragonborn db = new Dragonborn();
	public static Dwarf df = new Dwarf();
	public static Elf elf = new Elf();
	public static Gnome gn = new Gnome();
	public static HalfElf hf = new HalfElf();
	public static Halfling halfling = new Halfling();
	public static HalfOrc ho = new HalfOrc();
	public static Human hu = new Human();
	public static Tiefling tf = new Tiefling();
	
	//initializing character to hold all character variables in the program  plus initializing array of armor choice for each class
	public static CharacterClass cc = new CharacterClass();
	public static String[] clericArmor = {"Padded", "Leather", "Studded Leather", "Hide", "Chain Shirt","Scale Mail", "Breastplate","Half Plate"};
	public static String[] barbarianArmor = {"Padded", "Leather", "Studded Leather", "Hide", "Chain Shirt","Scale Mail", "Breastplate","Half Plate"};
	public static String[] fighterArmor = {"Padded", "Leather", "Studded Leather", "Hide", "Chain Shirt","Scale Mail", "Breastplate","Half Plate", "Ring Mail", "Chain Mail", "Splint", "Plate"};
	public static String[] rogueArmor = {"Padded", "Leather", "Studded Leather"};
	public static String[] wizardArmor = {"Padded", "Leather", "Studded Leather"};
	@Override
	public void start(Stage primaryStage) {
		
		Cantrip.fillList();
		SpellFirst.fillList();
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("HomePageNoCharacters.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("D&D 5E Character Builder - Main");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		character.setProfBonus(2);
		launch(args);
	}
}


