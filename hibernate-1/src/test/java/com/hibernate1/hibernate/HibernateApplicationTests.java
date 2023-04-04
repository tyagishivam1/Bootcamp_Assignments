package com.hibernate1.hibernate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

import java.util.List;

import static com.hibernate1.hibernate.Employeerepo.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class HibernateApplicationTests {
	@Autowired
	Employeerepo repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setAge(23);
		employee.setName("Shivam");
		employee.setLocation("Delhi");
		employee.setId(2);
		employee.setAge(20);
		employee.setName("Tyagi");
		employee.setLocation("Faridabad");
		repository.save(employee);
	}

	@Test
	public void testRead() {
		Employee employee = repository.findById(1).get();
		assertNotNull(employee);
		assertEquals("Shivam", employee.getName());
	}

	@Test
	public void testupdate() {
		Employee employee = repository.findById(1).get();
		employee.setAge(24);
		repository.save(employee);
	}

	@Test
	public void testdelete() {
		repository.deleteById(2);
	}

	@Test
	public void testcount() {
		System.out.print("Total Data>>>>>>>>>>>>>>>" + repository.count());
	}

	@Test
	public void testbyName() {
		List<Employee> employees = repository.findByName("Tyagi");
		employees.forEach(p -> System.out.println(p.getLocation()));
	}

	@Test
	public void testbyagebetween() {
		List<Employee> employees = repository.findByAgeBetween(28, 32);
		employees.forEach(p -> System.out.println(p.getName()));
	}
	@Test
	public void testbynameA() {
		List<Employee> employees = repository.findByNameLike("A%");
		employees.forEach(p -> System.out.println(p.getName()));
	}
	@Test
	public void testPagingandSorting() {
		Pageable pageable = PageRequest.of(0, 1, Sort.Direction.ASC, "age");
		Page<Employee> result=repository.findAll(pageable);
		result.forEach(p-> System.out.println(p.getName()));
	}
}
