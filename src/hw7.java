import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class hw7 {
	public static void main(String[] args) throws FileNotFoundException {
	
		
		Scanner input=new Scanner(new File(System.getProperty("user.dir") + "/src/BibleBooks"));
		ArrayList<NT> books=new ArrayList<NT>();
		while (input.hasNext()) {
			NT a=new NT(fileIn.nextLine());
			books.add(a);
		}
		input.close();
		System.out.println("Enter a keyword: ");
		Scanner scan=new Scanner(System.in);
		 String keyword = scan.nextLine();
		
	}
	public boolean linearSearch(String[] ar, String word) {
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==word) {
				return name;
			}
		}
	}
}
