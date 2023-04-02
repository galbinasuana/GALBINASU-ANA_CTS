package seminar05.factory_method;

public class FactoryInfirmier implements Factory {

	@Override
	public PersonalSpital createPersonal(String nume) {
		return new Infirmier(nume);
	}

}
