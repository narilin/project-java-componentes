public class Chasis {

    // Atributos
    private String tipo;
    private String dimensiones;
    private double peso;

    // Constructor
    public Chasis(String tipo, String dimensiones, double peso) {
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Tipo de chasis: " + tipo);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Peso: " + peso + " kg");
    }
}
