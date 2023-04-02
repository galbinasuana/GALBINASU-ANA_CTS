package builder;

public class PacientBuider implements Builder {
	
	private Pacient pacient;
	
	public PacientBuider(String nume) {
		this.pacient = new Pacient();
		this.setNume(nume);
	}

	@Override
	public Pacient build() {
		return this.pacient;
	}
	

	public PacientBuider setNume(String nume) {
		this.pacient.setNume(nume);
		return this;
	}


	public PacientBuider setPatRabatabil(Boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil); 
		return this;
	}


	public PacientBuider setMicDejunInclus(Boolean micDejunInclus) {
		this.pacient.setMicDejunInclus(micDejunInclus); 
		return this;
	}


	public PacientBuider setPapuciDeCasa(Boolean papuciDeCasa) {
		this.pacient.setPapuciDeCasa(papuciDeCasa);
		return this;
	}


}
