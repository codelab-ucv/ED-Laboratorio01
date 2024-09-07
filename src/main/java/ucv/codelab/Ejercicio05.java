package ucv.codelab;

import javax.swing.JOptionPane;

public class Ejercicio05 {

    public static void iniciar() {

        int marca = getInt("Ingrese la marca");
        int talla = getInt("Ingrese la talla");

        int precioBase;

        if (talla > 3 || talla < 1)
            return;

        switch (marca) {
            case 1:
                if (talla == 1)
                    precioBase = 150;
                else
                    precioBase = 160;
                break;
            case 2:
                if (talla == 1)
                    precioBase = 140;
                else
                    precioBase = 150;
                break;
            case 3:
                if (talla == 1)
                    precioBase = 80;
                else if (talla == 2)
                    precioBase = 85;
                else
                    precioBase = 90;
                break;
            default:
                return;
        }
        
    }

    /**
     * Devuelve el descuento aplicado en funcion a las ventas realizadas
     * 
     * @param ventas Cantidad de pares de zapatillas vendidos
     */
    private static double descuento(int ventas) {
        if (ventas < 2)
            return 0;
        if (ventas <= 5)
            return 0.05;
        if (ventas <= 10)
            return 0.08;
        if (ventas <= 20)
            return 0.1;
        return 0.15;
    }

    private static int getInt(String mensaje) {
        String opcion = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(opcion);
    }
}
