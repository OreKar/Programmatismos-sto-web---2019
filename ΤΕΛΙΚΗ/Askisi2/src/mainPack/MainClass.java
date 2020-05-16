package mainPack;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import movie.Cinemas;
import movie.Films;
import movie.Provoles;
import users.Admins;
import users.Customers;
import users.ContentAdmins;
import users.Users;

public class MainClass extends Users {
	
	public MainClass() {}
	
	public static void main(String[] args) 
  {
	Users s=new Users(); //antikeimeno gia thn class Users
	Admins a= new Admins();//antikeimeno gi athn class Admins
	Customers c= new Customers();//antikeimeno gi athn class Customers
	ContentAdmins ca=new ContentAdmins();//antikeimeno gi athn class ContentAdmins
	Provoles p=new Provoles();//antikeimeno gi athn class provoles
	Cinemas ci=new Cinemas();//antikeimeno gi athn class Cinemas
	Films f=new Films();//antikeimeno gi athn class Films
	boolean flag=false;
	int stat=0,stat1=0,stat2=0,stat3=0;
	Scanner input =new Scanner(System.in);//scanner
	
	while(s.logout==true) {
	System.out.println("type 1 for customer"); //arxiko menu
	System.out.println("type 2 for admin");
	System.out.println("type 3 for content admin");
	System.out.println("type 4 to register new customer profile");
	
	while (flag==false)
	{
		try {
			stat=input.nextInt();
			if((stat==1)||(stat==2)||(stat==3)||(stat==4)) //an o xristis patisei kati ektos apo 1,2,3,4 epanalipsi kai minima error		
			{
				flag=true;		 
			}
			else{
				System.out.println("Error try again!!");  //minima error
			}
		}catch(InputMismatchException e)
		{
			
		}	
	}
	
	if(stat==1) 
	{
		s.login("customers.txt");
		System.out.println("type 1 to show available films"); //menu gia customers
		System.out.println("type 2 to make reservation");
		System.out.println("type 3 to view reservation");
		System.out.println("type 4 Log out");
		stat1=input.nextInt();
			
		Scanner input2 =new Scanner(System.in);
			if(stat1==1) 
			{
				c.showAvailableFilms(); //ulopoiei tin method showAvailableFilms tis class customers
			}
			else if(stat1==2) 
			{	
				String fname="";
				System.out.println("film name :");//orisma fname gia ti method makeReservation
				 fname=input2.nextLine();	
				System.out.println("number of tickets: ");//orisma ticket gia ti method makeReservation
				int tickets=input2.nextInt();
				c.makeReservation(tickets,fname);//ulopoiei tin method makeReservation tis class customers								
			} 
			else if(stat1==3) 
			{
				c.viewReservation();
			} 							//ulopoiei tin method viewReservation tis class customers
			else if(stat1==4) 
			{	stat=0;
				stat1=0;
				stat2=0;
				stat3=0;
				flag=false;
				s.logout();
			}					
			else{
				System.out.println("Error try again!!"); //error gia an o xristis patisei kati ektos apo 1,2,3
				}		
	}
	
	else if(stat==2) 
	{
		s.login("admins.txt");
		System.out.println("type 1 to create user");
		System.out.println("type 2 to update user");
		System.out.println("type 3 to delete user");
		System.out.println("type 4 to search user");
		System.out.println("type 5 to view all users");
		System.out.println("type 6 to register admin"); //menu gia admins
		System.out.println("type 7 Log out");
		stat2=input.nextInt();
		
			if(stat==1) {c.showAvailableFilms();} //methods gi admins (den exoun ulopoihthei)
			else if(stat2==1) {a.createUser();} 
			else if(stat2==2) {a.updateUser();}
			else if(stat2==3) {a.deleteUser();}
			else if(stat2==4) {a.searchUser();}
			else if(stat2==5) {a.viewAllUsers();}
			else if(stat2==6) {a.registerAdmin();}
			else if(stat2==7) 
			{	stat=0;
				stat1=0;
				stat2=0;
				stat3=0;
				flag=false;
				s.logout();
			}
			else{
		 System.out.println("Error try again!!");//error gia an o xristis patisei kati ektos apo 1,2,3,4,5,6,
		}
	}
	else if(stat==3) 
	{
		s.login("contentadmins.txt");
		System.out.println("type 1 to insert film");
		System.out.println("type 2 to delete film");
		System.out.println("type 3 to assign film to cinema");//menu gia contentadmins
		System.out.println("type 4 Log out");
		stat3=input.nextInt();
		
				
			Scanner input3 =new Scanner(System.in);//scanner
			if(stat3==1) 
			{
				System.out.println("film Title: ");//orisma filmTitle gia tin insertFilm
				String filmTitle=input3.nextLine();
				System.out.println("film Id: ");//orisma filmId gia tin insertFilm
				String filmId=input3.nextLine();
				System.out.println("Category: ");//orisma filmCategory gia tin insertFilm
				String filmCategory=input3.nextLine();
				System.out.println("Description: ");//orisma filmDescription gia tin insertFilm
				String filmDescription=input3.nextLine();
				ca.insertFilm(filmId, filmTitle, filmCategory, filmDescription);//ulopoiei ti method insertFilm tis class contentadmins
			}
			else if(stat3==2) 
			{   System.out.println("film name :");//orisma fname gia tin deleteFilm
			    String fname=input3.nextLine();
				ca.deleteFilm(fname);//ulopoiei ti method deleteFilm tis class contentadmins
			} 
			else if(stat3==3)
			{	
				System.out.println("cinema name :");//orisma cname gia tin assigneFilmtoCinema
		    	String fname=input3.nextLine();
		    	System.out.println(" film name :");//orisma fname gia tin assigneFilmtoCinema
		    	String cname=input3.nextLine();
				ca.assignFilmToCinema(fname,cname);//ulopoiei ti method deleteFilm tis class contentadmins
			}					 				
			else if(stat3==4) 
			{
				s.logout();
				stat=0;
				stat1=0;
				stat2=0;
				stat3=0;
				flag=false;
			}				
			else	
			{
			 System.out.println("Error try again!!");//error gia an o xristis patisei kati ektos apo 1,2,3
			}	
	
	}
	else if(stat==4) 
	{
		s.register();
		stat=0;
		stat1=0;
		stat2=0;
		stat3=0;
		flag=false;
		s.logout=true;
	}
  }
  }
}
