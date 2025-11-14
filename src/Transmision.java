public class Transmision {

    // Atributos
    private String tipo;
    private int marchas;
    private String traccion;

    // Constructor
    public Transmision(String tipo, int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de marchas: " + marchas);
        System.out.println("Traccion: " + traccion);
    }
}
