import java.util.Scanner;
public class HesapMakinesiProgrami {

	public static void main(String[] args) {
		int n1, n2, select;
		Scanner input = new Scanner(System.in);
		System.out.println("�lk Say�y� Giriniz:");
		n1 = input.nextInt();
		System.out.println("�kinci Say�yI Giriniz: ");
        n2 = input.nextInt();
        
        System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
        System.out.println("Se�iniz: ");
        select = input.nextInt();
        
        switch (select) {
        case 1: 
        	System.out.println("Toplam: " + (n1+n2));
        break;
        case 2: 
        	System.out.println("��karma: + (n1-n2)");
        break; 
        case 3:
        	System.out.println("�arpma: " + (n1*n2));
        break;
        case 4:
        	switch(n2) {
        	case 0: 
        		System.out.println("Bir say� 0'a b�l�nemez.");
        	break;
        	default:
        	    System.out.println("B�lme: " + (n1/n2)); 
        	break;
        	}
        break;	
        default:
        	System.out.println("Hatal� giri� yapt�n�z.");
        break;
        	}	
        	
        		
        }
        
        	
	}


