
/** 
 * Maak een nieuw project aan in BlueJ (“Voorbeeldoef”).
 * Maak hierin een klasse “Persoon”, met volgende velden: voornaam, naam, gemeente, lengte (in m), gewicht (in kg), leeftijd.
 */
public class Persoon
{
    private int x;
    String voornaam, naam, gemeente;
    int gewicht, leeftijd;
    double lengte;
    public Persoon(String voornaamN, String naamN)
    {
        voornaam = voornaamN;
        naam = naamN;
    }
    
    public Persoon(int leeftijd){
        this.leeftijd = leeftijd; // this.leeftijd slaat op de var leeftijd van de class
        voornaam = "Onbekend";
        naam = "Onbekend";
    }
    
    public Persoon (){
    } 

    void wijzigVoornaam(String nieuweVN)
    {
        voornaam = nieuweVN;
    }

    void wijzigAchternaam(String nieuweAN)
    {
        naam = nieuweAN;
    }
    
    void wijzigGemeente(String nieuweG)
    {
        gemeente = nieuweG;
    }
    
    void wijzigGewicht(int nieuwGew)
    {
        gewicht = nieuwGew;
    }
    
    void wijzigLeeftijd(int nieuweL)
    {
        leeftijd = nieuweL;
    }
    
    void wijzigLengte(double nieuweLengte)
    {
        lengte = nieuweLengte;
    }
    
    String geefVoornaam()
    {
        return voornaam;
    }
    
    Double geefLengte()
    {
        return lengte;
    }
    
    int geefGewicht()
    {
        return gewicht;
    }
    
    void geefBMI()
    {
        if (lengte != 0){
        System.out.println("De BMI bedraagt "+ gewicht / Math.pow(lengte,2));
    } else {
        System.out.println("De BMI kan niet berekend worden!");
    }
    }
    
    void groei()
    {
        lengte += 0.1;
    }
    
    void groei(int cm)
    {
        lengte += cm/100.0;
    }
}

