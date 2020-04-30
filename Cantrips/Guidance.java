package Cantrips;

import MainPackage.Spell;

public class Guidance extends Spell{
  private int Level = 0;
  private String name = "Guidance";
  private String ClassRequirement[] = {"Cleric"};
  private String Description = "Spell: Guidance\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S\n"+
                       "Duration: 1 min\n"+
                       "School: Divination\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Buff\n"+
                       "Description: You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The spell then ends.";
  
  public Guidance() {
    
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
