package repaso;
class Espectador {
    String nombre;
    int edad;
    float dinero; 

    public Espectador() {
    }

    public Espectador(String nombre, int edad, float dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
}
