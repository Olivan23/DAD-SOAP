package Servidor;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculadoraWS {
    @WebMethod
    int sumar(int num1, int num2);

    @WebMethod
    int restar(int num1, int num2);

    @WebMethod
    int multiplicar(int num1, int num2);

    @WebMethod
    int dividir(int num1, int num2);
    
    @WebMethod
    int getContadorPeticiones(); // Método para obtener el contador de peticiones
}
