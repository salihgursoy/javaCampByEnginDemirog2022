package kodlamaioDemo.entities;

public class Teacher {
	
	private String teacherFirstName;
	private String teacherLastName;
	
	public Teacher() {
	}

	public Teacher(String teacherFirstName, String teacherLastName) {
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
	}

	public String getTeacherFirstName() {
		return teacherFirstName;
	}

	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}

	public String getTeacherLastName() {
		return teacherLastName;
	}

	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}
	
	
	

}
