package composite.clase;

public class Produs implements Item {
	
	private String nume;

	public Produs(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		throw new Exception("Nu este implementat.");
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		throw new Exception("Nu este implementat.");
	}

	@Override
	public Item getItem(int index) throws Exception {
		throw new Exception("Nu este implementat.");
	}

	@Override
	public void descriere(String indentare) {
		System.out.println(indentare + this.nume);
	}
	
	

}
