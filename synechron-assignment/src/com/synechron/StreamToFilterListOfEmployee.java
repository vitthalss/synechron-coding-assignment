package com.synechron;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vitthal.shirke
 * @description 1. To check java 8 features knowledge. a. Write program, using
 *              stream to filter list of employee where age is greater than 26
 *              and sort on first name.
 */
public class StreamToFilterListOfEmployee {
	public static void main(String a[]) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Nataraja G", "Accounts", 35));
		empList.add(new Employee("Nagesh Y", "Admin", 32));
		empList.add(new Employee("Vasu V", "Security", 27));
		empList.add(new Employee("Amar", "Entertinment", 25));

		// employees whose age are above 26
		empList.stream().filter(emp -> emp.getAge() > 26).forEach(System.out::println);
	}
}
