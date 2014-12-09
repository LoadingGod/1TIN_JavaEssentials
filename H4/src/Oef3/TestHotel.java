package Oef3;

public class TestHotel {

	
	public static void main(String[] args) {
// wat is de methode "main" ? Deze methode wordt altijd uitgevoerd als de klasse gerund wordt (moet niet opgeroepen worden)
// wat betekent static ?	Deze methode kan uitgevoerd worden op de klasse zelf, niet op een object 
// wat betekent void ?	Geeft geen datatype terug 
// welk datatype is args ? String
// waarvoor staat String [] ? Array van Strings
// wanneer wordt er gewerkt met args ? Deze wordt geset in runtime configuration 


		Gast gast1=new Gast();
// wat is gast1 ?	object van de klasse Gast
// wat gebeurt er bij new ? aanmaken van een nieuw object van deze klasse
		
		Gast gast2=new Gast("Zoons Pieter","Nederland");
		Gast gast3=new Gast(3, "Peeters Wim","Duitsland");
		Gast gast5 = new Gast(args[0], args[1]);
// vergelijk de new van gast1,gast2,gast3 	Constructor overloading
		
		gast1.wijzigLand("Belgi�");
		gast1.wijzigNummer(1);
		gast1.wijzigNaam("Aerts Jef");
// wat gebeurt er bij de oproep van de methode wijzigNummer ?	Methode wijzigNummer uitvoeren op object gast1 en een int 1 meegeven 
// welke relatie bestaat er tussen gast1 en de wijzig...functies ?	Associatie-relatie 
		
		
		gast1.drukAf();
		gast2.drukAf();
		gast3.wijzigLand("Spanje");
		gast3.drukAf();
		gast5.drukAf();
// wat gebeurt er bij de oproep van deze methode ? nummer, naam en land worden afgedrukt tenzij naam leeg is
// voor wie wordt deze methode opgeroepen ? object gast3
		   
// doe de volgende uitbreidingen : 
//
//  1. Een gast-object kan ook aangemaakt worden met alleen een nummer
//	   De naam en land worden dan beide "onbekend".
//			     
		
//	2. Het nummer, de naam en het land kunnen als argumenten bij de main meegegeven worden.
//	   Declareer een object gast5 op deze manier.
//		

	}

}
