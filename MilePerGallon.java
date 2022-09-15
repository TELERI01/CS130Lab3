import java.util.Scanner;


public class MilePerGallon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Miles Driven : ");
		double Miles = scan.nextDouble();
		System.out.println("Enter Gallons of Gas : ");
		double Gas = scan.nextDouble();
		
		double MPG = Miles/Gas;
		
		System.out.println("The MPG is : " + MPG);
		


	}

}
