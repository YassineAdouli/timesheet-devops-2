package tn.esprit.spring.services;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class EmployeServiceImplTest {
	@Autowired
	IEmployeService us;
	/*
	@Test
	@Order(1)
	public void testemployeRetrouve()
	{
		List<Employe> listemploye = us.retrieveAllEmployes();
		Assertions.assertEquals(3, listemploye.size());
	}
	
	@Test
	@Order(2)
	public void testuserAddEmploye() throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Employe e = new Employe("Mayssa1", "Mayssa1", "mayssa@esprit.tn","azerty",true, Role.INGENIEUR);
		Employe employeAdded = us.addEmploye(e);
		Assertions.assertEquals(e.getNom(), employeAdded.getNom());
	}
	
	@Test
	@Order(3)
	public void testuserUpdateEmploye() throws ParseException 
	{
		Employe e = new Employe("Mayssa1", "Mayssa24", "mayssa@esprit.tn","azerty",true, Role.INGENIEUR);
		Employe employeUpdated = us.updateEmploye(e);
		Assertions.assertEquals(e.getNom(), employeUpdated.getNom());
	}
	
	
	@Test
	@Order(4)
	public void testemployeDeleteEmploye()
	{
		us.deleteEmploye("22");
		//Assertions.assertNull(us.retrieveEmploye("5"));
	}
	*/
	/*@Test
	@Order(5)
	public void testemployeRetrieveEmploye()
	{
		Employe testRetrieved = us.retrieveEmploye("20");
		Assertions.assertEquals(1L, testRetrieved.getId().longValue());
	}*/
	

}
