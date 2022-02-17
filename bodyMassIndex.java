import java.util.Scanner;
public class bodyMassIndex {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your height.");
		double height = input.nextDouble();
		System.out.println("Enter your weight.");
		double weight = input.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("Your body mass index = " + bmi);
		

	}

}
