package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.TeacherManager;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.JdbcCategoryDao;
import kodlamaioDemo.dataAccess.JdbcTeacherDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Teacher;
import kodlamaioDemo.logging.DataBaseLogger;
import kodlamaioDemo.logging.FileLogger;
import kodlamaioDemo.logging.Logger;
import kodlamaioDemo.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
        Logger[] loggers = {new MailLogger(), new DataBaseLogger(), new FileLogger()};
        
        Category category1 = new Category("C++ Kursları");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);
        
        Teacher teacher1 = new Teacher("Engin", "Demiroğ");
        TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
        teacherManager.add(teacher1);
        
        Course course3 = new Course(3, "Yazılımcı Geliştirme Kursu C++", 0);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course3);
        
        Course course4 = new Course(4, "Yazılımcı Geliştirme Kursu C#", -5);
        courseManager.add(course4); //çalışmayacaktır çünkü kurala uymadı fiyat kısmında
        
	}
}
