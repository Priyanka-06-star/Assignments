package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3, 2, 11, 4, 6, 7};
		int [] num1 = {1, 2, 8, 4, 9, 7};
		if (num!=num1) {
			System.out.println("It is not equal");
		}
		Arrays.sort(num);
		Arrays.sort(num1);
		if (num.length==num1.length) {
			for(int i =0;i<num.length;i++) {
				if (num[i]==num1[i]) {
//System.out.println(num[i]+ "");					
				}
				System.out.println(num[i] +" ");
			}
			
		}
		
		

	}

}
