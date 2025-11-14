public class MainSistemaFrenos {
    public static void main(String[] args) {

        // Crear un sistema de frenos de prueba
        SistemaFrenos frenos = new SistemaFrenos("Hidraulicos", "Discos ventilados", true, "En buen estado");

        // Mostrar la información
        frenos.displayInfo();
    }
}
