package com.hibernate1.hibernate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface Employeerepo extends CrudRepository<Employee,Integer>, PagingAndSortingRepository<Employee,Integer> {
    List<Employee> findByName(String name);
    List<Employee> findByAgeBetween(Integer age1,Integer age2);
    List<Employee> findByNameLike(String Name);
}
