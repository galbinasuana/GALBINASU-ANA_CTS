package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterClaseRestaurant;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
	
	public static void imprimare(ISoftRestaurant restaurant, double totalNota) {
		restaurant.printeazaNota(totalNota);
	}

	public static void main(String[] args) {
		ISoftBar bar = new SoftBar("Alcadibo");
//		bar.printeazaNotaBauturi(240);
		
		ISoftRestaurant bucatarie = new Bucatarie("george");
//		bucatarie.printeazaNota(300);
		
//		Main.imprimare(bar, 300);
		imprimare(bucatarie, 500);
		
		AdapterClaseRestaurant adapterClase = new AdapterClaseRestaurant("Alcadibo");
		imprimare(adapterClase, 450);
		
		AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
		imprimare(adapterObiecte, 150);
	}

}
