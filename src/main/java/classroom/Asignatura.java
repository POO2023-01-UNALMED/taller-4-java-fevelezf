package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public short codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
    }

    public Asignatura(short codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno, 0,tipo);
    }

    public Asignatura(int codigoExterno,Tipo tipo) {
        this("Sin nombre", (short) 0, codigoExterno,tipo);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, (short) 0, 0,tipo);
    }

    public Asignatura(String nombre, short codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(short codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = (short) codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (short) codigoInterno;
    }
}
