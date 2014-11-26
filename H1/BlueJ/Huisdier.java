
/**
 * Write a description of class Huisdier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Huisdier
{
    String naam, soort;
    int leeftijd;
    Eigenaar eigenaar;

    
    public Huisdier(String huisdierNaam)
    {
        naam = huisdierNaam;
    }

    
    void kenSoortToe(String nieuweSoort)
    {
        soort = nieuweSoort;
    }
    
    void kenLeeftijdToe (int nieuweLeeftijd)
    {
        leeftijd = nieuweLeeftijd;
    }
    
    void kenEigenaarToe (Eigenaar nieuweEigenaar)
    {
        eigenaar = nieuweEigenaar;
    }
    
    void toonNaam()
    {
        System.out.println("Naam: " + naam);
    }
    
    void toonEigenaarsGegegevens()
    {
        if (eigenaar == null) {
        System.out.println("Geen eigenaarsgegevens");
        } else {
        eigenaar.toonEigenaarGegevens();
        }
    }
}
