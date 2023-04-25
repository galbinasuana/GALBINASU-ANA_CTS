package composite.main;

import composite.clase.Item;
import composite.clase.Produs;
import composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		Item meniu = new Sectiune("Meniu Restaurant");
		
		Item sectiuneBauturi = new Sectiune("Bauturi");
        Item sectiuneStartere = new Sectiune("Startere");

        Item subsectiuniCafele = new Sectiune("Cafele");
        Item subsectiuneSucuri = new Sectiune("Sucuri");
        
        Item produsCafeaNeagra = new Produs("Cafea Neagra");
        Item produsCafeaArabica = new Produs("Cafea Arabica");
        Item produsCocaCola = new Produs("Coca-Cola");
        Item produsFanta = new Produs("Fanta");
        Item produsApaPlata = new Produs("Apa plata");
        Item bruschete = new Produs("Bruschete");
        
        try {
        	subsectiuniCafele.adaugareItem(produsCafeaNeagra);
        	subsectiuniCafele.adaugareItem(produsCafeaArabica);
        	subsectiuneSucuri.adaugareItem(produsCocaCola);
        	subsectiuneSucuri.adaugareItem(produsFanta);
        	
        	sectiuneBauturi.adaugareItem(produsApaPlata);
        	sectiuneBauturi.adaugareItem(subsectiuniCafele);
        	sectiuneBauturi.adaugareItem(subsectiuneSucuri);
        	sectiuneStartere.adaugareItem(bruschete);
        	
        	meniu.adaugareItem(sectiuneBauturi);
        	meniu.adaugareItem(sectiuneStartere);
        	meniu.descriere("   ");
        	
        } catch(Exception e) {
        	e.printStackTrace();
        }

	}

}
