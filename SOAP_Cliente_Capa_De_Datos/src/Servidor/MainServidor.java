package Servidor;

import javax.xml.ws.Endpoint;

public class MainServidor {
    public static void main(String[] args) {
        Endpoint.publish("http://192.168.237.215:8080/calculadora", new CalculadoraWSImpl());
        System.out.println("Servidor de calculadora SOAP está corriendo...");
    }
}
