package FirstLevel;

import MainPackage.Spell;

public class Bane extends Spell {
  
  private int Level = 1;
  
  private String name = "Bane";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Bane\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Enchantment\n"+
                       "Attack/Save: CHA Save\n"+
                       "Damage/Effect: Debuff\n"+
                       "Description: Up to three creatures of your choice that you can see within range must make Charisma saving throws. Whenever a target that fails this saving throw makes an attack roll or a saving throw before the spell ends, the target must roll a d4 and subtract the number rolled from the attack roll or saving throw.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.";
  
  
  public Bane() {
    
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
