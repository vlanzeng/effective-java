package com.effective.java.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface Moon {
			
			
}
