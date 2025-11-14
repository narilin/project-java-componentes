public class RegistroVehicular {

    // Atributos
    private String matricula;
    private String propietario;
    private String fechaRegistro;

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha de registro: " + fechaRegistro);
    }
}
