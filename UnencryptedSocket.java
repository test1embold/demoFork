
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.net.*;
import java.io.*;
public class UnencryptedSocket{
	Socket soc;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET
			soc = new Socket("www.google.com",80);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Socket soc2;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET
			soc2 = new Socket("127.0.0.1",5000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Socket soc3;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET/no-detect
			soc3 = SSLSocketFactory.getDefault().createSocket("www.google.com", 80);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Socket soc4;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET/no-detect
			soc4 = SSLSocketFactory.getDefault().createSocket("www.google.com", 443);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Socket soc5;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET/no-detect
			soc5 = SSLSocketFactory.getDefault().createSocket("www.google.com", 8443);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Socket soc6;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET
			soc6 = SocketFactory.getDefault().createSocket("www.google.com", 80);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Socket soc7;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET
			soc7 = SocketFactory.getDefault().createSocket("www.google.com", 443);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Socket soc8;

	{
		try {
			// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET
			soc8 = SocketFactory.getDefault().createSocket("www.google.com", 8443);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}