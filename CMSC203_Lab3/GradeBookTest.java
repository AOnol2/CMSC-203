import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	
	GradeBook gradeBookScore1;
	GradeBook gradeBookScore2;
	
	@BeforeEach
	void setUp() throws Exception{
	
		
		
		gradeBookScore1 = new GradeBook(5);
		
		gradeBookScore1.addScore(91);
		gradeBookScore1.addScore(53);
		
		gradeBookScore2 = new GradeBook(5);
		
		gradeBookScore2.addScore(60);
		gradeBookScore2.addScore(46);
		
	}

	@AfterEach
	void tearDown() throws Exception{
		gradeBookScore1 = null;
		gradeBookScore2 = null;
	}

	@Test
	void testAddScore(){
		assertTrue(gradeBookScore1.toString().equals("91.0 53.0"));
		assertTrue(gradeBookScore2.toString().equals("60.0 46.0"));
	}

	@Test
	void testSum(){
		assertEquals(144, gradeBookScore1.sum(), .0001);
		assertEquals(106, gradeBookScore2.sum(), .0001);
	}

	@Test
	void testMinimum(){
		assertEquals(53, gradeBookScore1.minimum(), .001);
		assertEquals(46, gradeBookScore2.minimum(), .001);
	}

	@Test
	void testFinalScore(){
		assertEquals(91,gradeBookScore1.finalScore());
		assertEquals(60,gradeBookScore2.finalScore());
	}
}
