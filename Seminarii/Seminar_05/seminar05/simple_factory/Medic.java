package seminar05.simple_factory;

public class Medic implements PersonalSpital {
	
	private String nume;

	public Medic(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Medic: " + this.nume);
	}

}
