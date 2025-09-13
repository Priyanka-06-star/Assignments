package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] num = {1, 2, 3, 4, 10, 6, 8};

List<Integer>num1 = Arrays.asList(1, 2, 3, 4, 10, 6, 8);
Collections.sort(num1);

	for(int i=0; i<num1.size()-1;i++) {
		if(num1.get(i)+ 1!= num1.get(i+1))
		{
			for(int j = num1.get(i)+1; j < num1.get(i+1) ;j++)
			{
				System.out.print(j +" ");
			}
		}
	}
	}
	
		
	}



