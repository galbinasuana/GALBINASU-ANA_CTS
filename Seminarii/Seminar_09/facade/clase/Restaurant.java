package facade.clase;

public class Restaurant {
	
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;
	
	public Restaurant() {
		meseRestaurant = new MeseRestaurant();
		meseRestaurant.adaugaMasa(new Masa(true, true, 1));
		meseRestaurant.adaugaMasa(new Masa(false, false, 6));
		meseRestaurant.adaugaMasa(new Masa(true, false, 3));
		ospatar = new Ospatar();
		ospatar.debaraseaza(1);
		ospatar.debaraseaza(6);
	}
	
	public String verificareMasa(int nrMasa) {
		if(meseRestaurant.esteLibera(nrMasa)) {
			if(ospatar.esteDebarasata(nrMasa) && meseRestaurant.suntServeteleNoi(nrMasa)) {
				return "Masa este libera";
			} else {
				return "Masa este libera, asteptati sa se debaraseze";
			}
		} else {
			return "Masa nu este libera momentan";
		}
	}

}
