import java.util.Scanner;
public class combination {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Kümenin elaman sayýsýný giriniz.");
		int n=inp.nextInt();
		System.out.println("Grup sayýsýný giriniz.");
		int r=inp.nextInt();
		
		//c(n,r)=n!/r!*(n-r)!)
		
		int total=1;
	    for (int i=1; i<=n; i++) {
	    	total=total*i;
	    }
	    int total2=1;
	    for (int j=1; j<=r; j++) {
	    	total2=total2*j;
	    }
	    int total3=1;
	    for (int k=1; k<=(n-r); k++) {
	    	total3=total3*k;
	    }
		int sonuc = total/total2*total3;
		System.out.println("kombinasyon sonucu = " +sonuc);
		
	}

}
