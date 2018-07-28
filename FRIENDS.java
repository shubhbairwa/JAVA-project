package javac;
import java.util.Scanner;
public class FRIENDS {
	private static Scanner sc;

	public static void main(String[] args) {
int a,b;
boolean x;
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to the Quiz of F.R.I.E.N.D.S");
System.out.println("");
sc.nextLine();
System.out.println("There are  simple one word question");
System.out.println();
sc.nextLine();
System.out.println("Let's start");
System.out.println();
sc.nextLine();
System.out.println("Q1- How many thanksgiving in F.R.I.E.N.D.S ?");
a=sc.nextInt();
if (a==9){
	System.out.println("Your answer is correct");
}
else
	System.out.println("sorry answer is incorrect.  ");
System.out.println();
sc.nextLine();
System.out.println("Q2-First full name of tribianni is joey.  Answer in true or false");
x=sc.nextBoolean();
if(x==false) {
	System.out.println("Your answer is correct");
}
else System.out.println("sorry answer is incorrect.  ");
System.out.println();
sc.nextLine();
System.out.println("Q3-How many episode in  season 10 ?");
b=sc.nextInt();
if(b==18) {
	System.out.println("Your answer is correct");
}
else
	System.out.println("sorry answer is incorrect.  ");
System.out.println();
sc.nextLine();
boolean q;
System.out.println("Q4- Monica was pregnant in season 10. (True or False )");
q=sc.nextBoolean();
if(q==false) {
	System.out.println("Your answer is correct");
}
else
{
	System.out.println("sorry answer is incorrect.");
}
sc.nextLine();
	int w;
	System.out.println("Q5- How many wives of Ross ? ");
	w=sc.nextInt();
	if(w==3) {
		System.out.println("Your answer is correct");
	}
	else
	{
		System.out.println("sorry answer is incorrect.");
	}	
	sc.nextLine();
	boolean e;
	System.out.println("Q6- phoebe was a pornstar in serial tachnically. (Answer in True or False)");
	e=sc.nextBoolean();
	if(e==true) {
		System.out.println("Your answer is correct");
	}
	else
	{
		System.out.println("sorry answer is incorrect.");
	}	
	sc.nextLine();
System.out.println("END");
System.out.println();
sc.nextLine();
System.out.println("Thank you for playing");	
}
}

