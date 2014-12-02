public class Persoon
{
    private int x;
    private String voornaam, naam, gemeente;
    private int gewicht, leeftijd;
    private double lengte;
    private static int aantal; //static = niveau van klasse, wijzigt voor alles = aanroepen via klasse
                       //non-static = niveau van object, wijzigt voor ieder object = aanroepen via 
    Persoon (){
        ++aantal;
    } 
    Persoon(String voornaamN, String naamN)
    {
        voornaam = voornaamN;
        naam = naamN;
        ++aantal;
    }
    
    Persoon(int leeftijd){
        this.leeftijd = leeftijd; // this.leeftijd slaat op de var leeftijd van de class
        voornaam = "Onbekend";
        naam = "Onbekend";
        ++aantal;
    }

    public void wijzigVoornaam(String nieuweVN)
    {
        voornaam = nieuweVN;
    }

    public void wijzigAchternaam(String nieuweAN)
    {
        naam = nieuweAN;
    }
    
    public void wijzigGemeente(String nieuweG)
    {
        gemeente = nieuweG;
    }
    
    public void wijzigGewicht(int nieuwGew)
    {
        gewicht = nieuwGew;
    }
    
    public void wijzigLeeftijd(int nieuweL)
    {
        leeftijd = nieuweL;
    }
    
    public void wijzigLengte(double nieuweLengte)
    {
        lengte = nieuweLengte;
    }
    
    public String geefVoornaam()
    {
        return voornaam;
    }
    
    public Double geefLengte()
    {
        return lengte;
    }
    
    public int geefGewicht()
    {
        return gewicht;
    }
    
    public void geefBMI()
    {
        if (lengte != 0){
        System.out.println("De BMI bedraagt "+ gewicht / Math.pow(lengte,2));
    } else {
        System.out.println("De BMI kan niet berekend worden!");
    }
    }
    
    public void groei()
    {
        lengte += 0.1;
    }
    
    public void groei(int cm)
    {
        lengte += cm/100.0;
    }

    public static int toonAantal()
    {
        return aantal;
    }
    
    public static void drukGroepen(int aantalInGroep)
    {
        int groepen = aantal/aantalInGroep;
        if (aantalInGroep*groepen < aantal) { //5*1=5 < 7 -> aantal + 1
        groepen++;
        }
        
        if (groepen == 1) {
            System.out.println("Er is " +  groepen + " groep");
        } else {
            System.out.println("Er zijn " +  groepen + "groepen");
        }
        
    }
}

