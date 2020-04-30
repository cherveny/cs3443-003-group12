package Cantrips;

import MainPackage.Spell;

public class AcidSplash extends Spell {
  
  private int Level = 0;
  
  private String name = "Acid Splash";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Acid Splash\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Acid\n"+
                       "Description: You hurl a bubble of acid. Choose one or two creatures you can see within range. If you choose two, they must be within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage.\nThis spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";
  public AcidSplash() {
    
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
