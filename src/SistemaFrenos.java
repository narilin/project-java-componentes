public class SistemaFrenos {

    // Atributos
    private String tipo;
    private String discos;
    private boolean abs;
    private String estado;

    // Constructor
    public SistemaFrenos(String tipo, String discos, boolean abs, String estado) {
        this.tipo = tipo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Tipo de frenos: " + tipo);
        System.out.println("Discos: " + discos);
        System.out.println("ABS: " + (abs ? "Si" : "No"));
        System.out.println("Estado: " + estado);
    }
}
