public class ColorSpray extends Spell {
  
  private int Level = 1;
  
  private String name = "Color Spray";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Color Spray\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Self\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Round\n"+
                       "School: Illusion\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Blinded\n"+
                       "Description: A dazzling array of flashing, colored light springs from your hand. Roll 6d10; the total is how many hit points of creatures this spell can affect. Creatures in a 15-foot cone originating from you are affected in ascending order of their current hit points (ignoring unconscious creatures and creatures that can't see).\nStarting with the creature that has the lowest current hit points, each creature affected by this spell is blinded until the end of your next turn. Subtract each creature's hit points from the total before moving on to the creature with the next lowest hit points. A creature's hit points must be equal to or less than the remaining total for that creature to be affected.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, roll an additional 2d10 for each slot level above 1st.";
  

  
  public ColorSpray() {
    
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
