package seminar05.factory_method;

public class FactoryBrancardier implements Factory {

	@Override
	public PersonalSpital createPersonal(String nume) {
		return new Brancardier(nume);
	}

}
