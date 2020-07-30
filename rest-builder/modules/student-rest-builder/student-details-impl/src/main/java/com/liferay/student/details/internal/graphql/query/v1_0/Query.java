package com.liferay.student.details.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.student.details.dto.v1_0.Student;
import com.liferay.student.details.resource.v1_0.StudentResource;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;

import javax.annotation.Generated;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Ignek
 * @generated
 */
@Generated("")
public class Query {

	public static void setStudentResourceComponentServiceObjects(
		ComponentServiceObjects<StudentResource>
			studentResourceComponentServiceObjects) {

		_studentResourceComponentServiceObjects =
			studentResourceComponentServiceObjects;
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Student getStudent() throws Exception {
		return _applyComponentServiceObjects(
			_studentResourceComponentServiceObjects,
			this::_populateResourceContext,
			studentResource -> studentResource.getStudent());
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(StudentResource studentResource)
		throws Exception {

		studentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private static ComponentServiceObjects<StudentResource>
		_studentResourceComponentServiceObjects;

}