
public class AutoExplicit {

	public static void main(String[] args) {
		
		int A = 12;
		double B = (double)A;
		float C = (float)B;
		int Ae = (int)C;
		
		System.out.println("The Integer is : " + A);
		System.out.println("The Double is : " + B);
		System.out.println("The float is : " + C);	
		System.out.println("The second float is : " + Ae);
		

	}

}