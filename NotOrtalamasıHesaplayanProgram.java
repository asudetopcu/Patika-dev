import java.util.Scanner;
public class NotOrtalamasýHesaplayanProgram {

	public static void main(String[] args) {
		double mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Matematik notunuz: ");
		mat=input.nextDouble();
		System.out.println("Fizik notunuz: ");
		fizik=input.nextDouble();
		System.out.println("Kimya notunuz: ");
		kimya=input.nextDouble();
		System.out.println("Türkçe notunuz: ");
		turkce=input.nextDouble();
		System.out.println("Tarih notunuz: ");
		tarih=input.nextDouble();
		System.out.println("Müzik notunuz: ");
		muzik=input.nextDouble();
		
		double sum=mat+fizik+kimya+turkce+tarih+muzik;
		double ort=sum/6;
		
		System.out.println("Ortalamanýz= " + ort);
		
		System.out.println(ort>60 ? "Sýnýfý Geçti.":"Sýnýfta Kaldý.");
		
	}

}
