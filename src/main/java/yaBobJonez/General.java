package yaBobJonez;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import org.eclipse.collections.impl.list.Interval;

public class General {
	public static String OS_Name = System.getProperty("os.name");
	public static String OS_Version = System.getProperty("os.version");
	public static InputStream STDIN = System.in;
	public static OutputStream STDOUT = System.out;
	public static PrintStream STDERR = System.err;
	private static Date pf_date = new Date();
	
	public static long currentTime(){
		return pf_date.getTime();
	} public static String formatTime(long time, String format){
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(time);
	}
	@SuppressWarnings("null")
	public static long parseTime(String time, String format){
		SimpleDateFormat df = new SimpleDateFormat(format);
		try{
			Date dt = df.parse(time);
			return dt.getTime();
		} catch(ParseException e){ return (Long)null; }
	}
	public static int random(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	public static int[] range(int min, int max){
		return Interval.fromTo(min, max).toIntArray();
	} public static int[] range(int min, int max, int step){
		return Interval.fromToBy(min, max, step+1).toIntArray();
	}
	public static void raiseError(String mes){
		System.err.print(mes); System.exit(1);
	}
}
