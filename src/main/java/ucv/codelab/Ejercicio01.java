package ucv.codelab;

import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void iniciar() {
        // Solicitar el sueldo básico
        String sueldoBasicoStr = JOptionPane.showInputDialog(null, "Ingrese el sueldo básico:");
        double sueldoBasico = Double.parseDouble(sueldoBasicoStr);

        // Solicitar el número de hijos
        String numeroHijosStr = JOptionPane.showInputDialog(null, "Ingrese el número de hijos:");
        int numeroHijos = Integer.parseInt(numeroHijosStr);

        // Solicitar el cargo
        String cargoStr = JOptionPane.showInputDialog(null, "Ingrese el cargo (O para Obrero, E para Empleado):");
        char cargo = cargoStr.charAt(0);

        // Inicializar las variables de bonificación y asignación
        double bonificacion = 0;
        double asignacionPorHijo = 41;
        double totalAsignacion = numeroHijos * asignacionPorHijo;

        // Calcular la bonificación según el cargo
        if (cargo == 'O' || cargo == 'o') {
            bonificacion = 100;
        } else if (cargo == 'E' || cargo == 'e') {
            bonificacion = 120;
        } else {
            JOptionPane.showMessageDialog(null, "Cargo no válido. Ingrese 'O' para Obrero o 'E' para Empleado.");
            return;
        }

        // Calcular el total de la remuneración
        double remuneracionTotal = sueldoBasico + bonificacion + totalAsignacion;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Remuneración total: " + remuneracionTotal);
    }
}
