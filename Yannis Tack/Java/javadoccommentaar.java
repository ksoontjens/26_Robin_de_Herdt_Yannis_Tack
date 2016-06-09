import java.lang.*;

public class javadoccommentaar 
{
    /**
    * 
    * arg kan via cmd gegeven worden
    */
	public static void main( String arg[])
	{
		/**
		*	@author	Yannis Tack
		*/
		drukaf(100);
	}
	
	private static void drukaf(int m)
	{
		int a;
		for( a = 0; a < m; a++)
		{
			System.out.println(a);
		}
	}

}