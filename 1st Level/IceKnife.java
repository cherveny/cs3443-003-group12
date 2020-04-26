public class IceKnife extends Spell {
  
  private int Level = 1;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Ice Knife\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: S,M *\n"+
                       "Duration: Instantaneous\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Piercing\n"+
                       "Description: You create a shard of ice and fling it at one creature within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 piercing damage. Hit or miss, the shard then explodes. The target and each creature within 5 feet of it must succeed on a Dexterity saving throw or take 2d6 cold damage.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the cold damage increases by 1d6 for each slot level above 1st.";
  

  
  public IceKnife() {
    
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