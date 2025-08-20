package week1.day2;

public class Browser {
	
	public String launchBrowser(String browsername) {

	return browsername;
	}
	
	public String loadUrl(String loadUrl) {
		return loadUrl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser lb = new Browser();
		String name = lb.launchBrowser("Chrome");
		System.out.println(name);
        String link = lb.loadUrl("Browser loaded successfully");
        System.out.println(link);
        
        
		
		
		

	}

}
