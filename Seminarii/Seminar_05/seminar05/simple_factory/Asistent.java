package seminar05.simple_factory;

public class Asistent implements PersonalSpital {
	
	private String nume;

	public Asistent(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Asistent: " + this.nume);
	}
	
	

}
