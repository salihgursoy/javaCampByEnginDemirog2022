package recapDemoClasses;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(5,10) ;
		int sonuc1 = dortIslem.bölme(10, 2) ;
		int sonuc2 = dortIslem.cikarma(80, 30) ;
		
		System.out.println(sonuc);
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		
		

	}

}
