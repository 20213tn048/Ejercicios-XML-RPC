package calculator;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCCalculator {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner entrada = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Escriba un número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Escriba un número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Escriba un número: ");
        double num3 = entrada.nextDouble();
        System.out.print("Escriba un número: ");
        double num4 = entrada.nextDouble();
        Object[] data = {num1,num2,num3,num4};
        String result = (String) client.execute("Methods.calculator",data);
        System.out.println(result);
    }
}
