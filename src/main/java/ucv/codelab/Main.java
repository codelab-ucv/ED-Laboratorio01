package ucv.codelab;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String respuesta = JOptionPane.showInputDialog(null, """
                INGRESE EL EJERCICIO A EJECUTAR
                ================================
                Ejercicio01  [ 1 ]
                Ejercicio02  [ 2 ]
                Ejercicio03  [ 3 ]
                Ejercicio04  [ 4 ]
                Ejercicio05  [ 5 ]
                """, "Laboratorio01", 3);
        int opcion = Integer.parseInt(respuesta);
        switch (opcion) {
            case 1:
                Ejercicio01.iniciar();
                break;
            case 2:
                Ejercicio02.iniciar();
                break;
            case 3:
                Ejercicio03.iniciar();
                break;
            case 4:
                Ejercicio04.iniciar();
                break;
            case 5:
                Ejercicio05.iniciar();
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado.\nAdios.");

    }
}