package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println( teacher.getTeacherFirstName()  + teacher.getTeacherLastName() + " Adlı Öğretmen hibernate ile veritabanına eklendi=> " );
	}

}
