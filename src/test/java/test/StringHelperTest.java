package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
* test.StringHelperTest.StringHelper Tester.
*
* @author <Authors name>
* @since <pre>Feb 28, 2020</pre>
* @version 1.0
*/
public class StringHelperTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}
@Test
public void test(){
    assertEquals("ABCD","ABCD");
}
/**
*
* Method: truncateAInFirst2Positions(String str)
*
*/
StringHelper stringHelper = new StringHelper();
@Test
public void testTruncateAInFirst2Positions() throws Exception {

    assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
}
@Test
public void testTruncateAInFirst2Positions2() throws Exception {
    StringHelper stringHelper = new StringHelper();
    assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
}


/**
*
* Method: areFirstAndLastTwoCharactersTheSame(String str)
*
*/
@Test
public void testAreFirstAndLastTwoCharactersTheSame() throws Exception {
    assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("AAAA"));
}
    @Test

    public void testAreFirstAndLastTwoCharactersTheSame_basicpositveScenario() throws Exception {
        assertFalse( "are first and last 2 chars same",stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    public static class StringHelper {

        public String truncateAInFirst2Positions(String str) {
            if (str.length() <= 2)
                return str.replaceAll("A", "");

            String first2Chars = str.substring(0, 2);
            String stringMinusFirst2Chars = str.substring(2);

            return first2Chars.replaceAll("A", "")
                + stringMinusFirst2Chars;
        }

        public boolean areFirstAndLastTwoCharactersTheSame(String str) {

            if (str.length() <= 1)
                return false;
            if (str.length() == 2)
                return true;

            String first2Chars = str.substring(0, 2);

            String last2Chars = str.substring(str.length() - 2);

            return first2Chars.equals(last2Chars);
        }

    }
}
