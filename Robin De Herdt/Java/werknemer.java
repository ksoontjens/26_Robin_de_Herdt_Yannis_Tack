// package org.kdg.personeel; -> moet overeenkomen met mappenstructuur (DUS: map personeel in map kdg in map org)
// Ook overervende klassen in deze package steken door hetzelfde toe te voegen in script

public class werknemer implements betaalbaar
{
    // Dataleden
    public String voornaam;
    public String achternaam;
    public int werknemerNr;
    protected float salaris;
    
    private float RSZPercentage = 33.0f;
    
    public werknemer(String voornaam, String achternaam, int wNr, float salaris)    // Constructor, zelfde naam als klasse
    {
        // this.voornaam -> datalid     =   voornaam -> parameter
        this.voornaam   =   voornaam;
        this.achternaam =   achternaam;
        werknemerNr     =   wNr;
        this.salaris    =   salaris;
             
    }
        
    public void salarisVerhogen(int percentage)
    {
        salaris = salaris * (1 + ( percentage / 100.0f )); 
    }
    public float getSalaris()   //  getter
    {
        return salaris;   
    }
    public void setRSZ(float value)
    {
        RSZPercentage = value;  
    }
    public float getRSZ()
    {
        return RSZPercentage;   
    }
    
    public void betaal()
    {
           System.out.println("Betaal het salaris van " + this.getSalaris() + " aan de werknemer " + this.voornaam + ".");
    }
}