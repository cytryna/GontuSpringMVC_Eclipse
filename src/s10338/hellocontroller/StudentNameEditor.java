package s10338.hellocontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {

		if (studentName.contains("Mr.") || studentName.contains("Ms.")) {
			setValue(studentName);
		} else {
			setValue("Lack of Gender "+ studentName);
		}
	}
	
}
