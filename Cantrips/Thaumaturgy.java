package Cantrips;

import MainPackage.Spell;

public class Thaumaturgy extends Spell {
  
  private int Level = 0;
  
  private String name = "Thaumaturgy";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Thaumaturgy\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V\n"+
                       "Duration: 1 Min\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Control\n"+
                       "Description: You manifest a minor wonder, a sign of supernatural power, within range. You create one of the following magical effects within range:\nYour voice booms up to three times as loud as normal for 1 minute.\nYou cause flames to flicker, brighten, dim, or change color for 1 minute.\nYou cause harmless tremors in the ground for 1 minute.\nYou create an instantaneous sound that originates from a point of your choice within range, such as a rumble of thunder, the cry of a raven, or ominous whispers.\nYou instantaneously cause an unlocked door or window to fly open or slam shut.\nYou alter the appearance of your eyes for 1 minute.\n\nIf you cast this spell multiple times, you can have up to three of its 1-minute effects active at a time, and you can dismiss such an effect as an action.";
  public Thaumaturgy() {
    
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
