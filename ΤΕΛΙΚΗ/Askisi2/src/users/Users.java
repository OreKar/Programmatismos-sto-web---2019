package users;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Users {
	public Users() {}
	public boolean logout=true;
	public String[] namearr=new String[100];
	public String[] userarr=new String[100];
	public String[] passarr=new String[100];
	 private String name,username,password;
	
	
	 public String getName()//getters
	 {
		 return name;
	 }
	 
	 public String getUserName() 
	 {
		 return username; 
	 }
	 
	 public String getPassword() 
	 {
		 return password; 
	 }
	 
	 public void setName(String name2) //setters
	 {
		 name=name2;
	 }
	 
	 public void setUserName(String uname) 
	 {
		 username=uname;
	 }
	 
	 public void setPassword(String pass) 
	 {
		 password=pass;
	 }
	 
	 
	 
	 public void login(String clearence) //login method zitaei apo to xrisiti username kai passwordelegxei an to username kai password
	 {// pou exei dwsei briskonte sto antistoixo txt analoga me to menu pou thelei na anoiksei (customer ,admin,content admin)
		 boolean f1=false,f2=false;
		 String[] txt=null;
		 String n;
		  BufferedReader br=null;
		  for(int i=0;i<100;i++) 
		  {
			  namearr[i]="";
			  userarr[i]="";
			  passarr[i]="";
		  }
		try {
			 FileInputStream fstream = new FileInputStream(clearence);
			  DataInputStream in = new DataInputStream(fstream);
			br = new BufferedReader(new InputStreamReader(in));	
			int j=0;	
			String st; 
			while ((st = br.readLine()) != null) 
			  {
				txt =st.split(" ") ;
				
				namearr[j]=txt[0];
				
				userarr[j]=txt[1];
				
				passarr[j]=txt[2];
				
				j++;
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Scanner input =new Scanner(System.in);
		 
		 do
			 {
		 		System.out.println("Enter username: ");//o xrisitis dinei username 
		 		n=input.nextLine();
		 		for(int i=0;i<userarr.length;i++) {//an to username antistoixei me kapoio ap ta onomata ston pinaka to f1 ginetai true		
		 		if(userarr[i].equals(n)) { f1=true;}}
		 		System.out.println("Enter password: ");//o xrisitis dinei password
		 		String p=input.nextLine();
		 		for(int i=0;i<passarr.length;i++) {
		 		if( passarr[i].equals(p)) {f2=true;}}//an to password antoistixei me ekeieno pou brisketai sto antistoixo keli me to username  to f2 ginetai true
		 		if(f1==false) {System.out.println("wrong username,please try again");}//alliw tiponetai to antistoixo minima
		 		if(f2==false) {System.out.println("wrong password,please try again");}
			 }
		 while((f1==false) || (f2==false));//to loop stamataei an o xristis dwsei swsta stoixeia
		 System.out.println("welcome "+n);
		 logout=false;
	 }
	
	 public void logout() //kanei ti metabliti logout alithis wste oli i diadikasia tis main na epanalifthei
	 {logout=true;
	 
		 
	 }

	 public int register() //method create dimiourgei enan kainourgio xrisit (eite acustomer eite admin eite content admin)
	 {
		int us=0;
		String pass1="",pass2="";
		 Scanner input =new Scanner(System.in);
		System.out.println("Enter name: ");//o xrisitis dinei to onoma tou
		 setName(input.nextLine());
		System.out.println("Enter username: ");//o xrisitis dinei to username tou
		 setUserName(input.nextLine());
		System.out.println("Enter password: ");//o xrisitis dinei to password tou
		 pass1=input.nextLine();
		System.out.println("Confirm password: ");//o xrisitis ksanadinei to password tou 
		 pass2=input.nextLine();
		if(pass1.equals(pass2)) {	//an exei dwsei to idio password kai tis duo fores tote zitaei ton typo account pou thelei na ftiaksei		
			setPassword(pass1);			//kai to swzei sto  arxeio customers.txt kalontas ti customers.txt
			 save("customers.txt");	
			 System.out.println("Successful Registration");}		
		else {System.out.println("wrong password");}//an to password den einai toi idoi kai tis duo fores epistrefei minima error
		return us;
	 }
	
	 
	 public void save(String filename) //method save swzei ta stoixeia tou profil sto antistoixo txt
	 {
		 try(FileWriter fileWriter = new FileWriter(filename,true)) {  	//dimiourgia antoikeimenou filewriter		   
			    fileWriter.append(name+" ");//engrafi twn stoixeiwn sto txt
			    fileWriter.append(username+" ");
			    fileWriter.append(password+"\n");
			    fileWriter.close();//kleisimo filewriter
			} catch (IOException e) { }
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
