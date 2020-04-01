package packUno;

public abstract class Carta {
protected String color;
protected String nombre;

//constructora
public Carta(String pColor,String pNombre) {
	this.color=pColor;
	this.nombre=pNombre;
}

public abstract String getMiColor() ;
	
public abstract String getMiNombre() ;
}
