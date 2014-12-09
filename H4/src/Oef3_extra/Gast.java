package Oef3_extra;
public class Gast
// wat is Gast ? 					Subklasse van de object klasse
// waarvoor dient de volgende {		Begin van de klasse aan te geven
{
    private int nummer;
    private String naam;
    private String land;
    private Kamer kamer;
// wat zijn nummer,naam en land voor de klasse Gast ? 		Eigenschappen/Variabelen 
    
// welk is de toegankelijkheid van nummer,naam en land ? 	Eenkel in deze klasse toegankelijk.
    
    private static String toegelatenLand[]={"Belgi�","Nederland","Duitsland","Frankrijk","Spanje"};
// Geef de kenmerken van toegelatenLand 
// static ? 	Eigenschap van de klasse zelf, niet van een object van de klasse
// String ? 	datatype van de array
// toegelatenLand [] ? Array met de naam toegelatenLand
    
    public Gast() {
    	this.kamer = new Kamer();
    }   
// wat is Gast() voor deze klasse ? 	Een constructor die twee Strings verwacht.
    
    public Gast(String naam, String land, Kamer kamer) {
        this.naam=naam;
        landControle(land);
        this.nummer=99;
        this.kamer = kamer;
    }

    public Gast(int nummer, String naam, String land, Kamer kamer) {
        this.nummer=nummer;
        this.naam=naam;
        landControle(land);
        this.kamer = kamer;
    }
    
    public Gast(int nummer){
    	this.nummer = nummer;
    	this.naam = "Onbekend";
    	this.land = "Onbekend";
    }
//  waarin verschillen de 2 Gast-methode van elkaar ?  verschillende signatuur
    // hoe noemt men deze techniek ? constructor overloading
    // is this.nummer=nummer te vervangen door  
    //          nummer=nummer; Neen
    // welke is de toegankelijkheid van deze methoden ? Overal toegankelijk 
    // waarom ? Er staat public voor
   
    public void wijzigLand(String land) {
       landControle(land);
     }

    public void wijzigNummer(int nr){
    	this.nummer=nr;
    }
//  wat betekent void ? geeft geen datatype terug
    // wat is (int nr) voor deze methode ? argument dat meegegeven wordt
    // mag this.nummer=nr vervangen worden door nummer=nr; ? ja, de de namen van beide variabelen zijn verschillend.
    

    public void wijzigNaam(String naam){
    	this.naam=naam;
    }
    
   
      
    public void drukAf() {
    	if(naam != null){
    		System.out.println("Gast nr "+nummer+" = "+naam+" - herkomst = "+land);
    		
    	}
    }
    public void landControle(String land){
    	boolean toegelaten=false;
    	 for (int i=0; i<toegelatenLand.length && toegelaten==false; i++) {
             if (land.equals(toegelatenLand[i])) {
                 this.land=land;
                 toegelaten=true;
             }
         }
    	 if(!toegelaten)
    		 this.land="Belgie";
    	
    }
    // wat doet de functie landControle(..)?	Kijkt of de meegegeven String in de array staat
    // Indien ja, steekt hij deze String in de variabele land, anders steekt hij de String "Belgie" in variabele land.
    // wat is het nut van "toegelaten " ? waarom boolean ? Dit is een variabele om te bepalen of de meegegeven String in de array staat.
    // Boolean omdat het enkel true of false mag zijn
    
}
