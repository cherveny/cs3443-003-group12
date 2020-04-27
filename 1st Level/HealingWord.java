public class HealingWord extends Spell {
  
  private int Level = 1;
  
  private String name = "Healing Word";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Healing Word\n"+
                       "Casting Time: 1 Bonus Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Healing\n"+
                       "Description: A creature of your choice that you can see within range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead or constructs.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the healing increases by 1d4 for each slot level above 1st.";
  

  
  public HealingWord() {
    
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
    
  public String getName()
  {
    return name;
  }
  
  public String getDescription()
  {
    return this.Description;
  }
}
