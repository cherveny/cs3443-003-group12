public class Bless extends Spell {
  
  private int Level = 1;
  
  private String name = "Bless" ;
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Bless\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Enchantment\n"+
                       "Attack/Save: CHA Save\n"+
                       "Damage/Effect: Buff\n"+
                       "Description: You bless up to three creatures of your choice within range. Whenever a target makes an attack roll or a saving throw before the spell ends, the target can roll a d4 and add the number rolled to the attack roll or saving throw.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.";
 

  
  public Bless() {
    
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
