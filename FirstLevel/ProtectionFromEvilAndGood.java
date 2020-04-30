package FirstLevel;

import MainPackage.Spell;

public class ProtectionFromEvilAndGood extends Spell {
  
  private int Level = 1;
  
  private String name = "Protection from Evil and Good";
  
  private String ClassRequirement[] = {"Cleric","Wizard"};
  
  private String Description = "Spell: Protection from Evil and Good\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 10 Min\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Buff\n"+
                       "Description: Until the spell ends, one willing creature you touch is protected against certain types of creatures: aberrations, celestials, elementals, fey, fiends, and undead.\nThe protection grants several benefits. Creatures of those types have disadvantage on attack rolls against the target. The target also can't be charmed, frightened, or possessed by them. If the target is already charmed, frightened, or possessed by such a creature, the target has advantage on any new saving throw against the relevant effect.";
  

  
  public ProtectionFromEvilAndGood() {
    
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
