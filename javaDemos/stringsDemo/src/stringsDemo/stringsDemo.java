package stringsDemo;

public class stringsDemo {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava berbat!";
		System.out.println(mesaj);
		
		System.out.println(mesaj.replace(' ','-')); // boşluk yerine --- koydurttuk
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		System.out.println("-------------------------");
		for (String kelime : mesaj.split(" ")) // boşluk gördüğü yerden ayırdı ve kelimeye atadı,
			System.out.println(kelime);
		System.out.println("-------------------------");
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // metnin başındaki ve sonundaki boşluğu siler
		
		System.out.println("Karakter Sayısı = " +mesaj.length() );
		System.out.println("5. karakter = " +mesaj.charAt(4)); // 5. karakter için dizinin 4. elmanı çağrılır.
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("B")); // mesaj ! işareti ile bittiği için false çıktısı alınır.
		System.out.println(mesaj.indexOf("a")); //verilen karakterin konumunu metin başından bulur
		System.out.println(mesaj.lastIndexOf("r")); //verilen karakterin konumunu metin sonundan bulur
		System.out.println(mesaj.concat(" Lanet olsun!"));
		
		
		
		// yeni bir char dizisi oluşturup mesaj değişkeninin belirli konumdaki karakterlerini bu dizi içerisine atadık
		char[] karakterler = new char[15];
		mesaj.getChars(6, 16, karakterler, 5); // MANTIĞI ANLAMAK İÇİN ÇIKTIYA BAK. karşılaştır!
		System.out.println(karakterler);
		
		
		
		
	}

}
