package yaBobJonez;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import arrays.BooleanArray;
import arrays.DoubleArray;
import arrays.IntArray;
import arrays.StringArray;
import data.Strings;

public class BaseTests{
	@Test
    public void controlPropertiesTest(){
        assertEquals("Retrieving OS name", System.getProperty("os.name"), General.OS_Name);
        assertEquals("Retrieving Os version", System.getProperty("os.version"), General.OS_Version);
    }
	@Test
	public void controlTimeTest(){
		assertEquals("Date formatting", new SimpleDateFormat("h:m a").format(125000), General.formatTime(125000, "h:m a"));
		try{
			long TestTime;
			SimpleDateFormat df = new SimpleDateFormat("h:m");
			Date dt = df.parse("7:45");
			TestTime = dt.getTime();
			assertEquals("Date parsing", TestTime, General.parseTime("7:45", "h:m"));
		} catch(ParseException e){ fail("Impossible to parse date"); }
	}
	@Test
	public void controlRandomTest(){
		int TestRand = General.random(0, 1);
        if(TestRand == 0 || TestRand == 1){}
        else fail("Random int 0..1");
	}
	@Test
	public void controlRangeTest(){
		assertEquals("Range 0..5", 2, General.range(0, 5)[2]);
		assertEquals("Range 0..5:1", 4, General.range(0, 5, 1)[2]);
	}
	@Test
	public void typesTest(){
		assertEquals("Int to string", "15", Types.asString(15));
		assertEquals("String to double", 12.5, Types.asDouble("12.5"), 0.0);
		assertTrue("Non-zero int to boolean", Types.asBoolean(12));
		assertEquals("Boolean to int", 1, Types.asInt(true));
	}
	@Test
	public void arraysTest(){
		StringArray a1 = new StringArray("test", "next", "second");
		assertEquals("StringArray", "next", a1.get(1));
		IntArray a2 = new IntArray(2, 10);
		a2.add(5, 15);
		assertEquals("IntArray", 5, (int)a2.get(2));
		DoubleArray a3 = new DoubleArray(5.5, 7.12, 3.14);
		a3.remove(2);
		assertNull("DoubleArray", a3.get(2));
		BooleanArray a4 = new BooleanArray(true, false);
		a4.set(1, true);
		assertTrue("BooleanArray", a4.get(1));
	}
	@Test
	public void arraysOfTest(){
		assertEquals("Empty array", null, StringArray.of().get(0));
		assertEquals("Array of values", 1, 0+IntArray.of(0, 1, 2).get(1));
	}
	@Test
	public void stringsTest(){
		assertEquals("String reverse", "abcd", Strings.reverse("dcba"));
		assertEquals("String repeating", "aaaaa", Strings.repeat("a", 5));
		assertEquals("String by chars", new String[]{"1", "5", "3"}[1], Strings.toArray("153")[1]);
	}
}
