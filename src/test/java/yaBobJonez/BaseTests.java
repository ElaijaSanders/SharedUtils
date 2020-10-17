package yaBobJonez;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

public class BaseTests{
	@Test
    public void controlPropertiesTest(){
        assertEquals("Retrieving OS name", System.getProperty("os.name"), Control.OS_Name);
        assertEquals("Retrieving Os version", System.getProperty("os.version"), Control.OS_Version);
    }
	@Test
	public void controlTimeTest(){
		assertEquals("Date formatting", new SimpleDateFormat("h:m a").format(125000), Control.formatTime(125000, "h:m a"));
		try{
			long TestTime;
			SimpleDateFormat df = new SimpleDateFormat("h:m");
			Date dt = df.parse("7:45");
			TestTime = dt.getTime();
			assertEquals("Date parsing", TestTime, Control.asUnixTime("7:45", "h:m"));
		} catch(ParseException e){ fail("Impossible to parse date"); }
	}
	@Test
	public void controlRandomTest(){
		int TestRand = Control.random(0, 1);
        if(TestRand == 0 || TestRand == 1){}
        else fail("Random int 0..1");
	}
	@Test
	public void typesTest(){
		assertEquals("Int to string", "15", Types.asString(15));
		assertEquals("String to double", 12.5, Types.asDouble("12.5"), 0.0);
		assertTrue("Non-zero int to boolean", Types.asBoolean(12));
		assertEquals("Boolean to int", 1, Types.asInt(true));
	}
}
