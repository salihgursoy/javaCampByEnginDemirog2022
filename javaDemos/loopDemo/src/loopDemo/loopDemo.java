package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		// for döngüsü
		
		for (int i=1; i<=10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("for ile Tek sayılar döngüsü bitti");
 		
		
		for (int i=0; i<=10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("for ile Çift sayılar döngüsü bitti");
		
		
		//while döngüsü
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while ile tek sayılar döngüsü bitti");
		
		
		
		// do-while döngüsü
		
		int j = 0;
		do {
			System.out.println(j);
			j+=2;
			} while(j<10);
		
		System.out.println("Do-While döngüsünü bitti");
		
	}

}
