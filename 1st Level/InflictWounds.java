public class InflictWounds extends Spell {
  
  private int Level = 1;
  
  private String name = "Inflict Wounds";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Inflict Wounds\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Necromancy\n"+
                       "Attack/Save: Melee\n"+
                       "Damage/Effect: Necrotic\n"+
                       "Description: Make a melee spell attack against a creature you can reach. On a hit, the target takes 3d10 necrotic damage.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d10 for each slot level above 1st.";
  

  
  public InflictWounds() {
    
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
