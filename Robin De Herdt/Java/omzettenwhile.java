import java.lang.*;

public class omzettenwhile 
{
	/**
	*	Dit is de main methode, ze heeft als parameter een array die vanuit de command line kan ingevuld worden. 
	*/
	public static void main( String arg[])
	{
		/**
		*	De methode drukaf bevat een for loop die loopt door het aantal dat meegegeven wordt via de parameter (in dit geval hard coded 100)
		*	@author	Robin De Herdt
		*/
		drukaf(55);
	}
	
	private static void drukaf(int a)
	{
		while(a > 34)
        {
            System.out.println(a);   
            a--;
        }
	}

}