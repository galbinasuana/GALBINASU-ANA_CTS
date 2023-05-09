package template.clase;

public class MasaLocala extends MasaRestaurant {

	public MasaLocala(int numarMasa) {
		super(numarMasa);
	}

	@Override
	protected void curataMasa() {
		System.out.println("Chelnerul curata masa pt persoanele care asteapta");
	}

	@Override
	protected void asazaServetele() {
		System.out.println("Se aseaza servetele pe masa " + getNumarMasa()+ " pt persoanele care asteapta");
	}

	@Override
	protected void asazaTacamuri() {
		System.out.println("Se aseaza tacamuri pe masa " + getNumarMasa()+ " pt persoanele care asteapta");
	}

	@Override
	protected void invitaPersoaneLaMasa() {
		System.out.println("Se invita persoanele care asteapta la masa " + getNumarMasa()+ "");
	}

}
