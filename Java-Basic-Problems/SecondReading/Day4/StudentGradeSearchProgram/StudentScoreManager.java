package SecondReading.Day4.StudentGradeSearchProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentScoreManager {
	private Map<String, Student> studentMap = new HashMap<>();
	
	public void addStudent(Student student) {
		String studentId = student.getStudentId();
		if(studentMap.containsKey(studentId)) {
	        System.out.println("이미 등록된 학생입니다");
	        return;
	    }
		studentMap.put(student.getStudentId(), student);
	}
	
	public Student findStudent(String studentId) {
		if(!validateStudentId(studentId, studentMap)) {
			return null;
		}
		return studentMap.get(studentId);
	}
	
	public void updateScore(String studentId, int newScore) {
		if(!validateStudentId(studentId, studentMap)) {
			return;
		}
		Student updateStudent = studentMap.get(studentId);
		studentMap.put(studentId, new Student(updateStudent.getStudentId(), updateStudent.getName(), newScore));
		System.out.println("[" + studentId + "]\t점수 업데이트 완료");
	}
	
	public void removeStudent(String studentId) {
		if(!validateStudentId(studentId, studentMap)) {
			return;
		}studentMap.remove(studentId);
	}
	
	public void printAllStudents() {
		Set<String> keySet = studentMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Student v = studentMap.get(k);
			System.out.println(k+ " [" + v + "]");
		}
	}
	
	public static boolean validateStudentId(String studentId, Map<String, Student> studentMap) {
		if(!studentMap.containsKey(studentId)) {
			System.out.println("해당 학생이 없습니다");
			return false;
		}
		return true;
	}

}
