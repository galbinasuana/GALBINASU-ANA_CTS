package observer.main;

import observer.clase.Observer;
import observer.clase.ClientRestaurant;
import observer.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("Bonita");
		
		Observer client1 = new ClientRestaurant("Vlad");
        Observer client2 = new ClientRestaurant("Bogdan");
        Observer client3 = new ClientRestaurant("Mihai");

        restaurant.adaugareObserver(client1);
        restaurant.adaugareObserver(client2);
        restaurant.notificareOfertaPret();

        restaurant.stergereObserver(client2);
        restaurant.adaugareObserver(client3);
        restaurant.notificaSchimbareMeniu();
	}

}
