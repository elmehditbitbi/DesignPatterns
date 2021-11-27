package dp;
//Create concrete classes extending Burger and ColdDrink classes
public class VegBurger extends Burger {

	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   public String name() {
	      return "Veg Burger";
	   }
	}
