import java.util.Scanner;
public class userLogin {

	public static void main(String[] args) {
		String username, password;
		Scanner inp = new Scanner(System.in);
		System.out.println("Username = ");
		username = inp.nextLine();
		
		System.out.println("Password = ");
        password = inp.nextLine();
        
        if(username.equals("patika")&&password.equals("java123")) {
        	System.out.println("Login succesfull");
        }else {
        	if (!username.equals("patika")) {
        		System.out.println("Your username is wrong.");
        }else if (!password.equals("java123")) {
        	System.out.println("Your password is wrong.");
        	System.out.println("Do you want to reset your password?");
        	String response = inp.nextLine();
        	if (response.equals("yes")) {
        		System.out.println("Your new password: ");
        		password = inp.nextLine();
        		if(!password.equals("java123")) {
        			System.out.println("Your new password has been created!");
        		}else {
        			System.out.println("Your new password has not been created!");
        			System.out.println("Please enter another password.");
        		}
        	}
        }
        
        	
        }
        		
	}

}
