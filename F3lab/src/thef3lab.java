import java.util.Scanner;
public class thef3lab {
 public static void main(String[]args)
 {
	 int thirsty;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Start");
	 System.out.println("Hungry");
	 System.out.println("Get in line");
	 System.out.println("Buy lunch");
	 System.out.println("Thirsty? /n 0 for yes and 1 for no");
	 	thirsty = input.nextInt();
	 	if (thirsty == 0)
	 {
	 System.out.println("Did you have breakfast? 0 for yes and 1 for no");
	int breakfast= input.nextInt();
	if (breakfast == 1)
		System.out.println("You get coke.");
	if(breakfast == 0)
		System.out.println("You get diet coke.");
	 }
	 else
	 {
		 if (thirsty == 1)
			 System.out.println("You get water");
	   }
	 	  System.out.println("You eat lunch.");
		  System.out.println("You return the tray.");
		  System.out.println("You leave.");
	 }
 }

