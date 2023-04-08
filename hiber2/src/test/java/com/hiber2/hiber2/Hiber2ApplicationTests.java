package com.hiber2.hiber2;

import com.hiber2.hiber2.ComponentMapping.Emp;
import com.hiber2.hiber2.ComponentMapping.EmpEmbedrepo;
import com.hiber2.hiber2.ComponentMapping.Salary;
import com.hiber2.hiber2.Paymentjoin.Check_join;
import com.hiber2.hiber2.Paymentjoin.Credit_join;
import com.hiber2.hiber2.Paymentjoin.Payment_joinrepository;
import com.hiber2.hiber2.SINGLE.Check;
import com.hiber2.hiber2.SINGLE.Credit;
import com.hiber2.hiber2.SINGLE.Paymentrespository;
import com.hiber2.hiber2.TablePerclass.Bank_Check;
import com.hiber2.hiber2.TablePerclass.Credit_card;
import com.hiber2.hiber2.TablePerclass.Payment_Tablerepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class Hiber2ApplicationTests {

	@Autowired
	EmpEmbedrepo embeddedrepository;
	@Autowired
	EmpRepo repository;
	@Autowired
	 Paymentrespository payrepository;
	@Autowired
	Payment_joinrepository payjoinrepo;

	@Autowired
	Payment_Tablerepository payytablerepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testcreate() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstname("Shiv");
		emp.setLastname("Tyagi");
		emp.setAge(53);
		emp.setSalary(25000);
		repository.save(emp);
	}

	@Test
	public void findfname() {
		List<Object[]> result = repository.findfname();
		for (Object[] objects : result) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	@Transactional
	@Rollback(value = false)
	@Test
	public void UpdateSalary() {
		System.out.println(repository.UpdateSalary((repository.AvgSalary()), 45000));
	}

	@Test
	public Integer Minsal() {
		Integer minsalary = repository.FindMinSal();
		return minsalary;
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testDeleteByMinSalary() {
		repository.deleteForMinSal(repository.FindMinSal());
	}

	@Test
	public void testFirstname() {
		List<Object[]> result = repository.findFirstname();
		for (Object[] object : result) {
			System.out.println(object[0]);
			System.out.println(object[1]);
			System.out.println(object[2]);
		}
	}

	@Test
	@Transactional
	@Rollback
	public void testDelete() {
		repository.testDeleteAge(45);
	}

	@Test
	public void createpayement_single() {
		Credit credit1 = new Credit();
		credit1.setId(122);
		credit1.setCreditcard("7636648499");
		credit1.setAmount(20000);
		payrepository.save(credit1);
	}

	@Test
	public void createpayement_single_check() {
		Check check1 = new Check();
		check1.setId(102);
		check1.setCheckcard("7837847545");
		check1.setAmount(32000);
		payrepository.save(check1);
	}


	@Test
	public void CreatePayement_Table() {
		Credit_card credit2 = new Credit_card();
		credit2.setId(204);
		credit2.setCreditcard("78645677");
		credit2.setAmount(150000);
		payytablerepo.save(credit2);
	}

	@Test
	public void createpaymentcheck_table() {
		Bank_Check cc1 = new Bank_Check();
		cc1.setId(109);
		cc1.setCheckcard("436376");
		cc1.setAmount(670000);
		payytablerepo.save(cc1);
	}


	@Test
	public void CreatepayementCheckJoin() {
		Check_join cc1 = new Check_join();
		cc1.setId(323);
		cc1.setCheckcard("2482742");
		cc1.setAmount(250000);
		payjoinrepo.save(cc1);
	}

	@Test
	public void CreatePaymentJoin() {
		Credit_join credit2 = new Credit_join();
		credit2.setId(103);
		credit2.setCreditcard("32487848");
		credit2.setAmount(56280);
		payjoinrepo.save(credit2);
	}
	@Test
	public void  testEmbeddedcomp(){
		Emp sc=new Emp();
		sc.setAge(25);
		sc.setId(2);
		sc.setFirstName("Shivam");
		sc.setLastName("TYagi");
		Salary sal=new Salary();
		sal.setBasicSalary(700f);
		sal.setBonusSalary(650f);
		sal.setTaxAmount(30f);
		sal.setSpecialAllowanceSalary(550f);
		sc.setSalary(sal);
		embeddedrepository.save(sc);
	}




}
