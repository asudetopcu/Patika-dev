import java.util.Scanner;
public class hypotenuseCalculation {

	public static void main(String[] args) {
		System.out.println("��gen i�in dik kenar uzunluklar�n� giriniz. ");
		Scanner input=new Scanner(System.in);
		double kenar1=input.nextDouble();
		double kenar2=input.nextDouble();
		
		double kenar3 = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		
		double u=(kenar1+kenar2+kenar3)/2;
		
		double ucgeninAlan�=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
		
		System.out.println("��genin alan�= " +ucgeninAlan�);

	}

}
