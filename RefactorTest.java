import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RefactorTest {

	Department testDepartment = new Department("blank");
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
		assertEquals(testTenure.getRaise(50000.0, 8.0), 90000, 0.0);
	}
	
	@Test
	public void tenureTest(){
		assertEquals(testTenure.getName(), "Tony");
	}
	
	@Test
	public void adjunctTest(){
		assertEquals(testAdjunct.getName(), "Charles");
	}
	
	@Test
	public void staffTest(){
		assertEquals(testStaff.getName(testStaff), "Jan");
	}

}
