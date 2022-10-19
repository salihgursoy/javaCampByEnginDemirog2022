package kodlamaioDemo.business;

import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
        Category[] categories = {new Category(".Net Kurslerı"), new Category("Java Kursları"), new Category("Javascript Kursları")};
        for (Category x : categories) {
            if (category.getCategoryName() == x.getCategoryName()) {
                throw new Exception("Bu isimde bir katefori zaten mevcut!");
            }
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
	}
}