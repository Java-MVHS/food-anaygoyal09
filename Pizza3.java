public class Pizza3 extends Food3 // Pizza is a subclass of Food so we have to put "extends food"
{
	public Pizza3 (String ingredientIn, double priceIn, int countIn2)	// Create a method that is a normal pizza 
	{
			super("baked", ingredientIn, "Pizza", priceIn, countIn2);
	}
	public Pizza3 (String ingredientIn, String nameIn, double priceIn, int countIn2) // Create a method that is another type of pizza 
	{
		super("baked", ingredientIn,nameIn, priceIn, countIn2); 
	}
}
	
