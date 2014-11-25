
/**
 * Write a description of class Eigenaar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eigenaar
{
    // instance variables - replace the example below with your own
    String naam;
    char geslacht;
    int leeftijd;
    
    private int x;

    /**
     * Constructor for objects of class Eigenaar
     */
    Eigenaar(String setName)
    {
        naam = setName;
        leeftijd = 0;
        geslacht = 'm';
    }

    
    void wijzigNaam(String nieuweNaam)
    {
        naam = nieuweNaam;

    }
    
    void wijzigLeeftijd (int nieuweLeeftijd)
    {
        leeftijd = nieuweLeeftijd;
    }
    
    void wijzigGeslacht (char nieuwGeslacht)
    {
        geslacht = nieuwGeslacht;
    }
    
    void toonLeeftijd()
    {
        if (leeftijd == 0) {
            System.out.println("Leeftijd onbekend");    
        } else {
            System.out.println("Deze persoon is " + leeftijd + " oud");
        }
    }
    
    void toonEigenaarGegevens()
    {
        System.out.println("Naam :" + naam + "\tLeeftijd: " + leeftijd + "\tGeslacht: " + geslacht);
    }
    
    
}  
