package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftRestaurant {
	
	private String bucatar;
	
	public Bucatarie(String bucatar) {
		super();
		this.bucatar = bucatar;
	}

	@Override
	public void printeazaNota(double totalSuma) {
		System.out.println("Bucatarul " + this.bucatar);
		System.out.println("Nota dumneavoastra este in valoare de " + totalSuma);
	}

}
