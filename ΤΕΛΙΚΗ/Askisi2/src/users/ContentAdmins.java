package users;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContentAdmins extends Users {

	public ContentAdmins() {}
	
	public void insertFilm(String filmId, String filmTitle,String filmCategory,String filmDescription)//apothikeuei ola ta attributes tin tainias sto film.txt
	{
		 try(FileWriter fileWriter = new FileWriter("film.txt",true)) {  	//dimiourgia antoikeimenou filewriter		   
			    fileWriter.append(filmTitle+" ");//engrafi twn stoixeiwn sto txt
			    fileWriter.append(filmId+" ");
			    fileWriter.append(filmCategory+" ");
			    fileWriter.append(filmDescription+"\n");
			    fileWriter.close();//kleisimo filewriter
			} catch (IOException e) { }
		
		System.out.println("the film "+ filmTitle +" "+"has been added");
	}
	
	public void deleteFilm(String fname)//tuponei to parakato minima mazi me ton titlo tis tainias pou exei dothei apo to xristi
	{
		System.out.println("the film "+ fname +" "+"has been deleted");
	}
	
	public void assignFilmToCinema(String cname,String fname)//tuponei to parakato minima mazi me ton titlo tis tainias kai to onoma tou cinema pou exei dothei apo to xristi
	{
		System.out.println("the film "+ fname +" "+"has been assigned to the cinema "+cname);
	}
}
