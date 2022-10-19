package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " Adlı Kategori jdbc ile veritabanına eklendi.");
	}

}
