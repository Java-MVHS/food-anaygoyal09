/* 
 *Anay Goyal
 *10/23/24
  Food.java
  
*/


public class Food // This is the top class so it does not extend anything
{
	protected String str; // Storing what to print into a String called str
	
	public Food ()	// Constructor of the class
	{
		str = new String(""); // New String named str.
	}
	
	public Food (String prepMethod, String ingredient, String name)	// Method that modifies str
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; 
		
	}

	public void printForSale() //prints the item that is for sale
	{
		System.out.println(str);  //prints the item that is for sale
	}
}

