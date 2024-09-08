package ucv.codelab;

import javax.swing.JOptionPane;

public class Ejercicio02 {

    public static void iniciar() {
        // Inicializacion de Variables
        String ventasString = JOptionPane.showInputDialog("Ingrese el monto de ventas: ");
        double ventas = Double.parseDouble(ventasString);
        double comision = 0;
        double bonificacion = 0;

        // Ingresar el monto de ventas
        if (ventas < 10000) {
            comision = ventas * 0.05;
        } else if (ventas <= 50000) {
            comision = ventas * 0.075;
            bonificacion = 200;
        } else {
            comision = ventas * 0.09;
            bonificacion = 300;
        }

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "Comisión: " + comision + "\nBonificación: " +
                bonificacion + "\nTotal: " + (comision + bonificacion));

    }
}
