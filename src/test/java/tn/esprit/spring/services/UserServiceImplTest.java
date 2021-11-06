package tn.esprit.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class UserServiceImplTest {
	@Autowired
	IUserService us;
	/*@Test
	@Order(1)
	public void testuserRetrouve()
	{
		List<User> listuser = us.retrieveAllUsers();
		Assertions.assertEquals(2, listuser.size());
	}
	
	@Test
	@Order(2)
	public void testuserAddUser() throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		User u = new User("Mayssa1", "Mayssa1", d, Role.INGENIEUR);
		User userAdded = us.addUser(u);
		Assertions.assertEquals(u.getLastName(), userAdded.getLastName());
	}
	
	@Test
	@Order(3)
	public void testuserUpdateUser() throws ParseException 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		User u = new User(5L, "Mayssa12222", "Mayssa", d, Role.INGENIEUR);
		User userUpdated = us.updateUser(u);
		Assertions.assertEquals(u.getLastName(), userUpdated.getLastName());
	}
	@Test
	@Order(4)
	public void testuserDeleteUser()
	{
		us.deleteUser("16");
		Assertions.assertNull(us.retrieveUser("16"));
	}
	@Test
	@Order(5)
	public void testuserRetrieveUser()
	{
		User testRetrieved = us.retrieveUser("1");
		Assertions.assertEquals(1L, testRetrieved.getId().longValue());
	}*/

}
