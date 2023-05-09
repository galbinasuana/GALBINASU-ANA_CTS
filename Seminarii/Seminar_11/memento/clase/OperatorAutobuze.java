package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuze {

	private List<MementoAutobuz> listaMemento = new ArrayList<MementoAutobuz>();
	
	public void adaugaMemento(MementoAutobuz memento) {
        this.listaMemento.add(memento);
    }

    public MementoAutobuz getMemento(int pozitie) {
        return this.listaMemento.get(pozitie);
    }
	
}
