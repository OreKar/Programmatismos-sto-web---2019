package movie;

public class Cinemas {

	public Cinemas() {}
	
	private String  cinemaId;
	private boolean cinemaIs3D;
	private int cinemaNumberOfSeats;
	
	public String getcinemaId() //getters
	{
		return cinemaId;
	}
	
	public boolean getcinemaIs3D() 
	{
		return cinemaIs3D;
	} 
	
	public int getcinemaNumberOfSeats() 
	{
		return cinemaNumberOfSeats;
	}
	
	public void setcinemaId(String cid) //setters
	{
		cinemaId=cid;
	}
	
	public void setcinemaIs3D(boolean threed) 
	{
		cinemaIs3D=threed;
	}
	
	public void setcinemaNumberOfSeats(int cns) 
	{
		cinemaNumberOfSeats=cns;
	}
	
}
