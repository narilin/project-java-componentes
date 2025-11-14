public class Neumatico {

    // Atributos
    private String marca;
    private String tamaño;
    private double presion;

    // Constructor
    public Neumatico(String marca, String tamaño, double presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Tamano: " + tamaño);
        System.out.println("Presion: " + presion + " PSI");
    }
}
