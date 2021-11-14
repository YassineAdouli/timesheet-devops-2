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
	
	
	@Test
	@Order(1)
	public void testemployeRetrouve()
	{
		List<Employe> listemploye = us.retrieveAllEmployes();
		Assertions.assertEquals(1, listemploye.size());
	}
	
	@Test
	@Order(2)
	public void testuserAddEmploye() throws ParseException
	{
		Employe e = new Employe("Mayssa1", "Mayssa1", "mayssa@esprit.tn","azerty",true, Role.INGENIEUR);
		Employe employeAdded = us.addEmploye(e);
		Assertions.assertEquals(e.getNom(), employeAdded.getNom());
	}
		
	
	@Test
	@Order(3)
	public void testemployeDeleteEmploye()
	{
		
		List<Employe> e1 = us.retrieveAllEmployes();
		Employe e11 =e1.get((e1.size())-2);
		us.deleteEmploye(String.valueOf(e11.getId()));
	}
	
	@Test
	@Order(4)
	public void testuserUpdateEmploye() throws ParseException 
	{
		List<Employe> e1 = us.retrieveAllEmployes();
		Employe e11 = e1.get((e1.size())-1);
		Employe e = new Employe(e11.getId(),"Ferid", "Ferid", "Ferid@esprit.tn","azerty",true, Role.INGENIEUR);
		Employe employeUpdated = us.updateEmploye(e);
		Assertions.assertEquals(e.getNom(), employeUpdated.getNom());
	}
		

}
