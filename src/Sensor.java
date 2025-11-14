public class Sensor {

    // Atributos
    private String tipo;
    private double valor;
    private String unidad;

    // Constructor
    public Sensor(String tipo, double valor, String unidad) {
        this.tipo = tipo;
        this.valor = valor;
        this.unidad = unidad;
    }

    // Método para mostrar la información
    public void displayInfo() {

        System.out.println("Tipo de sensor: " + tipo);
        System.out.println("Valor actual: " + valor + " " + unidad);
    }
}
