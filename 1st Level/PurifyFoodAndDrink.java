public class PurifyFoodAndDrink extends Spell {
  
  private int Level = 1;
  
  private String name = "Purify Food and Drink";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Purify Food and Drink\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 10 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Transmutaion\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Utility\n"+
                       "Description: All nonmagical food and drink within a 5-foot-radius sphere centered on a point of your choice within range is purified and rendered free of poison and disease.";
  

  
  public PurifyFoodAndDrink() {
    
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
