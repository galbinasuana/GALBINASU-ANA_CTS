package seminar05.simple_factory;

public class Brancardier implements PersonalSpital {

	private String nume;
	
	public Brancardier(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Brancardier: " + this.nume);
	}

}
