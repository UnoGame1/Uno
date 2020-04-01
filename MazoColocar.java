package packUno;

import java.util.ArrayList;
import java.util.Iterator;

public class MazoColocar {
private ArrayList<Carta> lista;
private int nCartas;

public MazoColocar() {
	lista=new ArrayList<Carta>();
	
}

public void añadirCartas(Carta pCarta) {
	this.lista.add(pCarta);
}
private Iterator<Carta> getIterador(){
	return this.lista.iterator();
}
public Carta cartaDisponible() {
	
	Carta cartadisp=null;
	Iterator<Carta> itr=this.getIterador();
	while(itr.hasNext() && itr.next()!=null) {
		cartadisp=itr.next();
	}
	return cartadisp;
}
public boolean cartaCompatible(Carta pCarta) {
	Carta carta=this.cartaDisponible();
	if(carta.color==pCarta.color || carta.numero==pCarta.numero)
}
}