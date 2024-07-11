public class Estudiante {
    String nombre;
    String cedula;
    double b1;
    double b2;

    public Estudiante() {
    }

    public Estudiante(String nombre, String cedula, double b1, double b2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.b1 = b1;
        this.b2 = b2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }
}
