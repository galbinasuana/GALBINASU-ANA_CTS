package template.main;

import template.clase.MasaLocala;
import template.clase.MasaRestaurant;
import template.clase.MasaRezervata;

public class Main {

	public static void main(String[] args) {
		MasaRestaurant masa=new MasaLocala(4);
        masa.ocupaMasa();
        
        System.out.println();
        
        MasaRestaurant masaRezervata=new MasaRezervata(5,"12:00");
        masaRezervata.ocupaMasa();
	}

}
