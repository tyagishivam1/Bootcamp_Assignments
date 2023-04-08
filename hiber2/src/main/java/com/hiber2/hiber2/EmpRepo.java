package com.hiber2.hiber2;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpRepo extends CrudRepository<Employee,Integer> {
//        JPQL QUESTIONS
        @Query("select firstname,lastname from Employee where salary>(select Avg(salary) from Employee order by age) order by salary desc")
        List<Object[]> findfname();

        @Query("select AVG(salary) from Employee")
        Integer AvgSalary();
        @Modifying
        @Query("update Employee set salary=:newsalary where salary<:avg")
        Integer UpdateSalary(@Param("avg") Integer avg, @Param("newsalary") int newsalary);
        @Query("select Min(salary) from Employee")
        Integer FindMinSal();
        @Modifying
        @Query("delete from Employee where salary=:minsal")
        Integer deleteForMinSal(@Param("minsal") Integer min);
//        NATIVE SQL QUERY
        @Query(value ="select id,emp_first_name,age from employee_table where emp_last_name Like '%singh%'",nativeQuery = true)
        List<Object[]> findFirstname();
        @Modifying
        @Query(value = "delete from employee_table where age<:age", nativeQuery = true)
        void testDeleteAge(@Param("age") int age);




}
