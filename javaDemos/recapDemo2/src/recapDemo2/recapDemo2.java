package recapDemo2;

public class recapDemo2 {

	public static void main(String[] args) {
		
		double[] numberList = {1.2,1.6,4.5,8.9,10.3} ;
		double total = 0;
		double max = numberList[0];
		
		for (double number:numberList) {
			
			if(max<number) {
				max=number;
			}
			
			total = total + number;
			System.out.println(number);
			
			
		}
		
		System.out.println("TOPLAM = "+total);
		System.out.println("EN BÜYÜK SAYI = "+max);
		

	}

}
