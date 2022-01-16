package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {

		if (code != null) {
			return code.startsWith(coursePrefix);

		} else
			return true;
	}

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}

}
