public class studentWerknemer extends partTimeWerknemer
{
    // Variables    
    public studentWerknemer(String voornaam, String achternaam, int wNr, float salaris, int urenGw)    // Constructor
    {
        // Constructor van de superklasse -> Moet op de eerste regel gebeuren
        super(voornaam, achternaam, wNr, salaris, urenGw);
        
        // Zet de rsz voor studenten standaard op 5%
        this.setRSZ(5);
    }

}