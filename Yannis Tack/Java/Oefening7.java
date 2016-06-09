import java.lang.*;

public class Oefening7
{
	public static void main( String arg[] )
	{
        int a[] = {12,34,56,78,123,234,99,88};
        
		zoekGrootsteGetal(a);
	}
	
	private static void zoekGrootsteGetal(int a[])
	{
        int temp;      
        
        for (int i = 0; i < a.length; i++)
        {
           for(int j = 0; j < a.length; j++)
           {
                if(a[i] > a[j])     // '>' for DESC, '<' for ASC
                {
                    temp    = a[j];
                    a[j]    = a[i];
                    a[i]    = temp;
                }
           }
        }
        for (int gesorteerdeGetallen : a)
        {
            System.out.println("Gesorteerde array: " + gesorteerdeGetallen);   
        }
	}
}