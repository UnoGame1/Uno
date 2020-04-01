package packUno;
import java.util.ArrayList;
import java.util.Iterator;

public class Baraja {
	//atributos
	private ArrayList<Carta>lista;
	private static Baraja miBaraja=null;
	//constructora
	private Baraja() {
		this.lista =  new ArrayList<Carta>();
	}
	//otros metodos
	public static synchronized Baraja getBaraja() {
		if (Baraja.miBaraja==null) {
			Baraja.miBaraja=new Baraja();
		}
		return(Baraja.miBaraja);
	}
	private Iterator<Carta> getIterador(){
		return(this.getIterador());
	}
	public int numCartasTotales() {
		return(this.lista.size());
	}
	public void repartirCartas(){
		
	}
	public void actualizarBaraja(){
		this.lista=new ArrayList<Carta>();
		
	}
}
