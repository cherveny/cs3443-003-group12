package Cantrips;

import MainPackage.Spell;

public class Resistance extends Spell {
  
  private int Level = 0;
  
  private String name = "Resistance" ; 
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Resistance\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Buff\n"+
                       "Description: You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one saving throw of its choice. It can roll the die before or after making the saving throw. The spell then ends.";
  public Resistance() {
    
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
