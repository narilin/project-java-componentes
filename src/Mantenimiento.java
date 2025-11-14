public class Mantenimiento {

    // Atributos
    private String tipoServicio;
    private String fechaRealizado;
    private String proximoServicio;

    // Constructor
    public Mantenimiento(String tipoServicio, String fechaRealizado, String proximoServicio) {
        this.tipoServicio = tipoServicio;
        this.fechaRealizado = fechaRealizado;
        this.proximoServicio = proximoServicio;
    }

    // Método para mostrar la información
    public void displayInfo() {
        System.out.println("Tipo de servicio: " + tipoServicio);
        System.out.println("Fecha realizado: " + fechaRealizado);
        System.out.println("Proximo servicio: " + proximoServicio);
    }
}
