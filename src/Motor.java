public class Motor {

    // Atributos
    private String tipo;
    private double cilindrada;
    private int potencia;

    // Constructor
    public Motor(String tipo, double cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada + " L");
        System.out.println("Potencia: " + potencia + " HP");
    }
}
