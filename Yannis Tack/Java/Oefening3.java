import java.lang.*;

public class Oefening3
{
	public static void main( String arg[] )
	{
		drukPiAf();
	}
	
	private static void drukPiAf()
	{
        double Pi = 4;
        Boolean optellen = false;
        
        for (int noemer = 3; noemer < 10000; noemer += 2)
        {
            if (optellen)
            {
                Pi += 4.0 / noemer;
            }
            else
            {
                Pi -= 4.0 / noemer;
            }
            optellen = !optellen;
        }
        System.out.println(Pi);
    }
}