package packUno;

public class CartaDeCambioDeColor extends CartaEspecial {
		//atributos
		
		//constructora
		CartaDeCambioDeColor(String pColor, int pNumero,int valor){
			super(pColor,pNumero);
		}
		public  int queNumeroSoy() {
			return(this.numero);
		}
		public  String queColorTengo() {
			return (this.color);
		}
		//public  void comoActuo(){
	
  	}