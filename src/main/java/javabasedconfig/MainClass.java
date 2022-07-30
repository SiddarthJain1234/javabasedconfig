package javabasedconfig;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new AnnotationConfigApplicationContext(EmpConfig.class);
		
		Employee EmpConfig=ctx.getBean(Employee.class);
		List<Character> workingdays=new ArrayList<Character>();
		workingdays.add('M');
		workingdays.add('T');
		workingdays.add('W');
		workingdays.add('T');
		workingdays.add('F');
		
		EmpConfig.setWorkingDays(workingdays);
		System.out.println(EmpConfig);
		
		
	}

}
