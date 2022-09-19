package miniProjeAsalSayi;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		
		
		
		int number = 2;
		boolean isPrime = true;
		
		          // defensive coding (bugları yani istisnaları çözümleme)
						if (number == 1 ) {
							System.out.println("sayı asal değildir.");
							return; // fonksiyonu bitirir ve aşşağıyı çalıştırmaz.
						} if (number < 1 ) {
							System.out.println("sayı geçersizdir.");
							return; // fonksiyonu bitirir ve aşşağıyı çalıştırmaz.
						}
		
				
	for (int i = 2; i <number; i++) {			
		
		if ( number % i == 0) { //  remainder "%" operatörü bölme işlemi sonrası kalanı bulur.
			isPrime = false;
			} 
	}
		
						if (isPrime == true) {
							System.out.println("sayı asaldır");
						} else {
							System.out.println("sayı asal değildir");
						}
						
		
		
		
		
	}

}
