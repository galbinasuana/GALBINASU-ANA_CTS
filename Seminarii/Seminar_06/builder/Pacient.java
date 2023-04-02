package builder;

public class Pacient {
	private String nume;
	private Boolean patRabatabil;
	private Boolean micDejunInclus;
	private Boolean papuciDeCasa;
	
	public Pacient(String nume, Boolean patRabatabil, Boolean micDejunInclus, Boolean papuciDeCasa) {
		super();
		this.nume = nume;
		this.patRabatabil = patRabatabil;
		this.micDejunInclus = micDejunInclus;
		this.papuciDeCasa = papuciDeCasa;
	}
	
	public Pacient() {
		super();
		this.nume = "Popescu";
		this.patRabatabil = false;
		this.micDejunInclus = false;
		this.papuciDeCasa = false;
	}
	
	

	public String getNume() {
		return nume;
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	public Boolean getPatRabatabil() {
		return patRabatabil;
	}

	protected void setPatRabatabil(Boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}

	public Boolean getMicDejunInclus() {
		return micDejunInclus;
	}

	protected void setMicDejunInclus(Boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
	}

	public Boolean getPapuciDeCasa() {
		return papuciDeCasa;
	}

	protected void setPapuciDeCasa(Boolean papuciDeCasa) {
		this.papuciDeCasa = papuciDeCasa;
	}

	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus
				+ ", papuciDeCasa=" + papuciDeCasa + "]";
	}
	
	

}
