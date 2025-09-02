package week3.day1;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.swing.text.AttributeSet.CharacterAttribute;

public class StringReverse {

	private static Object CharacterAttribute;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PRIYANKA";
		char[] charArray = s.toCharArray();
		for(int i = charArray.length-1;i>=0;i--) {
						System.out.println("reversed string :" +charArray[i]);
						
					}
						
			

	}

}
