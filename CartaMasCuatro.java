package packUno;

public class CartaMasCuatro extends CartaEspecial {
	//atributos
	private int valor;
	//constructora
	CartaMasCuatro(String pColor, String pNombre ,int valor){
		super(pColor,pNombre);
		this.valor=4;
	}
	//public  void comoActuo(){
	@Override
	public void comoActuo() {
		
	}
	@Override
	public String getMiColor() {

		return this.color;
	}
	@Override
	public String getMiNombre() {
		return this.color;
	}
	@Override
	public String queColorTengo() {
		// TODO Auto-generated method stub
		return null;
	}

}