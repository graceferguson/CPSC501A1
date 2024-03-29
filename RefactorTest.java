import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RefactorTest {

	Department testDepartment = new Department("Test Department");
	Tenure testTenure = new Tenure("Tony", testDepartment, "Tenure");
	Adjunct testAdjunct = new Adjunct("Charles", testDepartment, "Adjunct");
	Staff testStaff = new Staff("Jan");
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void raiseTest() {
		testTenure.setSalary(50000);
		testTenure.setYrsEmployed(8);
		assertEquals(testTenure.getRaise(), 90000, 0.0);
	}
	
	@Test
	public void tenureTest(){
		assertEquals(testTenure.getName(), "Tony");
		assertEquals(testTenure.getDepartment(), "Test Department");
		assertEquals(testTenure.getSection(), "Tenure");
	}
	
	@Test
	public void adjunctTest(){
		assertEquals(testAdjunct.getName(), "Charles");
		assertEquals(testAdjunct.getDepartment(), "Test Department");
		assertEquals(testAdjunct.getSection(), "Adjunct");
	}
	
	@Test
	public void staffTest(){
		assertEquals(testStaff.getName(testStaff), "Jan");
	}

}
