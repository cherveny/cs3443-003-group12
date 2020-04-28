/**********
 *  This class is meant for running all the methods for grabbing the data
 *  for the characters already created and loading the data for all the build info
 *  into the program at start up
 *  
 * @author 
 *
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StartUp {
	static int totalCharacters;
	
	static ArrayList<Character> characterList= new ArrayList<Character>();
	static File f = new File("C:\\Users\\Mazen\\eclipse-workspace\\ApplicationDevelopmentProject\\src\\SavedCharacters.txt");
	
	
	
	public static void saveCaharacters() {
		BufferedWriter outputWriter = null;
		  try {
			outputWriter = new BufferedWriter(new FileWriter(f));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			  totalCharacters = characterList.size();
			outputWriter.write( String.valueOf(totalCharacters));
			outputWriter.newLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  for (int i = 0; i < characterList.size(); i++) {
		    
		    
		    try {
				outputWriter.write( String.valueOf(characterList.get(i).getStrength()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getDexterity()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getConstituition()));
				outputWriter.newLine();
				outputWriter.write(String.valueOf( characterList.get(i).getIntelligence()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getWisdom()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getCharisma()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getAcrobatics()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getAnimalHandling()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getArcana()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getAthletics()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getDeception()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getHistory()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getInsight()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getIntimidation()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getInvestigation()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getMedicine()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getNature()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getPerception()));
				outputWriter.newLine();
				outputWriter.write(String.valueOf( characterList.get(i).getPerformance()));
				outputWriter.newLine();
				outputWriter.write(String.valueOf( characterList.get(i).getPersuasion()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getReligion()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getSleightOfHands()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getStealth()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getSurvival()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getHP()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getCurHP()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getTempHP()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getSpeed()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getAC()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getInitiative()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getPassWisdom()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getInspiration()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getProfBonus()));
				outputWriter.newLine();
				outputWriter.write( characterList.get(i).getPlayerName());
				outputWriter.newLine();
				outputWriter.write( characterList.get(i).getAlignment());
				outputWriter.newLine();
				outputWriter.write( characterList.get(i).getCharName());
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getLevel()));
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getRaceChoice()));
				outputWriter.newLine();
				outputWriter.write( characterList.get(i).getChosenClass());
				outputWriter.newLine();
				outputWriter.write( characterList.get(i).getArmor());
				outputWriter.newLine();
				outputWriter.write( String.valueOf(characterList.get(i).getSpellList().size()));
				outputWriter.newLine();
				for (int j = 0 ; j < characterList.get(i).getSpellList().size(); j++) {
					outputWriter.write( characterList.get(i).getSpellList().get(j).getName());
					outputWriter.newLine();
					outputWriter.write(String.valueOf( characterList.get(i).getSpellList().get(j).getLevel()));
					outputWriter.newLine();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    
		  }
		  try {
			outputWriter.flush();
			outputWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
	public static void readCharacters() throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		totalCharacters = Integer.parseInt(br.readLine());
		CharacterClass cc = new CharacterClass();
		for (int i = 0; i< totalCharacters; i++) {
			Character temp = new Character();
			temp.setStrength(Integer.parseInt(br.readLine()));
			temp.setDexterity(Integer.parseInt(br.readLine()));
			temp.setConstitution(Integer.parseInt(br.readLine()));
			temp.setIntelligence(Integer.parseInt(br.readLine()));
			temp.setWisdom(Integer.parseInt(br.readLine()));
			temp.setCharisma(Integer.parseInt(br.readLine()));
			temp.setAcrobatics(Integer.parseInt(br.readLine()));
			temp.setAnimalHandling(Integer.parseInt(br.readLine()));
			temp.setArcana(Integer.parseInt(br.readLine()));
			temp.setAthletics(Integer.parseInt(br.readLine()));
			temp.setDeception(Integer.parseInt(br.readLine()));
			temp.setHistory(Integer.parseInt(br.readLine()));
			temp.setInsight(Integer.parseInt(br.readLine()));
			temp.setIntimidation(Integer.parseInt(br.readLine()));
			temp.setInvestigation(Integer.parseInt(br.readLine()));
			temp.setMedicine(Integer.parseInt(br.readLine()));
			temp.setNature(Integer.parseInt(br.readLine()));
			temp.setPerception(Integer.parseInt(br.readLine()));
			temp.setPerformance(Integer.parseInt(br.readLine()));
			temp.setPersuasion(Integer.parseInt(br.readLine()));
			temp.setReligion(Integer.parseInt(br.readLine()));
			temp.setSleightOfHands(Integer.parseInt(br.readLine()));
			temp.setStealth(Integer.parseInt(br.readLine()));
			temp.setSurvival(Integer.parseInt(br.readLine()));
			temp.setHP(Integer.parseInt(br.readLine()));
			temp.setCurHP(Integer.parseInt(br.readLine()));
			temp.setTempHP(Integer.parseInt(br.readLine()));
			temp.setSpeed(Integer.parseInt(br.readLine()));
			temp.setAC(Integer.parseInt(br.readLine()));
			temp.setPassiveWisdom(Integer.parseInt(br.readLine()));
			temp.setInitiative(Integer.parseInt(br.readLine()));
			temp.setInspiration(Integer.parseInt(br.readLine()));
			temp.setProfBonus(Integer.parseInt(br.readLine()));
			temp.setPlayerName(br.readLine());
			temp.setAlignment(br.readLine());
			temp.setCharName(br.readLine());
			temp.setLevel(Integer.parseInt(br.readLine()));
			temp.setRaceChoice(Integer.parseInt(br.readLine()));
			temp.setChosenClass(br.readLine());
			temp.setArmor(br.readLine());
			int j = Integer.parseInt(br.readLine());
			for ( int x = 0; x < j ; x++) {
				String name = br.readLine();
				int lvl = Integer.parseInt(br.readLine());
				temp.addSpell(name , lvl); 
			}
			
			
			temp.chooseRace(temp.raceChoice);
			temp.abilityModifiers();
			temp.setSavingThrows();
			characterList.add(temp);
		}
		br.close();
		fr.close();
	}

	public static void addCharacter(Character c) {
		characterList.add(c);
	}
	public static ArrayList<Character> getCharacterList(){
		return characterList;
	}
}
