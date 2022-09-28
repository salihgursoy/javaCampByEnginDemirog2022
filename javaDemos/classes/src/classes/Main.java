package classes;

public class Main {

	public static void main(String[] args) {

		// Referance Type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2 ;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		// Array sınıfı Reference type tır.
				int[] sayilar1 = {1,2,3} ;
				int[] sayilar2 = {4,5,6} ;
				sayilar2 = sayilar1 ;
				sayilar1[0] = 20 ;
				System.out.println(sayilar2[0]);
		
		//Value type
		int sayi1 = 5 ;
		int sayi2 = 10 ;
		sayi2 = sayi1 ;
		sayi1 = 15 ;
		System.out.println(sayi2);
		
		// STACK VE HEAP ARASINDAKİ İLİŞKİYİ HATIRLA.
		
		
		
	}

}
