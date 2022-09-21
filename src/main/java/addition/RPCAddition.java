package addition;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCAddition {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner entrada = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Escriba el número base: ");
        int base = entrada.nextInt();
        System.out.print("Escriba el número final: ");
        int limit = entrada.nextInt();
        Object [] objects = {base,limit};
        int result = (int) client.execute("Methods.plus",objects);
        System.out.println("La suma de los números entre "+base+" y "+limit+" es: "+result);
    }
}
