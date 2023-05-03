package chain.main;

import chain.clase.Client;
import chain.clase.NotificareMail;
import chain.clase.NotificareManager;
import chain.clase.NotificareTelefon;
import chain.clase.Notificator;

public class Main {

	public static void main(String[] args) {
		Notificator notificatorTelefon = new NotificareTelefon();
		Notificator notificatorMail = new NotificareMail();
		Notificator notificatorManager = new NotificareManager();
		
//		notificatorTelefon.setSuccesor(notificatorMail);
//		notificatorMail.setSuccesor(notificatorManager);
		
		notificatorMail.setSuccesor(notificatorTelefon);
        notificatorTelefon.setSuccesor(notificatorManager);
		
		Client client1 = new Client("Ana", "mailana@gmail.com", "0722");
        Client client2 = new Client("Maria", "mailmaria@gmail.com", null);
        Client client3 = new Client("Ion", null, "0729");
        Client client4 = new Client("Vlad", null, null);
        
//        notificatorTelefon.notificaClient(client1, "mesaj");
//        notificatorTelefon.notificaClient(client2, "mesaj");
//        notificatorTelefon.notificaClient(client3, "mesaj");
//        notificatorTelefon.notificaClient(client4, "mesaj");
        
        notificatorMail.notificaClient(client1, "mesaj");
        notificatorMail.notificaClient(client2, "mesaj");
        notificatorMail.notificaClient(client3, "mesaj");
        notificatorMail.notificaClient(client4, "mesaj");
	}

}
