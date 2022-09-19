package recapDemo1;

public class recapDemo1 {

	public static void main(String[] args) {
		// En büyük sayıyı bulma
		
		int sayi1 = 20 ;
		int sayi2 = 15 ; 	
		int sayi3 = 30 ;
		
		int enBuyuk = sayi1 ;
		
		
		if (enBuyuk<sayi2) {
		enBuyuk=sayi2;
		} 
		
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En Büyük Sayı= "+enBuyuk);

	}

}
