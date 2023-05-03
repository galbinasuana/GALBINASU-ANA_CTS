package observer.clase;

public interface Subject {
	void adaugareObserver(Observer observer);
	void stergereObserver(Observer observer);
	void notificareAbonati(String mesaj);
}
