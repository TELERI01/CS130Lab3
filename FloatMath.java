import java.util.Scanner;

public class FloatMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number1 : ");
		float number1 = scan.nextFloat();
		System.out.println("Enter number2 : ");
		float number2 = scan.nextFloat();
		
		
		System.out.println("The sum of the numbers is : " + (number1 += number2));
		System.out.println("The difference of the number is : " + (number1-=number2));
		System.out.println("The product of the number is : " + (number1*=number2));
		
		
		

	}

}
