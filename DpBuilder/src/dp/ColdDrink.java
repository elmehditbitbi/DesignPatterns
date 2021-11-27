package dp;
//Create abstract classes implementing the item
public abstract class ColdDrink implements Item {

	public Packing packing() {
       return new Bottle();
	}

	public abstract float price();
}
