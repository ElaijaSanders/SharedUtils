package yaBobJonez;

public class Types {
	public static String asString(int value){
		return String.valueOf(value);
	} public static String asString(double value){
		return String.valueOf(value);
	} public static String asString(boolean value){
		return String.valueOf(value);
	}
	
	@SuppressWarnings("null")
	public static int asInt(String value){
		try{ return Integer.parseInt(value); }
		catch(NumberFormatException e){ return (Integer)null; }
	} public static int asInt(double value){
		return (int)value;
	} public static int asInt(boolean value){
		if(value) return 1;
		return 0;
	}
	
	@SuppressWarnings("null")
	public static double asDouble(String value){
		try{ return Double.parseDouble(value); }
		catch(NumberFormatException e){ return (Double)null; }
	} public static double asDouble(int value){
		return (double)value;
	} public static double asDouble(boolean value){
		if(value) return 1.0;
		return 0.0;
	}
	
	@SuppressWarnings("null")
	public static boolean asBoolean(String value){
		if(value.equalsIgnoreCase("true")) return true;
		else if(value.equalsIgnoreCase("false")) return false;
		else return (Boolean)null;
	} public static boolean asBoolean(int value){
		if(value == 0) return false;
		return true;
	} public static boolean asBoolean(double value){
		if(value == 0.0) return false;
		return true;
	}
}
