public class factuur implements betaalbaar
{
    // Variables
    public int factuurNr        =   0;
    public int factuurBedrag  =   0;
    
    public factuur( int factuurNummer, int factuurbedrag)
    {
        this.factuurBedrag  = factuurbedrag;
        this.factuurNr      = factuurNummer;
    }
    
    public void betaal()
    {
           System.out.println("Betaal het factuur van " + factuurNr + " voor een bedrag van " + factuurBedrag + ".");
    }
}