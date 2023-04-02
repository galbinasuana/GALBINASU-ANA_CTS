package seminar05.factory_method.main;


import java.util.ArrayList;
import java.util.List;

import seminar05.factory_method.Factory;
import seminar05.factory_method.FactoryAsistent;
import seminar05.factory_method.FactoryBrancardier;
import seminar05.factory_method.FactoryInfirmier;
import seminar05.factory_method.FactoryMedic;
import seminar05.factory_method.Infirmier;
import seminar05.factory_method.PersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory fabricaAsistenti = new FactoryAsistent();
		Factory fabricaMedici = new FactoryMedic();
		Factory fabricaBrancardieri = new FactoryBrancardier();
		Factory fabricaInfirmier = new FactoryInfirmier();
		Infirmier infirmier = (Infirmier) fabricaInfirmier.createPersonal("Georgescu");
		infirmier.setAniVechime(15);
	
		List<PersonalSpital> listaPersonal = new ArrayList<>(); 
		listaPersonal.add(fabricaAsistenti.createPersonal("Popescu"));
		listaPersonal.add(fabricaMedici.createPersonal("Ionescu"));
		listaPersonal.add(fabricaBrancardieri.createPersonal("Marinescu"));
		listaPersonal.add(infirmier);
		
		for(PersonalSpital personal:listaPersonal) {
			personal.descriere();
		}
		

	}

}
