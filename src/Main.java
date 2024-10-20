public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        String[] opciones = {"Divisas", "Unidades"};
        String eleccion = view.mostrarMenu(opciones);

        if (eleccion != null) {
            switch (eleccion) {
                case "Divisas":
                    controller.convertirDivisas();
                    break;
                case "Unidades":
                    controller.convertirUnidades();
                    break;
            }
        }
    }
}
