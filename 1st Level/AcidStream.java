public class AcidStream extends Spell {
  
  private int Level = 1;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Acid Stream\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Self\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Evocation\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Acid\n"+
                       "Description: A stream of acid emanates from you in a line 30 feet long and 5 feet wide in a direction you choose. Each creature in the line must succeed on a Dexterity saving throw or be covered in acid for the spell’s duration or until a creature uses its action to scrape or wash the acid off itself or another creature. A creature covered in the acid takes 3d4 acid damage at start of each of its turns.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d4 for each slot level above 1st.";

  
  public AcidStream() {
    
  }
  
  //GETTERS//
  public int getLevel()
  {
    return this.Level;
  }
  
  public String[] getClassRequirement()
  {
    return this.ClassRequirement;
  }
  
  public String getDescription()
  {
    return this.Description;
  }
}