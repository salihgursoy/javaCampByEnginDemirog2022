package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product( 1 , "Laptop", "Asus Laptop", 3999 , 25, "Kırmızı") ;
		
		
		
		
		System.out.println(product.getName()) ;
		System.out.println(product.getKod()) ; // kod özelliğimiz sadece arkaplanda işlevi olduğu için sadece get ile okutturduk ancak set etmedik.
		ProductManager productManager = new ProductManager() ;
		productManager.Add(product) ;  //Yeni ürün eklemek için productmanager a Add ekledik ve burada tanıtıp çalıştırdık.
		
		
		
		
		
		// NOT: Bir class hem attribute tutup hem de operasyon içermemeli ki Solid prensibinin ilk kuralına uysun!
		
	}

}
