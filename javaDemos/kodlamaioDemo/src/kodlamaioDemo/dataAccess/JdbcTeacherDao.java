package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println( teacher.getTeacherFirstName() + teacher.getTeacherLastName() + " Adlı Öğretmen jdbc ile veritabanına eklendi=> " );
	}

}
