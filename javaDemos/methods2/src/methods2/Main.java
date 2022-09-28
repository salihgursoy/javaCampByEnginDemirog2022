package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel." ;
		
		String yeniMesaj = sehirVer() ;
		System.out.println(yeniMesaj) ;
		
		int sayi = topla(7,8) ;
		System.out.println(sayi);	
		
		int sayi2 = topla2(7,8,9,5,1,2,3,56562,4,7,5,112,85) ;
		System.out.println(sayi2);		
		
		
	}
	
	//Variable Arguments (işlem elemanlarını otomatik olarak değişken olarak ekler. Tek tek int girmemeize gerek kalmaz.)
	public static int topla2(int... sayilar) {
		
		int toplam = 0;
		
		for (int sayi : sayilar) {
			toplam+= sayi ;
		}
		
		return toplam ;
	}
	
	
	
	// Bir nevi hesap makinesi
		public static int topla(int sayi1, int sayi2) {
			return sayi1 + sayi2 ;
		}
	
		
		
	//Fonksiyon tanımlarken değerine dikkat edilmeli. Örneğin void bir fonsiyondan sadece void bir değerin çıktısı alınabilir. 
	public static String sehirVer() {
		return "Ankara" ;
	}
	
	
	
	// Bu gibi fonksiyonlarla veriler üzerinde işlem yaptırabiliriz. Tabiki system out sadece göstermelik.
		public static void ekle() {
		    System.out.println("ekle");
		}
					public static void sil() {
						System.out.println("sil");
					}
							public static void guncelle() {
								System.out.println("guncelle");
							}
		
	
}
