package state.clase;

public class StareRezervata implements Stare {

	@Override
	public void schimbareStare(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
            masa.setStare(this);
            System.out.println("Masa " + masa.getNumarRezervare() + " este REZERVATA.");
        } else {
            System.out.println("Masa nu poate fi rezervata");
        }
	}

}
