package dp;
//Create abstract classes implementing the item
public abstract class Burger implements Item {

	   public Packing packing() {
	      return new Wrapper();
	   }

	   public abstract float price();
	}
