import java.util.Scanner;
public class NotOrtalamas�HesaplayanProgram {

	public static void main(String[] args) {
		double mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Matematik notunuz: ");
		mat=input.nextDouble();
		System.out.println("Fizik notunuz: ");
		fizik=input.nextDouble();
		System.out.println("Kimya notunuz: ");
		kimya=input.nextDouble();
		System.out.println("T�rk�e notunuz: ");
		turkce=input.nextDouble();
		System.out.println("Tarih notunuz: ");
		tarih=input.nextDouble();
		System.out.println("M�zik notunuz: ");
		muzik=input.nextDouble();
		
		double sum=mat+fizik+kimya+turkce+tarih+muzik;
		double ort=sum/6;
		
		System.out.println("Ortalaman�z= " + ort);
		
		System.out.println(ort>60 ? "S�n�f� Ge�ti.":"S�n�fta Kald�.");
		
	}

}
