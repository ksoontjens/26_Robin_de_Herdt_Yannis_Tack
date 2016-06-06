import java.lang.*;

public class Oefening1 
{
	public static void main( String arg[] )
	{
		drukTafelsAf();
	}
	
	private static void drukTafelsAf()
	{
		for(int i = 1; i < 10; i++)
        {
             System.out.println("Tafel van " + i);
            
             for(int j = 1; j < 10; j++)
             {
                System.out.println(i + " * " + j + " = " + i * j);      
             }
        }
	}

}