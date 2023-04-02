package seminar05.factory_method;

public class FactoryAsistent implements Factory {

	@Override
	public PersonalSpital createPersonal(String nume) {
		return new Asistent(nume);
	}

}
