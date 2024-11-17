package soap_cliente_local;

import ConexionBD.ConexionMySQL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SOAP_Cliente_Local extends JFrame {

    private JTextField num1Field, num2Field, resultField;
    private JLabel requestCountLabel;
    private CalculadoraWS port;
    private ConexionMySQL dbMySQL;

    public SOAP_Cliente_Local() {
        // Inicializa el servicio y puerto del servicio web
        CalculadoraWSService service = new CalculadoraWSService();
        port = service.getCalculadoraWSPort();
        dbMySQL = new ConexionMySQL(); // Instancia de DatabaseManager

        // Configuración de la ventana
        setTitle("Calculadora SOAP");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Componentes de la interfaz
        JLabel num1Label = new JLabel("Número 1:");
        num1Field = new JTextField();
        JLabel num2Label = new JLabel("Número 2:");
        num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Resultado:");
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton sumButton = new JButton("Sumar");
        JButton subtractButton = new JButton("Restar");
        JButton multiplyButton = new JButton("Multiplicar");
        JButton divideButton = new JButton("Dividir");

        requestCountLabel = new JLabel("Total de peticiones realizadas: 0");

        // Eventos de los botones
        sumButton.addActionListener(new OperationListener("sumar"));
        subtractButton.addActionListener(new OperationListener("restar"));
        multiplyButton.addActionListener(new OperationListener("multiplicar"));
        divideButton.addActionListener(new OperationListener("dividir"));

        // Añadir componentes a la ventana
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(sumButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(requestCountLabel);

        // Hacer visible la ventana
        setVisible(true);
    }

    private class OperationListener implements ActionListener {

        private String operation;

        public OperationListener(String operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = 0;

                switch (operation) {
                    case "sumar":
                        result = port.sumar(num1, num2);
                        break;
                    case "restar":
                        result = port.restar(num1, num2);
                        break;
                    case "multiplicar":
                        result = port.multiplicar(num1, num2);
                        break;
                    case "dividir":
                        result = port.dividir(num1, num2);
                        break;
                }

                resultField.setText(String.valueOf(result));
                requestCountLabel.setText("Total de peticiones realizadas: " + port.getContadorPeticiones());

                // Guardar la operación en la base de datos
                dbMySQL.guardarOperacion(num1, num2, result, operation);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(SOAP_Cliente_Local.this, "Por favor ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(SOAP_Cliente_Local.this, "Error al consumir el servicio: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SOAP_Cliente_Local());
    }
}
