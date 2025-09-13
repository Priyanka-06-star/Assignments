package week4.day1;

public class APIClientOverloading {
public void sendRequest(String endpoint) {
	 System.out.println(endpoint);
	 System.out.println("True");;
	
}
public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
	
	System.out.println(endpoint);
	System.out.println(requestBody);
	System.out.println(requestStatus);
	
	
}
}
