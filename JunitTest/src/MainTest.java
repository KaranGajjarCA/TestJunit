import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		
		//good test case
		assertEquals("karan contain 2 occurance of 'a'", 2, Main.countSpecialCharacter("karan", 'a'));
		char[] ch = {'a','b','c'};
 		assertEquals("['a','b','c'] return 'c'", 'c', Main.findMaxAsciiChar(ch));
		assertEquals("Retrun true, karan contain letter 'a'", true, Main.checkCharacterWord("karan", 'a'));
		System.out.println("Test run successfully");
		
		//bad test case
		assertEquals("Fail, because test contain 2 occuance of 't'", 3, Main.countSpecialCharacter("test", 't'));
 		assertEquals("Fail, because ['a','b','c'] return 'c'", 'a', Main.findMaxAsciiChar(ch));
		assertEquals("Fail, Retrun true, test contain letter 's'", true, Main.checkCharacterWord("test", 's'));
		
	}

}
