package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring = "changeme";
		char[] charArray =mystring.toCharArray();
		for (int i = 0;i<=charArray.length;i++) {
			if(i%2!=0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				
				
			}
			
		}
		
		String result = new String(charArray);
        System.out.println("Modified String: " + result);
	}

}
