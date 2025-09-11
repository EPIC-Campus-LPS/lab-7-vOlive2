import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class PasswordMaker {
	public static void main(String[] args) throws IOException {
		File file = new File("emails.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner lineScanner = new Scanner(line);
			String email = lineScanner.next();
			String pass = password();
			System.out.print(email.substring(0, email.indexOf("@")));
			System.out.print(", " + pass + "\n");
		}
		scan.close();
		
	}
	public static String password() {
		String chars = "abcdefghijclmnopqrstuvwxyz0123456789!@#$%^&*~_-=+[]{}().,?/`";
		String pass = "";
		for(int i = 0; i <= 10; i++) {
			int which = (int) (Math.random() * 60);
			int up = (int) (Math.random() * 2);
			if(up == 1) {pass+=chars.substring(which, which+1);
			} else {pass+=chars.substring(which, which+1).toUpperCase();}
		}
		return pass;
	}
}
