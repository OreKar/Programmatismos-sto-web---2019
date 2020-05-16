package users;

import java.util.Scanner;

public class Admins extends Users{
	

	public Admins() {}
	
	 public int createUser() //method create dimiourgei enan kainourgio xrisit (eite acustomer eite admin eite content admin)
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
			setPassword(pass1);			//kai to swzei sto analogo arxeio txt kalontas ti method save me orisma to antistoixo txt
			System.out.println("type 1 for customer, 2 for admin or 3 for content admin");
			 us=input.nextInt();
			if(us==1) {save("customers.txt");}
			else if(us==2) {save("admins.txt");}
			else if(us==3) {save("contentadmins.txt");}
			System.out.println("Successful Registration");
		}
		else {System.out.println("wrong password");}//an to password den einai toi idoi kai tis duo fores epistrefei minima error
		return us;
	 }
	
	public void updateUser() {} 
	
	public void deleteUser() {}
	
	public void searchUser() {}
	
	public void viewAllUsers() {}
	
	public void registerAdmin() {}
}
