package ucv.codelab;
import javax.swing.JOptionPane;
public class Ejercicio04 {
 // Método iniciar
    public static void iniciar() {
         // Solicitar el ingreso del sueldo básico y el cargo
         String sueldoBasicoStr = JOptionPane.showInputDialog("Ingrese el sueldo básico:");
         String cargo = JOptionPane.showInputDialog("Ingrese el cargo del trabajador (O para Obrero, E para Empleado, J para Ejecutivo):");
 
         // Convertir el sueldo básico a número
         double sueldoBasico = Double.parseDouble(sueldoBasicoStr);
         double bonificacion = 0, asignacion = 0, refrigerio = 0;
 
         // Calcular los beneficios según el cargo
         if (cargo.equalsIgnoreCase("O")) {
             bonificacion = 100;
             asignacion = 120;
         } else if (cargo.equalsIgnoreCase("E")) {
             bonificacion = 120;
             asignacion = 150;
             refrigerio = 200;
         } else if (cargo.equalsIgnoreCase("J")) {
             bonificacion = 250;
             asignacion = 500;
             refrigerio = 250;
         } else {
             JOptionPane.showMessageDialog(null, "Cargo no válido.");
             System.exit(0);
         }
 
         // Calcular el total de los ingresos
         double total = sueldoBasico + bonificacion + asignacion + refrigerio;
 
         // Mostrar el resultado
         JOptionPane.showMessageDialog(null, "Total de ingresos: " + total);
     }
}
