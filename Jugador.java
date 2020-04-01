package packUno;

public class Jugador {
private String nombre;
private CartasEnMiMano mano;
public Jugador(String pNombre) {
	this.nombre=pNombre;
}
public int getNCartas() {
	//
}
public boolean HeGanado() {
	boolean heGanado=false;
	if(this.getNCartas()=0) {
		heGanado=true;
	}
	return heGanado;
}
public void robarrCarta() {
	//
}
public void colocarCarta() {
}

public void elegirCarta
}