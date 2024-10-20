public class Model {

    // Método para convertir divisas - Angel Berrio
    public double realizarConversionDivisa(String desde, String hacia, double cantidad) {
        double tasaCambio = obtenerTasaCambio(desde, hacia);
        return cantidad * tasaCambio;
    }

    // Tasas de cambio simuladas - Angel Berrio
    private double obtenerTasaCambio(String desde, String hacia) {
        if (desde.equals("Peso Colombiano") && hacia.equals("Dólar (USD)")) return 0.00025;
        if (desde.equals("Dólar (USD)") && hacia.equals("Peso Colombiano")) return 4000;
        if (desde.equals("Peso Colombiano") && hacia.equals("Euro (EUR)")) return 0.00022;
        if (desde.equals("Euro (EUR)") && hacia.equals("Peso Colombiano")) return 4500;
        return 1; // Tasa por defecto
    }

    // Conversión de unidades de medida - Angel Berrio
    public double realizarConversionUnidades(String eleccion, double cantidad) {
        switch (eleccion) {
            case "Centímetros a Pulgadas":
                return cantidad * 0.393701;
            case "Kilómetros a Millas":
                return cantidad * 0.621371;
            case "Hectáreas a Acres":
                return cantidad * 2.47105;
            case "Litros a Galones":
                return cantidad * 0.264172;
            case "Gramos a Onzas":
                return cantidad * 0.035274;
            case "Kilogramos a Libras":
                return cantidad * 2.20462;
            default:
                return cantidad;
        }
    }
}
