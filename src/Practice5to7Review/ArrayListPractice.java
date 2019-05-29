package Practice5to7Review;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.*;

public class ArrayListPractice {
	public static void main(String[] args) throws FileNotFoundException {
        //create file object
        File file = new File("product.txt");
        //open file using scanner
        Scanner scan = new Scanner(file);
        //System.out.println(scan.nextLine());
        
        ArrayList<String> data = new ArrayList<>();
        
        //hasNextLine will be true if there is line of data
        
            while(scan.hasNextLine()) {
            // it reads a line and switches to next line
                
                String line = scan.nextLine();
            System.out.println(line);
            data.add(line);
        }
            
            System.out.println("Number of products: "+ data.size());
            System.out.println(data.toString());
    }
}

