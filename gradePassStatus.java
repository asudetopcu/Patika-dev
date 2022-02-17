import java.util.Scanner;
public class gradePassStatus {

	public static void main(String[] args) {
		
		int num=5;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Matematik notunuz:");
		int mat=input.nextInt();
		if (mat<0 || 100<mat) {
			mat=0;
			num -=1;
		}
		System.out.println("Türkçe notunuz:");
        int turkce=input.nextInt();
        if (turkce<0 || 100<turkce) {
			turkce=0;
			num -=1;
		}
        System.out.println("Fizik notunuz:");
        int fizik=input.nextInt();
        if (fizik<0 || 100<fizik) {
			fizik=0;
			num -=1;
		}
        System.out.println("Kimya notunuz:");
        int kimya=input.nextInt();
        if (kimya<0 || 100<kimya) {
			kimya=0;
			num -=1;
		}
        System.out.println("Müzik notunuz:");
        int muzik=input.nextInt();
        if (muzik<0 || 100<muzik) {
			muzik=0;
			num -=1;
		}
        System.out.println(num);
        double avarage=(mat+fizik+turkce+kimya+muzik)/num;
        
        if (avarage<=55) {
        	System.out.println("Sýnýfta kaldýnýz.");
        }else {
        	System.out.println("Tebrikler.");
        }
	}

}
