package strategy.clase;

public class PlataCard implements ModPlata {

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		System.out.println("Clientul " + numeClient + " realizeaza plata cu cardul pentru suma de " + sumaPlata + ".");
	}

}
