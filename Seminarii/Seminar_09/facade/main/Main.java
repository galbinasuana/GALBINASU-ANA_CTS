package facade.main;

import facade.clase.Restaurant;

public abstract class Main {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		System.out.println(restaurant.verificareMasa(1));
		System.out.println(restaurant.verificareMasa(6));
		System.out.println(restaurant.verificareMasa(3));
	}
}
