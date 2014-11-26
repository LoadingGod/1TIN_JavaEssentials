package be.pxl.bol;

public class Bol {
static final double PI = 3.14;
static int aantal = 0;
int straal, posX, posY, posZ;

public Bol (int beginStraal, int beginX, int  beginY, int beginZ) {
	straal = beginStraal;
	posX = beginX;
	posY = beginY;
	posZ = beginZ;
	++aantal;
}

public static int toonAantal() {
	return aantal;
}
public double toonVolume(){
	return 4.0/3.0*PI*straal*straal*straal;
}
}
