package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC KODLARI YAZARAK VERİ TABANINA İLERDE KAYDEDİYOR OLACAĞIZ.
		
		System.out.println("Ürün eklendi " + product.getName() );
		
	}

}
