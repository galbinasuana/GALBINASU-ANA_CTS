package decorator.clase;

public class DecoratorNotaDePlataPasteFericit extends Decorator {

	public DecoratorNotaDePlataPasteFericit(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}
	
	@Override
	public void printeazaNota(double totalDePlata) {
		super.printeazaNota(totalDePlata);
		System.out.println("Paste fericit! - pe nota");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Paste fericit!");
	}

}
