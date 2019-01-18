package oop.staticmethod;

public class StaticMethod {

	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticMethod.value = value;
	}
	
	public static void toUpper() {
		String result = "";
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if ('a' <= c && c <= 'z') {
				c -= 'a' - 'A';
			}
			result += c;
		}
		value = result;
	}
	
	public static void setChar(int index, char c) {
		char[] arr = value.toCharArray();
		arr[index] = c;
		value = arr.toString();
	}
	
	public static int valueLength() {
		return value.length();
	}
	
	public static String valueConcat(String s) {
		return value + s;
	}
}
