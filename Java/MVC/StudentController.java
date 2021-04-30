public class StudentController {
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo)
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void setStudentLetterGrade(String letterGrade) {
		model.setLetterGrade(letterGrade);
	}

	public String getStudentLetterGrade() {
		return model.getLetterGrade();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo(), model.getLetterGrade());
	}

}