/* 
 *Anay Goyal
 *10/23/24
  Food.java
  
*/


public class Food3 // This is the top class so it does not extend anything
{
	protected String str; // Storing what to print into a String called str
	
	public Food3 ()	// Constructor of the class
	{
		str = new String(""); // New String named str.
	}
	
	public Food3 (String prepMethod, String ingredient, String name, double cost, int count)	// Method that modifies str
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient + " will be sold for " +(int)cost + " cents each. With " + count + " " + name + "(s), $" + String.format("%.2f",cost*count/100) + " can be made."                                 ; 
		
	}

	public void printForSale() //prints the item that is for sale
	{
		System.out.println(str);  //prints the item that is for sale
	}
}

