/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Demonstrate the toLowerCase method.
		String upperCase = sample.toUpperCase();
		System.out.println ("sample.toUpperCase() = " + upperCase);
        System.out.println ("After toUpperCase(), sample = " + sample);
        
        // demonstrate the substring method!!!!
        String subguy = sample.substring(4,9);
        System.out.println(subguy);

        //demonstrate the sneaky substring method
        String target = "quick";
        int startingLoc = sample.indexOf(target);
        int len = target.length();
        System.out.println(sample.substring(startingLoc, startingLoc + len));

        //let's loook at substring's overloaded method
        System.out.println(sample.substring(startingLoc + len));

        //break character
        System.out.println("lalla\nfjweijfoe");

        // equals
        String one = "one";
        String two = "one";

        System.out.println(one == two);

	}
}
