package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println( course.getCourseName() + " Adlı Kurs hibernate ile veritabanına eklendi.");
		
	}

}
