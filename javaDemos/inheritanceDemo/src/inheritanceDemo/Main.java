package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla() ;
	
	
	KrediUI krediUI = new KrediUI() ;
	//POLİMORFİZM 
		krediUI.KrediHesapla(new OgretmenKrediManager()) ;
		krediUI.KrediHesapla(new AskerKrediManager()) ;
		krediUI.KrediHesapla(new TarimKrediManager()) ;
	//Üçüde BaseKrediManager a bağlı, BaseKrediManager ise KrediUI daki sysout a bağlı ve yukardakiler BaseKrediManager ın parentları olduğu için hepsi de çalışabilir KrediUI içerisinde. Bu sayede tekrar tekrar ilk satırrdaki gibi tanımlamayız.
	}
}
