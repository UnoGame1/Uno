package packUno;

public abstract class CartaEspecial extends Carta{
	
	//atributos
	
	
	//constructora
	CartaEspecial(String pColor, String pNombre){
		super(pColor,pNombre);
	}

	
	//otros metodos
	public abstract String queColorTengo();
	
	public abstract void comoActuo();
	

}
