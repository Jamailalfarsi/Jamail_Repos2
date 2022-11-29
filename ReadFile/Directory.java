package ReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory {

	public static void main(String[] args) throws IOException 
    { 
        Path temp = Files.move 
        (Paths.get("C:\\Users\\user021\\eclipse-workspace\\Jamail_course_Repo\\src\\JSONFile.txt"),  
        Paths.get("C:\\Users\\user021\\Desktop\\Dirctory.txt")); 
  
        if(temp != null) 
        { 
            System.out.println("File renamed and moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
    } 
} 
