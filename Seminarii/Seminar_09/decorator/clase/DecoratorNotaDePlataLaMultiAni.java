package decorator.clase;

public class DecoratorNotaDePlataLaMultiAni extends Decorator {

	public DecoratorNotaDePlataLaMultiAni(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}
	
	@Override
	public void printeazaNota(double totalDePlata) {
		super.printeazaNota(totalDePlata);
		System.out.println("La multi ani! - pe nota");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("La multi ani!");
	}

}
