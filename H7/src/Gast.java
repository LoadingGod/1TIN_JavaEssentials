public class Gast
{
    private int nummer;
    private String naam;
    private String land;
    
    private static String toegelatenLand[]={"Belgi�","Nederland","Duitsland","Frankrijk","Spanje"};

    
    public Gast()
    { 
    	naam = "onbekend";
    	land = "onbekend";
    }   
    
    public Gast(String naam, String land) {
        this.naam=naam;
        landControle(land);
        this.nummer=99;
       
    }
    public Gast(int nummer, String naam, String land) {
        this.nummer=nummer;
        this.naam=naam;
        landControle(land);
       
    }
    public Gast(int nummer){
    	this();
    	this.nummer=nummer;
    	
    }
    
 
    public void wijzigLand(String land) {
       landControle(land);
    }

    public void wijzigNummer(int nr){
    	this.nummer=nr;
    }


    public void wijzigNaam(String naam){
    	this.naam=naam;
    }
    
   
      
    public void drukAf() {
    	if(naam != null){
    		System.out.println("\t \t Gast nr "+nummer+" = "+naam+" - herkomst = "+land);
    		
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
    
}
