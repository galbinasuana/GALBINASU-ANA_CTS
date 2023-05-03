package chain.clase;

public class NotificareManager extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
		System.out.println("Pentru clientul " + client.getNume() + " nu avem date de contact.");
	}

}
