package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorNotaDePlataLaMultiAni;
import decorator.clase.DecoratorNotaDePlataPasteFericit;
import decorator.clase.INotaDePlata;
import decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		INotaDePlata notaDePlata = new NotaDePlata("2023-04-25");
        notaDePlata.printeazaNota(250);

        Decorator decorator = new DecoratorNotaDePlataLaMultiAni(notaDePlata);
        decorator.printeazaNota(250);
        decorator.printeazaFelicitare();

        System.out.println();
        Decorator decorator2 = new DecoratorNotaDePlataPasteFericit(decorator);
        decorator2.printeazaNota(250);
        decorator2.printeazaFelicitare();
	}

}
