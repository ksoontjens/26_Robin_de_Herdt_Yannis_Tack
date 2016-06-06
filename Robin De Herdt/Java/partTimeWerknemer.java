public class partTimeWerknemer extends werknemer
{
    // Dataleden    
    int urenGewerkt;
    
    public partTimeWerknemer(String voornaam, String achternaam, int wNr, float salaris, int urenGw)    // Constructor, zelfde naam als klasse
    {
        // Constructor van de superklasse -> Moet op de eerste regel gebeuren
        super(voornaam, achternaam, wNr, salaris);
        
        urenGewerkt = urenGw;
    }
    
    // Overschrijven van de methode salarisVerhogen()
    public void salarisVerhogen(int percentage)
    {
        if(percentage > 5)
        {
            percentage = 0;
            System.out.println("Fout: slechts 5% opslag toegestaan!");
        }
        else 
        {
            // Spreek de methode in de superklasse aan als het percentage niet hoger is dan 5
            super.salarisVerhogen(percentage); 
        }
    }
}