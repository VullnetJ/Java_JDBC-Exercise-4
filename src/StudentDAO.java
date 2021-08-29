

import java.util.List;

	public interface StudentDAO {
		   public List<Student> getAllStudents();
		   public void updateStudent(Student student);
		   public Student getStudentByID(int studentId);
		   public void deleteStudent(Student student);

		
		   	
}
