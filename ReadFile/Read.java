package ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class Read {

	 // main driver method
    private static final String String = null;

	public static void main(String[] args) throws Exception
    {
 
        // File path is passed as parameter
        File file = new File( "C:\\Users\\user021\\eclipse-workspace\\Jamail_course_Repo\\src\\JSONFile.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
       // SearchFile searchInput=new SearchFile();
       //   searchInput.parseFile(string s);
      
     
    }
}
