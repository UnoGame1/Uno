package packUno;

public class CartaMasDos extends CartaEspecial {
	//atributos
	private int valor=2;
	//constructora
	CartaMasDos(String pColor, int pNumero,int valor){
		super(pColor,pNumero);
	}
	public  int queNumeroSoy() {
		return(this.numero);
	}
	public  String queColorTengo() {
		return (this.color);
	}
	public int queValorTengo() {
		return(this.valor);
	}
	//public  void comoActuo(){

}
