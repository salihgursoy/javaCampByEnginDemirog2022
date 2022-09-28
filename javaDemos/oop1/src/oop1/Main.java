package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnitPrice(6000);
		product1.setDiscount(5);
		product1.setUnitsInStock(3);
		product1.setImageUrl("makine1.jpg");

		Product product2 = new Product();
		product2.setName("A Marka Kahve Makinesi");
		product2.setUnitPrice(5000);
		product2.setDiscount(5);
		product2.setUnitsInStock(3);
		product2.setImageUrl("makine2.jpg");

		Product product3 = new Product();
		product3.setName("B Marka Kahve Makinesi");
		product3.setUnitPrice(3000);
		product3.setDiscount(5);
		product3.setUnitsInStock(3);
		product3.setImageUrl("makine3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		System.out.println("--------------------------------------------------------------------------------"); 
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer() ;
		individualCustomer.setId(777) ;
		individualCustomer.setPhone("123456789") ;
		individualCustomer.setCustomerNumber("145656") ;
		individualCustomer.setFirstName("Salih") ;
		individualCustomer.setLastName("Gürsoy") ;
		
		CorparateCustomer corparateCustomer = new CorparateCustomer() ;
		corparateCustomer.setId(888) ;
		corparateCustomer.setPhone("789546123") ;
		corparateCustomer.setCustomerNumber("1238") ;
		corparateCustomer.setCompanyName("Çötenni Tekstil") ;
		corparateCustomer.setTaxId("98897959") ;
		
		
		Customer[] customers = {individualCustomer,corparateCustomer} ;

	}

}
