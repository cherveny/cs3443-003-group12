public class MagicMissile extends Spell {
  
  private int Level = 1;
  
  private String name = "Magic Missile";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Magic Missile\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 120 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Force\n"+
                       "Description: You create three glowing darts of magical force. Each dart hits a creature of your choice that you can see within range. A dart deals 1d4 + 1 force damage to its target. The darts all strike simultaneously, and you can direct them to hit one creature or several.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the spell creates one more dart for each slot level above 1st.";
  

  
  public MagicMissile() {
    
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
