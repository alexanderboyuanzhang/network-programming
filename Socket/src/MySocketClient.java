import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MySocketClient {

	public void mySocketClient(String host, int port, String payload)
			throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
		/*
		 * get the localhost IP address, if server is running on some other IP, you need
		 * to use that InetAddress host = InetAddress.getLocalHost();
		 */
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		// establish socket connection to server
		socket = new Socket(host, port);
		// write to socket using ObjectOutputStream
		oos = new ObjectOutputStream(socket.getOutputStream());
		System.out.println("Sending request to Socket Server");

		oos.writeObject(payload);
		// read the server response message
		ois = new ObjectInputStream(socket.getInputStream());
		String message = (String) ois.readObject();
		System.out.println("Message: " + message);
		// close resources
		ois.close();
		oos.close();
		socket.close();
		Thread.sleep(100);
	}
}
