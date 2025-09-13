package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "google";
char[] charArray=s.toCharArray();
Set<Character> unique=new LinkedHashSet<Character>();

for (int i = 0; i < charArray.length; i++) {
	unique.add(charArray[i]);
}
System.out.println("unique are" +unique);

	}

}


