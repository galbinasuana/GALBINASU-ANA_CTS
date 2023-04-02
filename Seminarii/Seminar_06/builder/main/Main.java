package builder.main;

import builder.Pacient;
import builder.PacientBuider;

public class Main {

	public static void main(String[] args) {
		PacientBuider pacientBuilder = new PacientBuider("Ion");
		Pacient pacient = pacientBuilder.setMicDejunInclus(true).setPatRabatabil(true).setPapuciDeCasa(true).build();
		Pacient pacientNou = new PacientBuider("Maria").setMicDejunInclus(true).setPatRabatabil(true).build();
		Pacient pacientNou2 = new PacientBuider("Vasile").build();
		Pacient pacientNou3 = pacientBuilder.setPatRabatabil(true).setNume("Ana").build();
		
		System.out.println(pacient.toString());
		System.out.println(pacientNou.toString());
		System.out.println(pacientNou2.toString());
		System.out.println(pacientNou3.toString());
	}

}
