package users;

public class Customers extends Users {
	
	public Customers() {}
	
	public void showAvailableFilms() //tuponei to parakato minima mazi me ton titlo tis tainias pou exei dothei apo to xristi
	{
		System.out.println("the films available are x");
	}
	
	public void makeReservation(int ticket , String fname) //tuponei to parakato minima mazi me ton titlo tis tainias kai ton arithmo eisitiriwn pou exei dothei apo to xristi
	{
		System.out.println("there are x sits free for the movie "+ fname);
	}
	
	public void viewReservation() //tuponei to parakato minima 
	{
		System.out.println("there are no resevations");
	}

}
