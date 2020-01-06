import java.io.IOException;
import java.net.UnknownHostException;

public class MySocketClientTest {

	public static void main(String[] args) {
		MySocketClient socketClient = new MySocketClient();

		try {
			socketClient.mySocketClient("127.0.0.1", 9876, "Tutto OK?");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
