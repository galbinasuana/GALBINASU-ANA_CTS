package decorator.clase;

public class NotaDePlata implements INotaDePlata {
	
	private String dataEmitere;

	public NotaDePlata(String dataEmitere) {
		super();
		this.dataEmitere = dataEmitere;
	}

	@Override
	public void printeazaNota(double totalDePlata) {
		System.out.println("Nota dumneavoastra de plata din " + this.dataEmitere + " este in valoare de " + totalDePlata + " lei.");
	}

}
