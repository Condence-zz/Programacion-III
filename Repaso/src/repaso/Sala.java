package repaso;
public class Sala {
    int fila;
    char columna;
    Pelicula pel;
    Espectador esp;

    public Sala(Pelicula pel, Espectador esp) {
        this.pel = pel;
        this.esp = esp;
    }
    
    public Sala(int fila, char columna, Pelicula pel, Espectador esp) {
        this.fila = fila;
        this.columna = columna;
        this.pel = pel;
        this.esp = esp;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public Pelicula getPel() {
        return pel;
    }

    public void setPel(Pelicula pel) {
        this.pel = pel;
    }

    public Espectador getEsp() {
        return esp;
    }

    public void setEsp(Espectador esp) {
        this.esp = esp;
    }

    @Override
    public String toString() {
        return "Sala{" + "fila=" + fila + ", columna=" + columna + ", pel=" + pel + ", esp=" + esp + '}';
    }
    
}
