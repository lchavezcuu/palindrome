import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by luis on 19/01/17.
 */
public class InterviewTest {

    @Test
    public void isPalindromeTest(){
        //Just some quick/random test
        assertTrue(Interview.isPalindrome("AMANA, PLANA, CANAL, PANAMA!"));
        assertTrue(Interview.isPalindrome("M A L A Y A L A M"));
        assertTrue(Interview.isPalindrome("Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!”" +
                                          " Irony dooms a man—a prisoner up to new era"));
        assertTrue(Interview.isPalindrome("sTaTs"));
        assertTrue(Interview.isPalindrome("sulus"));
        assertTrue(Interview.isPalindrome("A L, U,,! L&^   ##A    *77"));
        assertTrue(Interview.isPalindrome("DELED2"));
        assertTrue(Interview.isPalindrome("_ _ _! a A"));
        assertFalse(Interview.isPalindrome("___"));
        assertFalse(Interview.isPalindrome("_ _ _! a b"));
        assertFalse(Interview.isPalindrome(""));
        assertFalse(Interview.isPalindrome(null));
    }
}
