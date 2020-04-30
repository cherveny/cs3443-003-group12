package Cantrips;

import MainPackage.Spell;

public class MageHand extends Spell{
  private int Level = 0;
  private String name = " Mage Hand";
  private String ClassRequirement[] = {"Wizard"};
  private String Description = "Spell: Mage Hand\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S\n"+
                       "Duration: 1 min\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Utility\n"+
                       "Description: A spectral, floating hand appears at a point you choose within range. The hand lasts for the duration or until you dismiss it as an action. The hand vanishes if it is ever more than 30 feet away from you or if you cast this spell again.\nYou can use your action to control the hand. You can use the hand to manipulate an object, open an unlocked door or container, stow or retrieve an item from an open container, or pour the contents out of a vial. You can move the hand up to 30 feet each time you use it.\nThe hand can't attack, activate magic items, or carry more than 10 pounds.";
  
  public MageHand() {
    
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
