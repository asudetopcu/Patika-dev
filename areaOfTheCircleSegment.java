import java.util.Scanner;
public class areaOfTheCircleSegment {

	public static void main(String[] args) {
		double r, a;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle.");
		r = input.nextDouble();
		System.out.println("Enter the measure of the angle of the circle segment.");
	    a = input.nextDouble();
	    
	    double pi = 3.14;
	    
	    double area = (pi*(r*r)*a)/360;
	    
	    System.out.println("Area of the circle segment = " + area );
	}

}
