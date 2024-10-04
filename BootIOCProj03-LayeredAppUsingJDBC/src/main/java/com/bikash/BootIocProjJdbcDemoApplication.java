package com.bikash;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikash.controller.EmployeeController;
import com.bikash.model.Employee;

@SpringBootApplication
public class BootIocProjJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProjJdbcDemoApplication.class, args);
		EmployeeController empctrl=ctx.getBean("employeeController",EmployeeController.class);
		try {
			List<Employee> list=empctrl.getEmployee("Backend Developer","Frontend Developer","Web Developer");
			for(Employee emp:list)
			{
				System.out.println(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong..Try again !!");
		}//catch
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
