package state.clase;

public class Masa {
	private int numarRezervare;
	private Stare stare;
	
	public Masa(int numarRezervare) {
		super();
		this.numarRezervare = numarRezervare;
		stare = new StareLibera();
	}

	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}

	public int getNumarRezervare() {
		return numarRezervare;
	}
	
	public void rezervaMasa() {
        Stare rezervata = new StareRezervata();
        rezervata.schimbareStare(this);
    }
	
	public void ocupaMasa() {
        Stare ocupata = new StareOcupata();
        ocupata.schimbareStare(this);
    }

    public void elibereazaMasa() {
        Stare eliberata = new StareLibera();
        eliberata.schimbareStare(this);
    }

    public void efectueazaRezervare(){
        Stare ocupata = new StareOcupata();
        ocupata.schimbareStare(this);
    }
    
    public void anuleazaRezervare(){
        Stare libera = new StareLibera();
        libera.schimbareStare(this);
    }
	
	
}
