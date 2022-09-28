package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca() ;
		sayiBulmaca() ;
		sayiBulmaca() ;

	}

	public static void sayiBulmaca() {
	
		int[] sayilar = new int[] {5,10,15,20,25,30};
		int aranan = 23;
		boolean varMi = false;
		
		for ( int sayi : sayilar ) {
			if (sayi == aranan) {
				varMi = true;
			}
		}
		
		if (varMi) {
			mesajVer(aranan+ " burada mevcut."); // direk sistem out ile çıkış almak yerine sistem out fazlalığından kurtulmak için bir mesajVer fonksiyonun içine metnimizi koyduk. 
		} else {
			mesajVer(aranan+ " burada mevcut değil.");
		}
			
	}
	//Fonksiyonun methodunun içine ise bir sistem out ekledik ve methodun değişkenine bir mesaj stringi atadık böylece sistem out her çalıştığında bu mesajı çekcek. çünkü yukarda mesajVer içerisine ne yazarsam yazayım onu komple bir stringmiş gibi alacak.
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
