package chain.clase;

public class Client {
	
	private String nume;
	private String adresaMail;
	private String numarTelefon;
	
	public Client(String nume, String adresaMail, String numarTelefon) {
		super();
		this.nume = nume;
		this.adresaMail = adresaMail;
		this.numarTelefon = numarTelefon;
	}

	public String getNume() {
		return nume;
	}

	public String getAdresaMail() {
		return adresaMail;
	}

	public String getNumarTelefon() {
		return numarTelefon;
	}
	
}
