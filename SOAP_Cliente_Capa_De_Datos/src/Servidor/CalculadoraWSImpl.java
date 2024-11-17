package Servidor;

import javax.jws.WebService;

@WebService(endpointInterface = "Servidor.CalculadoraWS")
public class CalculadoraWSImpl implements CalculadoraWS {
    private int contadorPeticiones = 0;

    @Override
    public int sumar(int num1, int num2) {
        contadorPeticiones++;
        return num1 + num2;
    }

    @Override
    public int restar(int num1, int num2) {
        contadorPeticiones++;
        return num1 - num2;
    }

    @Override
    public int multiplicar(int num1, int num2) {
        contadorPeticiones++;
        return num1 * num2;
    }

    @Override
    public int dividir(int num1, int num2) {
        contadorPeticiones++;
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return num1 / num2;
    }

    @Override
    public int getContadorPeticiones() {
        return contadorPeticiones;
    }
}
