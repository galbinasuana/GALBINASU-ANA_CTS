package template.clase;

public class MasaRezervata extends MasaRestaurant {
	
	private String oraRezervare;

	public MasaRezervata(int numarMasa, String oraRezervare) {
		super(numarMasa);
		this.oraRezervare = oraRezervare;
	}

	@Override
	protected void curataMasa() {
		System.out.println("Chelnerul curata masa "+ getNumarMasa()+ " pt rezervarea de la ora " + this.oraRezervare);
	}

	@Override
	protected void asazaServetele() {
		System.out.println("Se aseaza servetele pe masa " + getNumarMasa()+ " pt rezervarea de la ora " + this.oraRezervare);
	}

	@Override
	protected void asazaTacamuri() {
		System.out.println("Se aseaza tacamuri pe masa " + getNumarMasa() + " pt rezervarea de la ora " + oraRezervare);
	}

	@Override
	protected void invitaPersoaneLaMasa() {
		System.out.println("Se invita clientii la masa rezervata " + getNumarMasa()+ " la ora " + this.oraRezervare);
	}

}
