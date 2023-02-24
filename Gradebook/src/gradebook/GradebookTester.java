// The purpose of this class is to model a gradebook
//romaric Nkola, 2/24/2013

package gradebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class GradebookTester {
private Gradebook g1;
private Gradebook g2;
    
@Before
public void setUp() {
//Creating two new object of GradeBook.
g1 = new Gradebook(5);
g2 = new Gradebook(5);
//Adding the score to each object.
g1.addScore(50);
g1.addScore(75);
g2.addScore(80);
g2.addScore(90);
}
    
@After
public void tearDown() {
//Setting the both object to null.
g1 = null;
g2 = null;
}

@Test
public void testSum(){
//Checking the actual sum and sum returned by the sum() are equivalent.
assertEquals(125,g1.sum(),0.001);
assertEquals(170,g2.sum(),0.001);
}
@Test
public void testMinimum(){
//Checking if the minimum score returned by minimum() is equals to actual minimum value.
assertEquals(50,g1.minimum(),0.001);
assertEquals(80,g2.minimum(),0.001);
}
@Test
public void addScoreTest(){
//Checking if the returned string is equal to expected string.
assertTrue(g1.toString().equals("50.0 75.0 "));
assertTrue(g2.toString().equals("80.0 90.0 "));
}
@Test 
public void finalScoreTest(){
//Since there are two scores in both g1 and g2 the finalScore will return sum of all scores - minimum score.
assertEquals(75,g1.finalScore(),0.001);
assertEquals(90,g2.finalScore(),0.001);
}
    
}
