package com.liferay.student.details.resource.v1_0;

import com.liferay.portal.kernel.model.Company;
import com.liferay.student.details.dto.v1_0.Student;

import javax.annotation.Generated;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/student/v1.0
 *
 * @author Ignek
 * @generated
 */
@Generated("")
public interface StudentResource {

	public Student getStudent() throws Exception;

	public void setContextCompany(Company contextCompany);

}