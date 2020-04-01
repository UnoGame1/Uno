package packUno;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaJugadores {
private ArrayList<Jugador> lista;
private static ListaJugadores miListaJugadores=null;

public ListaJugadores() {
	lista= new ArrayList<Jugador>();
}
public static synchronized ListaJugadores getmiListaJugadores() {
	if(ListaJugadores.miListaJugadores==null) {
		ListaJugadores.miListaJugadores=new ListaJugadores();
	}
	return ListaJugadores.miListaJugadores;
}
public int getNJugadores(){
	return this.lista.size();
	}
private Iterator<Jugador> getIterador(){
	return this.lista.iterator();
}
public void añadirJjugador(Jugador pJugador) {
	this.lista.add(pJugador);
}
public void eliminarJjugador(Jugador pJugador) {
	this.lista.remove(pJugador);}
public void quienHaGanado() {
	Jugador jugador=null;
	Iterator<Jugador> itr= this.getIterador();
	boolean hayGanador=false;
	while(itr.hasNext()&& !hayGanador) {
		jugador=itr.next();
		if(jugador.heGanado) {
			hayGanador=true;
			}
	}
	if(hayGanador) {
		System.out.println("Hay Un ganador");
	}
}
}