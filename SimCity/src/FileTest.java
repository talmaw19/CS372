/*import java.io.*;

public class FileTest{
public static void main(String[] args)
{	
	String directory = System.getProperty("user.dir")+"\\src";
	
	File cd = new File(directory);
	File[] files= cd.listFiles();
	for(File f: files)
	{
		if(f.getName().endsWith(".java"))
		{
			try (FileInputStream is = new FileInputStream(f)) {
                    InputStreamReader ir = new InputStreamReader(is);
                    BufferedReader rdr = new BufferedReader(ir);
                    String line = rdr.readLine();
                    while (line != null){                    //while (!line.contains("class ")) 
                        if (line.contains("\""))
                        {
                        	System.out.printf("%s:%s\n", f.getName(), line);
                        	int s = line.indexOf('"');
                        	int e = line.indexOf('"'), s +) ;
                        }
                    	line = rdr.readLine();
                    System.out.printf("%s: %s\n", f.getName(), line);

			}
			catch (Exception ex)
			{
				System.out.printf("Failed for %s\n", f.getName());
			}
	}
}
}
}
/*
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
*/