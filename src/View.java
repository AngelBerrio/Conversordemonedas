import javax.swing.*;

public class View {

    // Método para mostrar menú - Angel Berrio
    public String mostrarMenu(String[] opciones) {
        return (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    }

    // Solicitar cantidad al usuario - Angel Berrio
    public double solicitarCantidad() {
        String cantidadString = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
        return Double.parseDouble(cantidadString);
    }

    // Mostrar el resultado - Angel Berrio
    public void mostrarResultado(double resultado, String unidad) {
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " " + unidad);
    }
}
