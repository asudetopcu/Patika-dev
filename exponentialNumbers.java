import java.util.Scanner;
public class exponentialNumbers {

	public static void main(String[] args) {
		int n,k;
		Scanner input = new Scanner(System.in);
		System.out.println("�ss� al�nacak say� : ");
		n = input.nextInt();
		System.out.println("�s olacak say� : ");
		k = input.nextInt();
		
		//3^4 = 3*3*3*3
		
		int total=1;
		for (int i=1; i<=k; i++) {
			total*=n;
		}
		
		System.out.println("cevap= " +total);
		
		

	}

}
