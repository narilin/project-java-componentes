public class SistemaElectrico {

    // Atributos
    private String bateria;
    private String luces;
    private String sensores;

    // Constructor
    public SistemaElectrico(String bateria, String luces, String sensores) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Bateria: " + bateria);
        System.out.println("Luces: " + luces);
        System.out.println("Sensores: " + sensores);
    }
}
