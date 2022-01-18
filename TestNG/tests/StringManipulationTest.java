import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringManipulationTest {
    //Test Driven Development aka TDD

    @Test
    public void testConvertFirstLetterToUppercase(){
        StringManipulation stringManipulation = new StringManipulation();

        String testWords = "tech lead academy";
        String expected = "Tech Lead Academy";
        String actual = stringManipulation.convertFirstletterToUppercase(testWords);

        Assert.assertEquals(actual, expected, "Not all words were uppercase");

    }
    @Test
    public void abbreviation(){
        StringManipulation stringManipulation = new StringManipulation();

        String name = "tech lead academy";
        String expected = "tla";
        String actual = stringManipulation.abbreviation(name);

        Assert.assertEquals(actual,expected,"Incorrect result");

    }
}