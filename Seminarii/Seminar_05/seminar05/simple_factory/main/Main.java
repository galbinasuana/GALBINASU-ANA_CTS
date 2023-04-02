package seminar05.simple_factory.main;

import java.util.ArrayList;
import java.util.List;

import seminar05.simple_factory.Factory;
import seminar05.simple_factory.PersonalSpital;
import seminar05.simple_factory.TipPersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital medic = factory.createInstance(TipPersonalSpital.MEDIC, "Popescu");
		PersonalSpital asistent = factory.createInstance(TipPersonalSpital.ASISTENT, "Ionescu");
		PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.BRANCARDIER, "Vasilescu");
		
		medic.descriere();
		asistent.descriere();
		brancardier.descriere();
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(medic);
		listaPersonal.add(asistent);
		listaPersonal.add(brancardier);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER, "Marinescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Gavrilescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC, "Andreescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Cristescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ANESTEZIST, "Georgescu"));
		
		for(PersonalSpital personal:listaPersonal) {
			personal.descriere();
		}
		
	}

}
