package decorator.clase;

public abstract class Decorator implements INotaDePlata {
	
	private INotaDePlata notaDePlata;

	public Decorator(INotaDePlata notaDePlata) {
		super();
		this.notaDePlata = notaDePlata;
	}

	@Override
	public void printeazaNota(double totalDePlata) {
		this.notaDePlata.printeazaNota(totalDePlata);
	}
	
	public abstract void printeazaFelicitare();
}
