package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Securitytests {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	public void testLoginEmptyUserId() {
		
String userId = "", password = "Freddy99";
Security security = new Security();
boolean actual = security.login(userId, password);
boolean expected = false;
assertEquals(expected, actual);

	}
	
	@Test
	public void testLoginEmptyuserandPassword() {
		
	String userId = "", password = "";
	Security security = new Security();
	boolean actual = security.login(userId, password);
	boolean expected = false;
	assertEquals(expected, actual);


	 }


@Test
public void testLoginEmptyPassword() {
	
String userId = "Jamie", password = "";
Security security = new Security();
boolean actual = security.login(userId, password);
boolean expected = false;
assertEquals(expected, actual);


 }

@Test
public void testMinlengthLoginPassword() {
	
String userId = "Jamie", password = "Pass";
Security security = new Security();
boolean actual = security.login(userId, password);
boolean expected = false;
assertEquals(expected, actual);


 }
public void testlowercaasepassword() {
	
String userId = "Jamie", password = "assword1";
Security security = new Security();
boolean actual = security.login(userId, password);
boolean expected = false;
assertEquals(expected, actual);


 }





}
