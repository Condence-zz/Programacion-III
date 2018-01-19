package repaso;

import java.util.Random;
import java.util.Scanner;

public class Repaso {
    private static Espectador[] espectador; 
    private static Pelicula[] pelicula; 
    private static Sala[] sala; 
     
    public static void main(String[] args) { 
        espectador = new Espectador[72];
        sala = new Sala[72]; 
        pelicula = new Pelicula[5];
         
        pelicula[0] = new Pelicula("La forma del agua", "Guillermo del Toro", 120, 18,65); 
        
        inicializar();
        desplegarMenu();
         
    }    
    public static void desplegarMenu(){
        Scanner tec = new Scanner(System.in);
        System.out.println("1. Agregar Espectador.");
        System.out.println("2. Imprimir lista espectadores.");  
        System.out.println("3. Ver sala."); 
        System.out.println("4. Terminar");

        System.out.print("\n Teclee su opción: ");
        int Opcion = tec.nextInt(); 
        switch (Opcion) {
            case 1:  agregarEspectador();
                     break;
            case 2:  imprimirEspectadores();
                     break;  
            case 3:  verSala();
                     break; 
            case 4:   
                     break; 
            default: System.out.println("Opción no válida, ingrese una del 1 al 4.");
                     break;
        }
    }
    public static void agregarEspectador(){
        Scanner tec = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = tec.next();
        System.out.print("Edad: ");
        int edad = tec.nextInt();
        System.out.print("Dinero disponible: ");
        float dinero = tec.nextFloat(); 
        Random generator = new Random(); 
        int pos = 1+generator.nextInt(72); 
        espectador[pos]=new Espectador(nombre,edad,dinero);
        int upos = pos; 
        
        if (disponibilidad(pos)) {
            if (espectador[upos].getEdad() >= pelicula[0].getEdad_min()
                    && espectador[upos].getDinero()>= pelicula[0].getCosto()) {
                sala[pos].setEsp(espectador[upos]);
                sala[pos].setPel(pelicula[0]);  
                desplegarMenu(); 
            } else {
                System.out.println("No tiene dinero o la edad suficiente");
                desplegarMenu(); 
            }
        } else {
            pos = 1+generator.nextInt(72);
            desplegarMenu();
        } 
    }
    public static void imprimirEspectadores(){
        for (int i = 0; i < 72; i++) {
            if (espectador[i] != null) {
                System.out.println(espectador[i]);
            } 
        }
        desplegarMenu();
    } 
    public static void verSala(){
        for (int i = 0; i < 72; i++) {
            System.out.println(sala[i]);
        }
        desplegarMenu();
    }
    public static Sala[] inicializar(){  
        int c = 0; 
        for (int i = 65; i < 75; i++) {
            for (int j = 1; j < 9; j++) {
                if (c< sala.length) {  
                    sala[c] = new Sala(j,(char)i,null,null);
                    c++;
                }  
            }
        } 
        return sala;
    }
    public static boolean disponibilidad(int pos){
        for (int i = 0; i < sala.length; i++) { 
            if (sala[i].getEsp()== null) {
                return true;
            } else { 
                return false;

            } 
        } 
        return true;
    }
}
