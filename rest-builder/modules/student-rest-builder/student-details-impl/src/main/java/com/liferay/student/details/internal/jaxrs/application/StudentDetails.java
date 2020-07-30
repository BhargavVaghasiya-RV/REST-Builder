package com.liferay.student.details.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author Ignek
 * @generated
 */
@Component(
	property = {
		"osgi.jaxrs.application.base=/student",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=student.details"
	},
	service = Application.class
)
@Generated("")
public class StudentDetails extends Application {
}