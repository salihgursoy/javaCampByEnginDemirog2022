package kodlamaioDemo.business;

import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
    private Logger[] loggers;
    
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
        Course[] courses = {new Course(1, "2021 Beginner Kursu", 1500), new Course(2,"2022 Advance Kursu", 4500)};
        for (Course x : courses) {
            if (course.getCourseName() == x.getCourseName()) {
                throw new Exception("Bu isimde bir kurs zaten mevcut!");
            } else if (course.getUnitPrice() < 0) {
                throw new Exception("Kurs fiyatı 0 dan düşük olamaz!");
            }
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
    
    

    
    
    
    
    
}
