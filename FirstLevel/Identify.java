package FirstLevel;

import MainPackage.Spell;

public class Identify extends Spell {
  
  private int Level = 1;
  
  private String name = "Identify";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Identify\n"+
                       "Casting Time: 1 Min\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S,M *\n"+
                       "Duration: Instantaneous\n"+
                       "School: Divination\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Detection\n"+
                       "Description: You choose one object that you must touch throughout the casting of the spell. If it is a magic item or some other magic-imbued object, you learn its properties and how to use them, whether it requires attunement to use, and how many charges it has, if any. You learn whether any spells are affecting the item and what they are. If the item was created by a spell, you learn which spell created it.\nIf you instead touch a creature throughout the casting, you learn what spells, if any, are currently affecting it.";
  

  
  public Identify() {
    
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
