/*import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebSpider {

	static Map <String, Boolean> search =new HashMap <String, Boolean>();
	private static String nextWord() 
	{
		 for(Map.Entry<String, Boolean>li: search.entrySet())
		 {	
			 if(li.getValue() != true)
			 	{
				 	search.put(li.getKey(),false);
				 	return li.getKey();
			 	}
		 }
		 return null;
	 }
	public static void main(String[] args)
	{ 
		try 
		{
			String espn = "http://www.espn.com/";
			search.put(espn, false);
			String word = nextWord();
			while (word != null)
			{
				URL web = new URL(word);
			
			BufferedReader bufrRDR = new BufferedReader(new InputStreamReader(web.openStream()));
			String findline;
			Pattern reg= Pattern.compile("(http:.*?)\"");
			findline = bufrRDR.readLine();
            	 	while (findline != null)
            	 	{
               			 Matcher mat = reg.matcher(findline);
               			// System.out.println(findline);
              			  if (mat.find()&& search.containsKey(mat.group(1)))
              			  {
              				  search.put(mat.group(1), false);
              				  System.out.printf("%s\n", mat.group(1));
              			  }
              			findline = bufrRDR.readLine();
            	 	} 
            	 	word =nextWord(); 
			}
		}
		catch (Exception ex)
		{ 
			System.out.printf("im sorry, try again: %s", ex.getMessage());
		}
		
	}
	
	
}*/