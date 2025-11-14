public class Vehiculo {

    // Atributos
    private String identificacion;
    private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Vehiculo(String identificacion, String marca, String modelo, int año) {
        this.identificacion = identificacion;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + año);
    }
}
