package com.test.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformtest implements IAnnotationTransformer
{

	public void transform(ITestAnnotation Annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		Annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
	}
