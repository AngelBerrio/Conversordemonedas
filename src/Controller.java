public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Control de la lógica de conversión de divisas - Angel Berrio
    public void convertirDivisas() {
        String[] monedas = {"Peso Colombiano", "Dólar (USD)", "Euro (EUR)", "Libra (GBP)", "Yen (JPY)", "Won (KRW)"};
        String desde = view.mostrarMenu(monedas);
        String hacia = view.mostrarMenu(monedas);

        double cantidad = view.solicitarCantidad();
        double resultado = model.realizarConversionDivisa(desde, hacia, cantidad);
        view.mostrarResultado(resultado, hacia);
    }

    // Control de la lógica de conversión de unidades - Angel Berrio
    public void convertirUnidades() {
        String[] unidades = {"Centímetros a Pulgadas", "Kilómetros a Millas", "Hectáreas a Acres", "Litros a Galones", "Gramos a Onzas", "Kilogramos a Libras"};
        String eleccion = view.mostrarMenu(unidades);

        double cantidad = view.solicitarCantidad();
        double resultado = model.realizarConversionUnidades(eleccion, cantidad);
        view.mostrarResultado(resultado, "");
    }
}
