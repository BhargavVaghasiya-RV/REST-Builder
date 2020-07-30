package com.liferay.student.details.internal.resource.v1_0;

import com.liferay.student.details.dto.v1_0.Student;
import com.liferay.student.details.resource.v1_0.StudentResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Ignek
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/student.properties",
	scope = ServiceScope.PROTOTYPE, service = StudentResource.class
)
public class StudentResourceImpl extends BaseStudentResourceImpl {

	@Override
	public Student getStudent() throws Exception {
		System.out.println("Fetching student details");
		Student student = new Student();
		student.setStudentName("Bhargav Vaghasiya");
		student.setStudentAddress("Ahmedabad, Gujarat");
		student.setStudentId(1);
		return student;
	}
	
}