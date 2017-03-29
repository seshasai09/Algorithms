package oop;
import static org.junit.Assert.assertEquals;

import java.util.stream.DoubleStream;

import org.junit.Test;

import basics.Student;

public class TestStudent {
	
	@Test
	public void testStudentClass(){
		Student s1 = new Student("Tom",4);
		String[] courses_s1={"Maths","Physics","CSFundamentals","English"};
		s1.setAddress("Seattle");
		s1.setCourses(courses_s1);
		double[] grades_s1 = {4,3.5,3.7,3.5};
		s1.setGrades(grades_s1);
		String studen1 = "Tom"+"-"+"Seattle"+"-"+String.valueOf(4);
		assertEquals("similar student objects", studen1, s1.toString());
		
		assertEquals(s1.getAverageGrade().getAsDouble(),DoubleStream.of(grades_s1).average().getAsDouble(),.000001);
	}

}
