import tkinter as tk
from tkinter import messagebox
from servidor import realizar_operacion

# Función para manejar el botón de calcular
def calcular():
    try:
        num1 = int(entry_num1.get())
        num2 = int(entry_num2.get())
        operacion = operation_var.get()
        
        # Llamada al servidor para realizar la operación
        resultado = realizar_operacion(num1, num2, operacion)
        
        if resultado is not None:
            result_label.config(text=f"Resultado: {resultado}")
            messagebox.showinfo("Operación guardada", "Operación realizada correctamente")
        else:
            messagebox.showerror("Error", "No se pudo realizar la operación")
    except ValueError:
        messagebox.showerror("Entrada inválida", "Por favor ingresa números válidos")

# Configuración de la interfaz gráfica
root = tk.Tk()
root.title("Calculadora SOAP")

# Entradas de números
tk.Label(root, text="Número 1:").grid(row=0, column=0, padx=10, pady=10)
entry_num1 = tk.Entry(root)
entry_num1.grid(row=0, column=1, padx=10, pady=10)

tk.Label(root, text="Número 2:").grid(row=1, column=0, padx=10, pady=10)
entry_num2 = tk.Entry(root)
entry_num2.grid(row=1, column=1, padx=10, pady=10)

# Opciones de operación
operation_var = tk.StringVar(value="sumar")
tk.Label(root, text="Operación:").grid(row=2, column=0, padx=10, pady=10)
operation_menu = tk.OptionMenu(root, operation_var, "sumar", "restar", "multiplicar", "dividir")
operation_menu.grid(row=2, column=1, padx=10, pady=10)

# Botón de calcular
calculate_button = tk.Button(root, text="Calcular", command=calcular)
calculate_button.grid(row=3, column=0, columnspan=2, padx=10, pady=10)

# Etiqueta de resultado
result_label = tk.Label(root, text="Resultado: ")
result_label.grid(row=4, column=0, columnspan=2, padx=10, pady=10)

# Iniciar la interfaz gráfica
root.mainloop()
