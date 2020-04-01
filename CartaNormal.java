package packUno;

public class CartaNormal extends Carta{
	private int numero;
	
	public CartaNormal(String pColor, String pNombre, int pNumero) {
		super(pColor, pNombre);
		this.numero=pNumero;
	}
	@Override
	public String getMiColor() {
		return this.color;
	}

	@Override
	public String getMiNombre() {
		return this.nombre;
	}
	public int getMiNumero() {
		return this.numero;
	}
}
