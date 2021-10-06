
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.net.*;
import java.io.*;

public class UnencryptedServerSocket {

	ServerSocket soc1 = new ServerSocket("www.google.com", 80);

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SERVER_SOCKET
			ServerSocket soc = new ServerSocket(80);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	ServerSocket soc2;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SERVER_SOCKET/no-detect
			soc2 = SSLServerSocketFactory.getDefault().createServerSocket(443);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	ServerSocket soc3;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SERVER_SOCKET
			soc3 = ServerSocketFactory.getDefault().createServerSocket(80);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}