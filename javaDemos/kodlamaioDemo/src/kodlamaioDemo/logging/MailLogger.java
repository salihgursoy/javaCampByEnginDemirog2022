package kodlamaioDemo.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println( data + " Adlı Mail gönderildi "  );
		
	}
}
