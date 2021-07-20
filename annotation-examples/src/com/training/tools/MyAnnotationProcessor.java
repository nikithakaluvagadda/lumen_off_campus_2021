package com.training.tools;

import com.training.Employee;
import com.training.stereotypes.Example;

import java.lang.reflect.*;
public class MyAnnotationProcessor {

	public static void main(String[] args) {
		
		
		Employee  suresh = new Employee();
		
		
		Class<?> classRef = suresh.getClass();
		
		try {
			Method  methodRef = classRef.getMethod("showDetails");
			
			
			                   
			
			Example anno = methodRef.getAnnotation(Example.class);
			             
			
			StringBuffer buffer = new StringBuffer(anno.title());
			 buffer.append(anno.version());
			 
			System.out.println("Annotation Processing Result"+ buffer.toString());
			Example anno1 = classRef.getAnnotation(Example.class);
			StringBuffer buffer1 = new StringBuffer(anno1.title());
			 buffer1.append(anno1.version());
			 
			System.out.println("Annotation Processing Result"+ buffer1.toString());
			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
	}
}
