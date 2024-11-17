from zeep import Client
from base_datos import guardar_operacion_mysql

# URL del WSDL del servicio SOAP
WSDL_URL = 'http://localhost:8080/ServiciosWeb_SOAP_Calculadora1/CalculadoraWSService?WSDL'

# Función para consumir el servicio SOAP y realizar las operaciones
def realizar_operacion(num1, num2, operacion):
    client = Client(WSDL_URL)
    
    try:
        if operacion == 'sumar':
            resultado = client.service.sumar(num1, num2)
        elif operacion == 'restar':
            resultado = client.service.restar(num1, num2)
        elif operacion == 'multiplicar':
            resultado = client.service.multiplicar(num1, num2)
        elif operacion == 'dividir':
            resultado = client.service.dividir(num1, num2)
        else:
            print("Operación no válida")
            return None

        # Guardar en la base de datos MySQL
        guardar_operacion_mysql(num1, num2, resultado, operacion)
        return resultado
    
    except Exception as e:
        print(f"Error al realizar la operación: {e}")
        return None
