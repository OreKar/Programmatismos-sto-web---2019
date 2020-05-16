package movie;

public class Provoles {

	public Provoles() {}
	
	private String  provoliID, provoliFilm, provoliCinema;
	private int provoliNumberOfReservations;
	private float provoliStartDate,provoliEndDate;
	private boolean provoliIsAvailable;
	
	 public String getprovoliID()//getters
	 {
		 return provoliID;
	 }
	 
	 public String getprovoliFilm() 
	 {
		 return provoliFilm; 
	 }
	 
	 public String getprovoliCinema() 
	 {
		 return provoliCinema; 
	 }
	 
	 public int getprovoliNumberOfReservations() 
	 {
		 return provoliNumberOfReservations;
	 }
	 
	 public float getprovoliStartDate() 
	 {
		 return provoliStartDate;
	 }
	 
	 public float getprovoliEndDate() 
	 {
		 return provoliEndDate;
	 }
	 
	 public boolean getprovoliIsAvailable()
	 {
		 return provoliIsAvailable;
	 }
	 
	 public void setprovoliID(String id) //setters
	 {
		 provoliID=id;
	 }
	 
	 public void setprovoliFilm(String pFilm) 
	 {
		 provoliFilm=pFilm;
	 }
	 
	 public void setprovoliCinema(String pCinema) 
	 {
		 provoliCinema=pCinema;
	 }
	 
	 public void setprovoliNumberOfReservations(int pnor) 
	 {
		 provoliNumberOfReservations=pnor; 
	 }
	 
	 public void setprovoliStartDate(float start) 
	 {
		 provoliStartDate=start;
	 }
	 
	 public void setprovoliEndDate(float end) 
	 {
		  provoliEndDate=end;
	 }
	 public void setprovoliIsAvailable(boolean available) 
	 {
		 provoliIsAvailable=available;
	 }
}
