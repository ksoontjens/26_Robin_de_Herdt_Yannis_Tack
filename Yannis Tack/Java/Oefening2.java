import java.lang.*;

public class Oefening2 
{
	public static void main( String arg[] )
	{
		drukDagenAf();
	}
	
	private static void drukDagenAf()
	{
        String dagen[] = {"Zondag","Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag"};
        
        int datum = 0;
        
        while(datum < 29)
        {
            for(int j = 0; j < dagen.length; j++)
            {
                datum++;
                System.out.println( dagen[j] + " " + datum + " Februari 2009" );
                
                if(datum >= 29)
                {
                       break;
                }
            }
        }
	}

}