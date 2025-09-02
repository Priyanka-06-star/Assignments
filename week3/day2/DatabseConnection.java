package week3.day2;

public interface DatabseConnection {
public default void Database() {
	System.out.println("Welcome to db");
}
public void connect();
public void disconnect();
public void executeUpdate();
}
