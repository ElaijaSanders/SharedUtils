package yaBobJonez;

public class Output {
	public static String LF = System.lineSeparator();
	
	public static void print(String msg){
		System.out.println(msg);
	} public static void print(int msg){
		System.out.println(msg);
	} public static void print(double msg){
		System.out.println(msg);
	} public static void print(boolean msg){
		System.out.println(msg);
	} public static void print(Object msg){
		System.out.println(msg.toString());
	}
	public static void print(String... msg){
		for(String val : msg) System.out.println(val);
	} public static void print(int... msg){
		for(int val : msg) System.out.println(val);
	} public static void print(double... msg){
		for(double val : msg) System.out.println(val);
	} public static void print(boolean... msg){
		for(boolean val : msg) System.out.println(val);
	} public static void print(Object... msg){
		for(Object val : msg) System.out.println(val);
	}
	
	public static void printA(String msg){
		System.out.print(msg);
	} public static void printA(int msg){
		System.out.print(msg);
	} public static void printA(double msg){
		System.out.print(msg);
	} public static void printA(boolean msg){
		System.out.print(msg);
	} public static void printA(Object msg){
		System.out.print(msg.toString());
	}
	public static void printA(String... msg){
		for(String val : msg) System.out.print(val);
	} public static void printA(int... msg){
		for(int val : msg) System.out.print(val);
	} public static void printA(double... msg){
		for(double val : msg) System.out.print(val);
	} public static void printA(boolean... msg){
		for(boolean val : msg) System.out.print(val);
	} public static void printA(Object... msg){
		for(Object val : msg) System.out.print(val);
	}
}
