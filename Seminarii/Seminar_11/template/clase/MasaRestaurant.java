package template.clase;

public abstract class MasaRestaurant {
	
	private int numarMasa;

	public MasaRestaurant(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
	}
	
	public int getNumarMasa() {
		return numarMasa;
	}

	protected abstract void curataMasa();
	protected abstract void asazaServetele();
	protected abstract void asazaTacamuri();
	protected abstract void invitaPersoaneLaMasa();
	 
	public final void ocupaMasa() {
		curataMasa();
		asazaServetele();
		asazaTacamuri();
		invitaPersoaneLaMasa();
	}
}
