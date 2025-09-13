package week4.day1;

import net.bytebuddy.implementation.bind.annotation.Super;

public class APIClientOverridding extends APIClientOverloading{
	public void sendRequest(String endpoint) {
		 System.out.println(endpoint);
		 System.out.println("False");

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClientOverridding AP = new APIClientOverridding();
		AP.sendRequest("The browser is loading", "get id -123", true);
        AP.sendRequest("The Url is not loaded");
	}

}
