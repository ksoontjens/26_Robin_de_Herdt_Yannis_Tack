// import org.kdg.personeel.*; -> zodat je niet elke keer dit voluit moet schrijven

public class KlassenOefening1
{
    public static void main(String args[])
    {
        // org.kdg.personeel.werknemer jan = new werknemer(); -> Wordt opgelost dmv import
        // Parameters: (Voornaam, achternaam, werknemernummern, salaris)
        werknemer jan       = new werknemer("Jan", "Janssens", 1 , 20.0f);    
        werknemer herman    = new werknemer("Herman", "Hermans", 2, 30.0f);
        werknemer johan     = new werknemer("Johan" , "Peeters", 3, 25.0f);
        werknemer lisa      = new werknemer("Lisa"  , "De graaf",4, 30.0f);
        
        // Parameters: (Voornaam, achternaam, werknemernummer, salaris, uren gewerkt)
        partTimeWerknemer an    = new partTimeWerknemer("An", "De Bie", 5, 15.0f, 20);
        partTimeWerknemer dirk  = new partTimeWerknemer("Dirk", "De Koninck", 6, 14.0f, 26);
        
        // Studentwerknemer
        studentWerknemer bob    = new studentWerknemer("Bob", "Douwen", 7, 50.0f, 54);
        
        // Factuur
        factuur factuur1        = new factuur(1,500);
        factuur factuur2        = new factuur(2, 50);
        
        // Verhoog het salaris van jan met 10%
        jan.salarisVerhogen(10);
        herman.salarisVerhogen(10);
        an.salarisVerhogen(5);
        dirk.salarisVerhogen(10);
        
        // Verander RSZ van werknemer
        jan.setRSZ(40);
        
        // Verander RSZ van parttime werknemer
        dirk.setRSZ(50);
        
        // Betaal werknemer
        jan.betaal();
        
        // Betaal factuur
        factuur1.betaal();
        factuur2.betaal();
        
        // Print alle salarissen
        System.out.println(jan.voornaam     + " verdient " + jan.getSalaris()       + " RSZ: " + jan.getRSZ());
        System.out.println(herman.voornaam  + " verdient " + herman.getSalaris()    + " RSZ: " + herman.getRSZ());  
        System.out.println(johan.voornaam   + " verdient " + johan.getSalaris()     + " RSZ: " + johan.getRSZ());
        System.out.println(lisa.voornaam    + " verdient " + lisa.getSalaris()      + " RSZ: " + lisa.getRSZ());
        System.out.println(an.voornaam      + " verdient " + an.getSalaris()        + " RSZ: " + an.getRSZ());
        System.out.println(dirk.voornaam    + " verdient " + dirk.getSalaris()      + " RSZ: " + dirk.getRSZ());
        System.out.println(bob.voornaam     + " verdient " + bob.getSalaris()       + " RSZ: " + bob.getRSZ());
    }
}