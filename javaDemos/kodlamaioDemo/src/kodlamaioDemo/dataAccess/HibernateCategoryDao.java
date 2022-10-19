package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println( category.getCategoryName() + " Adlı Kategori hibernate ile veritabanına eklendi." );
	}

}
