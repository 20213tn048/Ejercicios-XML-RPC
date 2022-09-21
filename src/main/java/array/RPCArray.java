package array;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCArray {
    public static void main(String[] args) throws MalformedURLException {
        Scanner entrada = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        int []counter = new int [5];
        Object[] data = {counter};
        int result = (int) client.execute("Methods.array",counter);
    }
}
