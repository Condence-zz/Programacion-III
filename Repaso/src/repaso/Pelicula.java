package repaso;
class Pelicula {
    String titulo, director;
    int duracion,edad_min; 
    float costo;
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int edad_min, float costo) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edad_min = edad_min;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad_min() {
        return edad_min;
    }

    public void setEdad_min(int edad_min) {
        this.edad_min = edad_min;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edad_min=" + edad_min + '}';
    }
    
}
