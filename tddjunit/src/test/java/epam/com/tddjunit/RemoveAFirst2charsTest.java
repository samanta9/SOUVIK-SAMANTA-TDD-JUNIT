package epam.com.tddjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFirst2charsTest {
	/*TODO list  for my feature
	 * 1. 4 chars : ABCD => BCD  - success
	 * 2. 4 chars : AACD => CD   - success
	 * 3. 4 chars : BACD => BCD  - success
	 * 4. 4 chars : BBAA=> BBAA  - success
	 * 5. n chars : AABAA => BAA - success
	 * 6. 2 chars : AA => ""     - success
	 * 7. 2 chars : BB => BB     - success
	 * 8. 2 chars : AB => B      - success
	 * 9.  1 char :  A => ""     - success
	 * 10. 1 char :  B => B      - success
	 * 11.empty char: "" => ""   - success
	 */
	
	RemoveAfirst2chars removeAfirst2chars;
	
  @BeforeEach
      void setup()
      {
	  removeAfirst2chars = new RemoveAfirst2chars();
      }
  
	@Test
	void testFirstAchars() {
		assertEquals("BCD",removeAfirst2chars.remove("ABCD"));
	}
	
	
	@Test
	void testFirst2chars() {
		assertEquals("CD",removeAfirst2chars.remove("AACD"));
	}
	
	
	@Test
	void test2ndAchar() {
		assertEquals("BCD",removeAfirst2chars.remove("BACD"));
	}
	

	@Test
	void testNchars() {
		assertEquals("BBAA",removeAfirst2chars.remove("BBAA"));
	}
	
	@Test
	void testFirst2Achars() {
		assertEquals("BAA",removeAfirst2chars.remove("AABAA"));
	}
	
	@Test
	void testAAchars() {
		assertEquals("",removeAfirst2chars.remove("AA"));
	}
	
	@Test
	void testBBchars() {
		assertEquals("BB",removeAfirst2chars.remove("BB"));
	}
	
	
	@Test
	void testABchars() {
		assertEquals("B",removeAfirst2chars.remove("AB"));
	}
	
	@Test
	void testFirstAchar() {
		assertEquals("",removeAfirst2chars.remove("A"));
	}
	
	@Test
	void testFirstchar() {
		assertEquals("B",removeAfirst2chars.remove("B"));
	}
	
	@Test
	void testEmptychar() {
		assertEquals("",removeAfirst2chars.remove(""));
	}
	
	

	
	
	
	
	

}
