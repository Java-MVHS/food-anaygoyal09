public class Pizza extends Food // Pizza is a subclass of Food so we have to put "extends food"
{
	public Pizza (String ingredientIn)	// Create a method that is a normal pizza 
	{
			super("baked", ingredientIn, "Pizza");
	}
	public Pizza (String ingredientIn, String nameIn) // Create a method that is another type of pizza 
	{
		super("baked", ingredientIn,nameIn); 
	}
}
	
