import java.lang.*;

public class Oefening5
{
	public static void main( String arg[] )
    {
        bepaalPriemGetallen(100);
	}
	
	private static void bepaalPriemGetallen(int n)
	{
        boolean isPrime = true;
        
        for(int i=1; i < 100; i++)
        {
            for(int j=2; j < i ; j++)
            {
                if(i % j == 0){
                    // Not a Prime number
                    isPrime = false;
                    break;
                    // Break stopt de loop
                }
                else 
                {
                    // Prime number
                    isPrime = true; 
                }
            }
            if(isPrime)
            {
                System.out.println(i);
            }
        }
	}
}