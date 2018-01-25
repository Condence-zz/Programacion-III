package alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alumno { 
    public static void main(String[] args) {
       List<Alumnos> alumno = new ArrayList();
        System.out.println("----------------------------------------------");
        System.out.println("Agrego 3 personas a la lista");
        System.out.println("----------------------------------------------");
       alumno.add(new Alumnos("Julio Ivan","Garcia Vega",21,"0000548936"));
       alumno.add(new Alumnos("Jesus Manuel","Nava",22,"000054365"));
       alumno.add(new Alumnos("Eduardo","Martinez",21,"00000853256"));
       String elemento;
       Iterator<Alumnos> iterador = alumno.iterator();
        while (iterador.hasNext()) { 
            elemento = iterador.next().toString();
            System.out.println(elemento);
        }
        alumno.remove(1);
        System.out.println("----------------------------------------------");
        System.out.println("Remuevo el numero uno de la lista....");
        System.out.println("----------------------------------------------");
        iterador = alumno.iterator();
        while (iterador.hasNext()) { 
            elemento = iterador.next().toString();
            System.out.println(elemento);
        }
    }
    
}
