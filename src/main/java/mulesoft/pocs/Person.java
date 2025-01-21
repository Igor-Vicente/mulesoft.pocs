package mulesoft.pocs;

public class Person {
	
	public static String Welcome(String name) {
		return "Welcome, " + name + " to the world of Mulesoft and Java!";
	}
	
	public static String FullName(String fName, String lName) {
		return fName + " " + lName;
	}
}
