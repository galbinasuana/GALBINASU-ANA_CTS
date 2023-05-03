package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {
	
	private String nume;
	private List<Observer> clientiAbonati;
	
	public Restaurant(String nume) {
		this.nume = nume;
        this.clientiAbonati = new ArrayList<>();
	}

	@Override
	public void adaugareObserver(Observer observer) {
		clientiAbonati.add(observer);
	}

	@Override
	public void stergereObserver(Observer observer) {
		clientiAbonati.remove(observer);
	}

	@Override
	public void notificareAbonati(String mesaj) {
		for(Observer observer:clientiAbonati) {
			observer.receptioneazaNotificare(mesaj);
		}
	}
	
	public void notificareOfertaPret() {
		notificareAbonati(this.nume + ": Sunt reduceri de pret la shaorma.");
	}
	
	public void notificaSchimbareMeniu() {
		notificareAbonati(this.nume + " Sunt reduceri la fructe de mare.");
	}

}
