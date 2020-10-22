package data;

public class Strings {
	public static String reverse(String str){
		return new StringBuffer(str).reverse().toString();
	} public static String repeat(String str, int times){
		return new String(new char[times]).replace("\0", str);
	} public static String[] toArray(String str){
		char[] t = str.toCharArray();
		String[] res = new String[t.length];
		for(int i = 0; i < t.length; i++) res[i] = String.valueOf(t[i]);
		return res;
	}
}
