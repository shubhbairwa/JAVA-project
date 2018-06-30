package shubh;
import java.util.Scanner;
public class puzzleOfFRIENDS {

	public static void main(String[] args) {
int a,b;
boolean x;
String y;
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the Quiz of F.R.I.E.N.D.S");
System.out.println("");
System.out.println("There are  simple one word question");
System.out.println();
System.out.println("Let's start");


System.out.println();
System.out.println("How many thanksgiving in F.R.I.E.N.D.S");
a=sc.nextInt();
if (a==10){
	System.out.println("Your answer is correct");
}
else
	System.out.println("sorry answer is incorrect.  ");
System.out.println();
System.out.println("first full name of tribianni is joey?  Answer in true or false");
x=sc.nextBoolean();
if(x==false) {
	System.out.println("Your answer is correct");
}
else System.out.println("sorry answer is incorrect.  ");
System.out.println();
	
System.out.println("How many episode in  season 10");
b=sc.nextInt();
if(b==18) {
	System.out.println("Your answer is correct");
}
else
	System.out.println("sorry answer is incorrect.  ");
System.out.println();
boolean q;
System.out.println("Was Monica pregnant in season 10? (True or False )");
q=sc.nextBoolean();
if(q==false) {
	System.out.println("Your answer is correct");
}
else
{
	System.out.println("sorry answer is incorrect.");
}
	int w;
	System.out.println("How many wives of Ross ");
	w=sc.nextInt();
	if(w==3) {
		System.out.println("Your answer is correct");
	}
	else
	{
		System.out.println("sorry answer is incorrect.");
	}	
	boolean e;
	System.out.println("Was phoebe a pornstar in serial tachnically? (Answer in True or False)");
	e=sc.nextBoolean();
	if(e==true) {
		System.out.println("Your answer is correct");
	}
	else
	{
		System.out.println("sorry answer is incorrect.");
	}	
	

System.out.println("END");
System.out.println();
System.out.println("Thank you for playing");
	
}
	

}
