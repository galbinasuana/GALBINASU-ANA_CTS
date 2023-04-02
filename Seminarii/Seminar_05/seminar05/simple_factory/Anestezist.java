package seminar05.simple_factory;

public class Anestezist implements PersonalSpital {
	
	private String nume;

	public Anestezist(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Anestezist: " + this.nume);
	}
	
	

}
