package Servidor;
import javax.xml.ws.Endpoint;

public class Lanzador {

    public final static String urlCalculadoraWS = "http://192.168.237.215:8888/calculadora";

    public static void main(String[] args) {
        Endpoint.publish(urlCalculadoraWS, new CalculadoraWS());
        System.out.println("Servicio Web en espera en "+urlCalculadoraWS);        
    }
}
