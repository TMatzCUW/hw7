import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hw7 {
	public static void main(String[] args) throws FileNotFoundException {
	
		
		Scanner input=new Scanner(new File(System.getProperty("user.dir") + "/src/BibleBooks"));
		while (input.hasNext()) {
			System.out.println(input.nextLine());
		}
		input.close();
		
	}
}
