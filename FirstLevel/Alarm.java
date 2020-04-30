package FirstLevel;

import MainPackage.Spell;

public class Alarm extends Spell {
  
  private int Level = 1;
  
  private String name = "Alarm";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Alarm\n"+
                       "Casting Time: 1 Min\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 8 Hours\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Detection\n"+
                       "Description: You set an alarm against unwanted intrusion. Choose a door, a window, or an area within range that is no larger than a 20-foot cube. Until the spell ends, an alarm alerts you whenever a Tiny or larger creature touches or enters the warded area. When you cast the spell, you can designate creatures that won't set off the alarm. You also choose whether the alarm is mental or audible.\nA mental alarm alerts you with a ping in your mind if you are within 1 mile of the warded area. This ping awakens you if you are sleeping.\nAn audible alarm produces the sound of a hand bell for 10 seconds within 60 feet.";  
  
  
  public Alarm() {
    
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
