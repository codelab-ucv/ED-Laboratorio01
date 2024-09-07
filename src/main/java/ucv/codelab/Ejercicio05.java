package ucv.codelab;

import javax.swing.JOptionPane;

public class Ejercicio05 {

    public static void iniciar() {
        // Nike, Adidas, Fila
        int[][] precios = { { 150, 160, 150 },
                { 140, 150, 150 },
                { 80, 85, 90 } };

        int marca = getInt("""
                Seleccione la marca
                =====================
                Nike       [ 1 ]
                Adidas     [ 2 ]
                Fila       [ 3 ]
                """, 3);
        int talla = getInt("""
                Seleccione la talla
                =====================
                Talla 38   [ 1 ]
                Talla 40   [ 2 ]
                Talla 42   [ 3 ]
                """, 3);

        // El limite es el stock
        int ventas = getInt("Ingrese los pares a comprar", 50);

        int precioBruto = precios[marca - 1][talla - 1] * ventas;

        double descuentoAplicado = precioBruto * descuento(ventas);
        double precioNeto = precioBruto - descuentoAplicado;

        JOptionPane.showMessageDialog(null, "Pares vendidos: " + ventas
                + "\nPrecio bruto: " + precioBruto
                + "\nDescuento: " + descuentoAplicado
                + "\nPrecio neto: " + precioNeto);
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

    /**
     * Obtiene un numero ingresado por el usuario
     * 
     * @param mensaje   Mensaje a enviar
     * @param maxOption Numero maximo
     * @return Numero ingresado
     */
    private static int getInt(String mensaje, int maxOption) {
        try {
            String opcion = JOptionPane.showInputDialog(null, mensaje, "Laboratorio01", 3);

            // Finaliza si se coloca Cancelar
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Programa finalizado.\nAdios.");
                System.exit(1);
                return 0;
            }

            int seleccion = Integer.parseInt(opcion);
            if (seleccion > maxOption || seleccion < 1) {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion entre 1 y " + maxOption, "Numero inválido", 0);
                return getInt(mensaje, maxOption);
            }
            return seleccion;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Numero inválido", 0);
            return getInt(mensaje, maxOption);
        }
    }
}
