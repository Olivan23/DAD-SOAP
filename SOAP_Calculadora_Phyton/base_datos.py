import mysql.connector
from mysql.connector import Error

# Configuración de la conexión a la base de datos MySQL
MYSQL_HOST = 'localhost'
MYSQL_DATABASE = 'calculadora_soap_db'
MYSQL_USER = 'root'
MYSQL_PASSWORD = 'Bye211221'

# Función para conectar a la base de datos MySQL
def connect_to_mysql():
    try:
        connection = mysql.connector.connect(
            host=MYSQL_HOST,
            database=MYSQL_DATABASE,
            user=MYSQL_USER,
            password=MYSQL_PASSWORD
        )
        if connection.is_connected():
            print("Conexión a MySQL exitosa")
        return connection
    except Error as e:
        print(f"Error al conectar a MySQL: {e}")
        return None

# Función para guardar operación en la base de datos
def guardar_operacion_mysql(num1, num2, resultado, operacion):
    connection = connect_to_mysql()
    if connection is None:
        print("No se pudo conectar a MySQL, operación no guardada.")
        return
    
    try:
        cursor = connection.cursor()
        sql = "INSERT INTO operaciones (num1, num2, resultado, operacion) VALUES (%s, %s, %s, %s)"
        valores = (num1, num2, resultado, operacion)
        cursor.execute(sql, valores)
        connection.commit()
        print("Operación guardada en MySQL")
    except Error as e:
        print(f"Error al guardar en MySQL: {e}")
    finally:
        if connection.is_connected():
            connection.close()
            print("Conexión a MySQL cerrada")
