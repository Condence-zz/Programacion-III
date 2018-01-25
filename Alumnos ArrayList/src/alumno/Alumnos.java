package alumno;
class Alumnos {
    private String nombre, apellido,Id;
    private int Edad;

     

    public Alumnos(String nombre, String apellido, int Edad, String Id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Edad = Edad;
        this.Id = Id;
    }

    public Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", Edad=" + Edad + ", Id=" + Id + '}';
    }
}
