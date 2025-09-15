package lab7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Part3 {

	public static void main(String[] args) throws IOException {
		String line;
		File file = new File("emails.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			line=sc.nextLine();
			System.out.print(line.substring(0,line.indexOf("@"))+", ");
			for (int i=0;i<10;i++) {
				System.out.print(String.valueOf((char)(Math.random()*94+33)));
			}
			System.out.println("");
		}
		sc.close();
	}
}
