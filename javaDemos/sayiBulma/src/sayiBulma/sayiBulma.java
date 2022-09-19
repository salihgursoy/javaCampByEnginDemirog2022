package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {5,10,15,20,25,30};
		int aranan = 15;
		boolean varMi = false;
		
		for ( int sayi : sayilar ) {
			if (sayi == aranan) {
				varMi = true;
			}
		}
		
		if (varMi) {
			System.out.println(aranan+ " burada mevcut.");
		} else {
			System.out.println(aranan+ " burada mevcut değil.");
		}
		
		
		
		
	}

}
