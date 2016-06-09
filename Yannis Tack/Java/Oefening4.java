import java.lang.*;

public class Oefening4
{
	public static void main( String arg[] )
	{
        int a = 4302;
        
        inverteer(a);
	}
	
	private static void inverteer(int a)
	{
        System.out.println(~a + 1);
	}
}