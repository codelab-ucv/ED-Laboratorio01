package ucv.codelab;
import javax.swing.JOptionPane;
public class Ejercicio03 {
 // Método iniciar
    public static void iniciar() {
        // Ingresar el nombre del obrero
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del obrero:");

        // Ingresar las horas trabajadas
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas:"));

        // Ingresar el tipo de actividad
        int tipoActividad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de actividad (1: Pintado, 2: Laqueado, 3: Barnizado):"));

        // Definir el pago por hora según el tipo de actividad
        double pagoPorHora = 0;
        switch (tipoActividad) {
            case 1:
                pagoPorHora = 10; // Pintado
                break;
            case 2:
                pagoPorHora = 12; // Laqueado
                break;
            case 3:
                pagoPorHora = 14; // Barnizado
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de actividad no válido.");
                return;
        }

        // Calcular las horas extras
        int horasExtras = 0;
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            horasTrabajadas = 40;
        }

        // Calcular el jornal
        double jornalSemanal = horasTrabajadas * pagoPorHora;

        // Calcular el jornal extra (30% más por cada hora extra)
        double jornalExtra = horasExtras * pagoPorHora * 1.30;

        // Calcular el total del jornal
        double totalJornal = jornalSemanal + jornalExtra;

        // Mostrar los resultados en ventanas emergentes
        JOptionPane.showMessageDialog(null, "Jornal Semanal de " + nombre + ": S/ " + jornalSemanal);
        JOptionPane.showMessageDialog(null, "Jornal Extra de " + nombre + ": S/ " + jornalExtra);
        JOptionPane.showMessageDialog(null, "Total del Jornal de " + nombre + ": S/ " + totalJornal);
    }
}
