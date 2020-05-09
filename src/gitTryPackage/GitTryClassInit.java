package gitTryPackage;
import java.util.Scanner;
public class GitTryClassInit {

public static void main(String []args) {
	System.out.print("Enter your number:");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	input.close();
	System.out.println("The square of your number is: "+ number*number);
	//Adding this here
	System.out.println("The cube of your number is: " + number*number*number); 
	
}
}
