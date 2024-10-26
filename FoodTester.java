public class FoodTester // This method is separate from the super and subclasses, this runs the classes.
{
		public static void main(String[] args) // This is the main method, runs all the classes.
		{
		
		Food food1 = new Food ("baked", "banana", "muffins"); // instance of Food.java
		food1.printForSale();	// Calls the Method, printForSale()
		Food food2 = new Food ("fried", "yam", "fritters"); // 2nd Instance of Food.java
		food2.printForSale();	// Calls the Method, printForSale()
		Pizza pizza = new Pizza ("pepperoni");	// Instance of Pizza.java named pizza
		pizza.printForSale(); // Calls the Method printForSale from Food.java, it can print because Pizza is a subclass so it has all the methods.	

		
		}
}
