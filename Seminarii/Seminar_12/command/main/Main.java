package command.main;

import command.clase.Automobil;
import command.clase.CommandPlecareInCursa;
import command.clase.ManagerComenzi;
import command.clase.Autobuz;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
        Automobil autobuz = new Autobuz(13);

        managerComenzi.invocaComanda(new CommandPlecareInCursa(10,new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11,autobuz));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(12,new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11,autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10,new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
	}

}
