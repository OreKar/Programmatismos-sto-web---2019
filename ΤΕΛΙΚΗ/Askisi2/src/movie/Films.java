package movie;

public class Films {

	public Films() {}
	
	private String  filmId, filmTitle, filmCategory, filmDescription;
	
	  public String getfilmId()//getters
	 {
		 return filmId;
	 }
	 
	 public String getfilmTitle() 
	 {
		 return filmTitle; 
	 }
	 
	 public String getfilmCategory() 
	 {
		 return filmCategory; 
	 }
	 
	 public String getfilmDescription() 
	 {
		 return filmDescription; 
	 }
	 
	 public void setfilmId(String fid) //setters
	 {
		 filmId=fid;
	 }
	 
	 public void setfilmTitle(String ft) 
	 {
		 filmTitle=ft;
	 }
	 
	 public void setfilmCategory(String fc) 
	 {
		 filmCategory=fc;
	 }
	 
	 public void setfilmDescription(String fd) 
	 {
		 filmDescription=fd;
	 }
}
