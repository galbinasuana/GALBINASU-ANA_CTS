package state.main;

import state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(15);
        masa.elibereazaMasa();
        masa.ocupaMasa();
        masa.rezervaMasa();
        masa.efectueazaRezervare();
        masa.ocupaMasa();
        masa.elibereazaMasa();
        masa.rezervaMasa();
	}

}
