public class FoodTester3 // This method is separate from the super and subclasses, this runs the classes.
{
		public static void main(String[] args) // This is the main method, runs all the classes.
		{
		
		Food3 food1 = new Food3 ("baked", "banana", "muffin", 50, 12); // instance of Food.java
		food1.printForSale();	// Calls the Method, printForSale()
		Food3 food2 = new Food3 ("fried", "yam", "fritter", 100 , 3); // 2nd Instance of Food.java
		food2.printForSale();	// Calls the Method, printForSale()
		Pizza3 pizza = new Pizza3 ("pepperoni", 250, 8);	// Instance of Pizza.java named pizza
		pizza.printForSale(); // Calls the Method printForSale from Food.java, it can print because Pizza is a subclass so it has all the methods.	

		
		}
}
