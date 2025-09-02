package week3.day2;

public class DB implements DatabseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Check the connectvity");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Try disconnecting");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Try updating");
		
	}
	public static void main(String[] args) {
		DB d = new DB();
		d.connect();
		d.disconnect();
		d.executeUpdate();
	}

}
