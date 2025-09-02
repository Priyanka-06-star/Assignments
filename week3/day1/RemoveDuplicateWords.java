package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We learn Java basics as part of java sessions in java week1"; 
		String [] replace = s.split(" ");
		int count = 0;

		for (int i = 0;i < replace.length;i++) {
			for(int j=i+1;j<replace.length;j++)
			{
				if(replace[i].equalsIgnoreCase(replace[j]) && !replace[i].equals("")) {
					replace[j]="";
					count++;
				}
					
			}
			
			
		}

		if (count>0)
		{
			for(String sentence : replace)
			{
                System.out.print(sentence + " ");
			}
		}
	}


}
