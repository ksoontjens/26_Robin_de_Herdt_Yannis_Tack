import java.lang.*;

public class Oefening6
{
	public static void main( String arg[] )
	{
        int a[] = {12,34,56,78,123,234,99,88};
        
		zoekGrootsteGetal(a);
	}
	
	private static void zoekGrootsteGetal(int a[])
	{
        int grootsteGetal = 0;
        
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] > grootsteGetal)
            {
                grootsteGetal = a[i];
            }
        }
        System.out.println("Grootste getal uit de array is: " + grootsteGetal);
	}

}