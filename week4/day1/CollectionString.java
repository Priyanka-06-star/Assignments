package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Companies =  {"HCL","Wipro","Aspire Systems","CTS"} ;
		List<String> list = new ArrayList<String>();

		for(int i=0;i<Companies.length;i++)
		{
			list.add(Companies[i]);
		}
		Collections.sort(list);
		
		for(int i=list.size()-1;i>=0;i--)
		{
		 System.out.print(list.get(i));	
		 if(i > 0)
		 {
			 System.out.print(",");
		 }
		}
			
	}
}
