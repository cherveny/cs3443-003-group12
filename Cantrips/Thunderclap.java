package Cantrips;

import MainPackage.Spell;

public class Thunderclap extends Spell {
  
  private int Level = 0;
  
  private String name = "Thunderclap";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Thunderclap\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 5 ft\n"+
                       "Components: S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: CON Save\n"+
                       "Damage/Effect: Thunder\n"+
                       "Description: You create a burst of thunderous sound that can be heard up to 100 feet away. Each creature within range, other than you, must succeed on a Constitution saving throw or take 1d6 thunder damage.\nThe spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";
  public Thunderclap() {
    
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
